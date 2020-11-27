package S1121DataOperate;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import S1120CURD.S1Employee;
@Controller
@RequestMapping("/dataOperate")
public class S5DataOperateHandler {
	//数据类型转换
	@RequestMapping("/dataConverter")
	public String dataConverter(@RequestParam("emps")S1Employee employee){
		System.out.println("dataConverter:"+employee);
		return "S1121dataOperate/S3dataConverterSuccess";
	}
	//数据格式化
	@RequestMapping("/dataFormat")
	public String dataFormat(S1Employee employee,Map<String,Object> map){
		System.out.print("dataFormat:"+employee);
		map.put("employee", employee);
		return "S1121dataOperate/S4dataFormat";
	}
	//数据效验
	@RequestMapping("/dataValidate")
	public String dataValidate(@Valid S1Employee employee,Errors errors,HttpServletRequest request){
		System.out.println("dataValidate:"+employee);
		System.out.println("ss:"+errors.getErrorCount());
		request.setAttribute("employee", employee);
		if(errors.getErrorCount()>0){
			for(FieldError fieldError:errors.getFieldErrors()){
				System.out.println(fieldError.getField()+"---"+fieldError.getDefaultMessage());
			}
		}
		return "S1121dataOperate/S6dataValidateError"; 
	}
	//文件上传
	@RequestMapping("/fileUpload")
	public String fileUpload(@RequestParam("file")MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException{
		System.out.println("fileUpload:"+file);
		if(!file.isEmpty()){
			System.out.println("name:"+file.getName());
			System.out.println("size:"+file.getSize());
			System.out.println("ContentType:"+file.getContentType());
			System.out.println("OriginalFilename:"+file.getOriginalFilename());
			String realPath=request.getRealPath("/");//上下文的绝对路径
			System.out.println("realPath:"+realPath);
			System.out.println("file.getName():"+realPath+"/"+"upload"+"/"+file.getOriginalFilename());
			
			file.transferTo(new File(realPath+"upload"+"/"+file.getOriginalFilename()));
		}
		return "S1121dataOperate/S8fileUploadSuccess";
	}
	//同时上传多个文件
	//文件上传
		@RequestMapping("/manyFileUpload")
		public String manyFileUpload(@RequestParam("file")MultipartFile[] files,HttpServletRequest request) throws IllegalStateException, IOException{
			System.out.println("fileUpload:"+files.length);
			if(files.length>0){
				for(MultipartFile file:files){
				System.out.println("name:"+file.getName());
				System.out.println("size:"+file.getSize());
				System.out.println("ContentType:"+file.getContentType());
				System.out.println("OriginalFilename:"+file.getOriginalFilename());
				String realPath=request.getRealPath("/");//上下文的绝对路径
				System.out.println("realPath:"+realPath);
				System.out.println("file.getName():"+realPath+"/"+"upload"+"/"+file.getOriginalFilename());
				
				file.transferTo(new File(realPath+"upload"+"/"+file.getOriginalFilename()));
			}}
			return "S1121dataOperate/S8fileUploadSuccess";
		}
}
