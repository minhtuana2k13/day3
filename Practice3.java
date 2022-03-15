package day3;

public class Practice3 {

	public static void main(String[] args) {
		// CAU 1
		int sum = 9;
		kiemTra(sum);

		// CAU 2
		int a = 1;
		int b = 4;
		int c = 10;
		soLonNhat(a, b, c);

		// CAU 3
		int sN = 99;
		kiemTra2(sN);

		// CAU 4
		int luongCoBan = 650000;
		int thangCT = 50;
		float heSo = TNCT(thangCT);
		float luong = heSo * luongCoBan;
		System.out.println("luong =" + luong);

		// CAU 5
		int numA = 2;
		int numB = 4;
		giaiPhuongTrinh(numA, numB);

		// CAU 6
		int thang = 5;
		int nam = 2018;
		kiemTraThang(nam, thang);
	}

	public static float TNCT(int a) {
		float TNCT = 0f;
		if (a < 12) {
			TNCT = 1.92f;
		} else if (a >= 12 && a < 36) {
			TNCT = 2.34f;
		} else if (a >= 36 && a < 60) {
			TNCT = 3.0f;
		} else {
			TNCT = 4.5f;
		}
		return TNCT;

	}

	public static void kiemTra(int a) {
		if (a % 2 == 0) {
			System.out.println("day la so chan");
		} else {
			System.out.println("day la so le");
		}
	}

	public static void soLonNhat(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("so lon nhat la : " + a);
		} else if (b > a && b > c) {
			System.out.println("so lon nhat la : " + b);
		} else {
			System.out.println("so lon nhat la : " + c);
		}
	}

	public static void kiemTra2(int a) {
		if (a >= 10 && a <= 100) {
			System.out.println(a + " nằm trong khoảng 10 đến 100");
		} else {
			System.out.println(a + " khong nằm trong khoảng 10 đến 100");
		}
	}

	public static void giaiPhuongTrinh(int a, int b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo so nghiem");
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
		} else {
			int x = -b / a;
			System.out.println("nghiem = " + x);
		}
	}

	public static void kiemTraThang(int nam, int thang) {
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("thang co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("thang co 30 ngay");
			break;
		case 2:
			if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
				System.out.println("thang co 29 ngay");
			} else {
				System.out.println("thang co 29 ngay");
			}
			break;
		default:
			System.out.println("khong co thang nay");

		}
	}
}
