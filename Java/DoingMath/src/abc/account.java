package abc;

public class account {
	private String name;
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public account(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

//tạo 1 đối tương acc có name  và age. tạo 1 mảng có chưa 5 acc. sắp xếp các acc theo  tuổi giảm dần
