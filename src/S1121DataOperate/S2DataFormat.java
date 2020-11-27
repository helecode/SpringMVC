package S1121DataOperate;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class S2DataFormat  {
	private int id;
	private String name;
	@Email
	private String email;
	@Past
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date date;
	@NumberFormat(style=Style.NUMBER,pattern="#,###,##")
	private int total;
	@NumberFormat(style=Style.PERCENT)
	private double discount;
	@NumberFormat(style=Style.CURRENCY)
	private double money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		return "S2DataFormat [id=" + id + ", name=" + name + ", email=" + email
				+ ", date=" + date + ", total=" + total + ", discount="
				+ discount + ", money=" + money + "]";
	}
	
}
