package S1119SpringMVCREST;

public class S3UserPojo {
	private int uid;
	private String uname;
	private int uage;
	private char usex;
	private S4AddressPojo uaddress;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public char getUsex() {
		return usex;
	}
	public void setUsex(char usex) {
		this.usex = usex;
	}
	public S4AddressPojo getUaddress() {
		return uaddress;
	}
	public void setUaddress(S4AddressPojo uaddress) {
		this.uaddress = uaddress;
	}
	public S3UserPojo(int uid, String uname, int uage, char usex,
			S4AddressPojo uaddress) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.usex = usex;
		this.uaddress = uaddress;
	}
	@Override
	public String toString() {
		return "T03UserPojo [uid=" + uid + ", uname=" + uname + ", uage="
				+ uage + ", usex=" + usex + ", uaddress=" + uaddress + "]";
	}
	public S3UserPojo() {
	}
	
}
