package QLCB;

public class employee extends Users {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public employee(String name, byte age, String address, String congViec) {
		super(name, age, address);
		this.congViec = congViec;
	}

}
