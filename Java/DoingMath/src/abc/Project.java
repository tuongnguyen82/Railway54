package abc;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("Mr. A	", 20);
		Account a2 = new Account("Mr. B	", 22);
		Account a3 = new Account("Mr. C	", 24);
		Account a4 = new Account("Mr. D	", 31);
		Account a5 = new Account("Mr. E	", 40);

		Account[] allAccounts = { a1, a2, a3, a4, a5 };

	}

	public void orderByAccending() {
		// Scanner scanner = new Scanner(System.in);

//		int a = giaiThua(4);

//		System.out.println("Nhap vao so phan tu cua mang ");
//		int n = scanner.nextInt();
//
//		int a[] = new int[n];
//
//		// nhap vao
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("Nhập vao a[" + i + "] = ");
//			a[i] = scanner.nextInt();
//		}

		System.out.println("trc khi sap xep");

		for (int i = 0; i < allAccounts.length; i++) {
			System.out.print(a[i] + "  ");

		}
		System.out.println();

		// System.out.println("sau khi doi cho " + a[0] + " " + a[1]);
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tg = 0;
					tg = a[i];// 1
					a[i] = a[j];// a0= 4
					a[j] = tg;

				}
			}
		}

		System.out.println("sau khi sap xep");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}
	}

}
