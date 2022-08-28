package TestingSystem_Assignment_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Exercise 2 (Optional): System out printf*/

public class Exercise_2 {

//	Question 1: 
//	Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số 
//	nguyên đó
	public void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number: ");
		Integer s1 = scanner.nextInt();
		System.out.println("Input :" + s1);
		System.out.println();
		scanner.close();
	}

//	Question 2: 
//	Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in 
//	ra số nguyên đó thành định dạng như sau: 100,000,000
	public void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number: ");
		Integer s1 = scanner.nextInt();
		System.out.printf("%,d %n", s1);
		// System.out.println();
		scanner.close();
	}

//	Question 3: 
//		Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số 
//		thực đó chỉ bao gồm 4 số đằng sau

	public void question3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number: ");
		Double s1 = scanner.nextDouble();
		System.out.printf("%5.4f %n", s1);
		// System.out.println();
		scanner.close();
	}

//	Question 4: 
//		Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định 
//		dạng như sau:
//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau: 
//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
	public void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your name: ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		String s3 = scanner.next();
		System.out.printf("Tên tôi là " + s1 + " " + s2 + " " + s3 + " và tôi đang độc thân.");
		// System.out.println();
		scanner.close();
	}

//	Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau:
//		24/04/2020 11h:16p:20s 

	public void question5() {
		String patternString = "MM/dd/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternString);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

	}

//	Question 6:
//		In ra thông tin account (như Question 8 phần FOREACH) theo định dạng 
//		table (giống trong Database)

	public void question6(Account[] x) {
		System.out.printf("%10s %25s %27s", "Email ", "Full name ", "Phòng ban");
		// s is string, d is number
		System.out.println();
		for (int i = 0; i < x.length; i++) {

			System.out.printf("%10s %20s %21s", x[i].getEmail(), x[i].getName(), x[i].getDepartment().getID());
			System.out.println();
		}

	}

}
