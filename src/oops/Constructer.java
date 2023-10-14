package oops;

public class Constructer {
	private String customername;
	private int custid;
	private String custcity;
	public Constructer() {
		System.out.println("simple constructer");
	}
	public Constructer(String customername, int custid, String custcity) {
		System.out.println("parameterised constructer");
		this.customername = customername;
		this.custid = custid;
		this.custcity = custcity;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustcity() {
		return custcity;
	}
	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}
	@Override
	public String toString() {
		return "Constructer [customername=" + customername + ", custid=" + custid + ", custcity=" + custcity + "]";
	}
	
	
	

}
