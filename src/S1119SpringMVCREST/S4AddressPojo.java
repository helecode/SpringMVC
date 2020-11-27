package S1119SpringMVCREST;

public class S4AddressPojo {
	private String province;
	private String city;
	private String Street;
	private String village;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public S4AddressPojo(String province, String city, String street,
			String village) {
		super();
		this.province = province;
		this.city = city;
		Street = street;
		this.village = village;
	}
	@Override
	public String toString() {
		return "T04AddressPojo [province=" + province + ", city=" + city
				+ ", Street=" + Street + ", village=" + village + "]";
	}
	public S4AddressPojo() {
	}
	
}
