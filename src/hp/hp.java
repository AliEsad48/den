package hp;

import java.util.Scanner;

public class hp {

	public static void main(String[] args) {

		hesapMakinesi();

	}

	private static void hesapMakinesi() {

		Scanner scan = new Scanner(System.in);

		int sonuc = 1;
		int sonu = 0;
		String sayi="";

		System.out.println(
				"Hesap Makinesine Ho�geldiniz\nToplama yapmak i�in + yaz�n�z\n��karma yapmak i�in - yaz�n�z\n�arpma yapmak i�in * yaz�n�z\nB�lme yapmak i�in / yaz�n�z");

		char islem = scan.next().charAt(0);

		if (islem == '+') {
			do {
				System.out.print("��lemi bitirmek i�in = yaz�n�z\nL�tfen toplamak i�in bir say� giriniz :");

				sayi = scan.next();

				if (!sayi.equalsIgnoreCase("=")) {

					sonuc += Integer.parseInt(sayi);

				}

			} while (!sayi.equalsIgnoreCase("="));

			System.out.println("Girilen say�lar�n toplma� :" + sonuc);
		} else if (islem == '-') {

			System.out.print("L�tfen ��karmak i�in iki say� giriniz :");

			sayi = scan.next();
			String sayi2 = scan.next();

			sonuc = Integer.parseInt(sayi) - Integer.parseInt(sayi2);

			System.out.println("Girilen say�lar�n fark� :" + sonuc);
		}else if (islem == '*') {
			do {
				System.out.print("��lemi bitirmek i�in = yaz�n�z\nL�tfen �arpmak i�in bir say� giriniz :");

				sayi = scan.next();

				if (!sayi.equalsIgnoreCase("=")) {

					sonuc *= Integer.parseInt(sayi);

				}

			} while (!sayi.equalsIgnoreCase("="));

			System.out.println("Girilen say�lar�n �arp�m� :" + sonuc);
		} else if (islem == '-') {

			System.out.print("L�tfen b�lmek i�in iki say� giriniz :");

			sayi = scan.next();
			int sayi2 = scan.nextInt();

			sonuc = Integer.parseInt(sayi) / sayi2;

			System.out.println("Girilen say�lar�n b�l�m� :" + sonuc);
		}else {
			
			System.out.println("Hatal� sembol girdiniz l�tfen yeniden embol giriniz");
			
			hesapMakinesi();
			
		}

}}
