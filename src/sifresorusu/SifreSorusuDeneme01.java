package sifresorusu;

import java.util.Scanner;

public class SifreSorusuDeneme01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Lütfen þifrenizi giriniz :");

		String sifre = scan.next();
		int kucukHarfKontrol = kucukHarfKontrol(sifre);

		int buyukHarfKontrol = buyukHarfKontrol(sifre);

		int uzunlukKontrol = sifre.length();

		int ozelKarakterKontrol = ozelKarakterKontrol(sifre);

		while (buyukHarfKontrol == 0 || kucukHarfKontrol == 0 || uzunlukKontrol < 8 || ozelKarakterKontrol == 0) {

			System.out.print("Hatalý þifre girdiniz \nLütfen þifrenizi giriniz :");

			sifre = scan.next();
			kucukHarfKontrol = kucukHarfKontrol(sifre);

			buyukHarfKontrol = buyukHarfKontrol(sifre);

			uzunlukKontrol = sifre.length();

			ozelKarakterKontrol = ozelKarakterKontrol(sifre);

		}
		
		System.out.println("Þifreniz kabul edilmiþtir");

	}

	private static int ozelKarakterKontrol(String sifre) {

		int count = 0;

		for (int i = 0; i < sifre.length(); i++) {

			if (sifre.charAt(i) >= '!' && sifre.charAt(i) <= '/') {

				count++;

			} else if (sifre.charAt(i) >= ':' && sifre.charAt(i) <= '@') {

				count++;

			} else if (sifre.charAt(i) >= '[' && sifre.charAt(i) <= '_') {

				count++;

			} else if (sifre.charAt(i) >= '{' && sifre.charAt(i) <= '}') {

				count++;

			}

		}

		if (count > 0) {

			return 1;

		} else {

			return 0;

		}

	}

	private static int buyukHarfKontrol(String sifre) {

		int count = 0;

		for (int i = 0; i < sifre.length(); i++) {

			if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {

				count++;

			}

		}

		if (count > 0) {

			return 1;

		} else {

			return 0;

		}

	}

	private static int kucukHarfKontrol(String sifre) {

		int count = 0;

		for (int i = 0; i < sifre.length(); i++) {

			if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {

				count++;

			}

		}

		if (count > 0) {

			return 1;

		} else {

			return 0;

		}

	}

}
