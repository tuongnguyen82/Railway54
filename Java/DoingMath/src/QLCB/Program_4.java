package QLCB;

import java.util.Scanner;

public class Program_4 {
	// Question 1: inheritance
	// Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
	// Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
	// khác), địa chỉ.
	// Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
	// Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
	// Các nhân viên có thuộc tính riêng: công việc.
	// Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp
	// CanBo.

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select from the following options: ");
		System.out.println("1) Add user");
		System.out.println("2) Search user");
		System.out.println("3) Show all users");
		System.out.println("4) Delete user");
		byte option = sc.nextByte();

		switch (option) {
		case 1: {
			addUser();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

	}

	public void addUser() {
	}

	public void searchName() {
	}

	public void showUser() {
	}

	public void deleteUser() {
	}

}

//Question 2: Tiếp tục Question 1
//Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực 
//hiện các chức năng sau:
//a) Thêm mới cán bộ.
//b) Tìm kiếm theo họ tên.
//c) Hiện thị thông tin về danh sách các cán bộ.
//d) Nhập vào tên của cán bộ và delete cán bộ đó
//e) Thoát khỏi chương trình.