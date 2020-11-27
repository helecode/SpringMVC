package S1120CURD;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;


public class S1Employee {
	private Integer id;
	private String lastName;
	@Email
	private String email;
	private Integer gender;
	private S2Department department;
	@Past
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	@NumberFormat(style=Style.NUMBER,pattern="#,###,##")
	private int total;
	@NumberFormat(style=Style.PERCENT)
	private double discount;
	@NumberFormat(style=Style.CURRENCY)
	private double money;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public S2Department getDepartment() {
		return department;
	}

	public void setDepartment(S2Department department) {
		this.department = department;
	}

	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	

	

	@Override
	public String toString() {
		return "T01Employee [id=" + id + ", lastName=" + lastName + ", email="
				+ email + ", gender=" + gender + ", department=" + department
				+ ", date=" + date + ", total=" + total + ", discount="
				+ discount + ", money=" + money + "]";
	}

	public S1Employee(Integer id, String lastName, String email,
			Integer gender, S2Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}

	public S1Employee() {
	
	}
}
