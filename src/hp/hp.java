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
				"Hesap Makinesine Hoþgeldiniz\nToplama yapmak için + yazýnýz\nÇýkarma yapmak için - yazýnýz\nÇarpma yapmak için * yazýnýz\nBölme yapmak için / yazýnýz");

		char islem = scan.next().charAt(0);

		if (islem == '+') {
			do {
				System.out.print("Ýþlemi bitirmek için = yazýnýz\nLütfen toplamak için bir sayý giriniz :");

				sayi = scan.next();

				if (!sayi.equalsIgnoreCase("=")) {

					sonuc += Integer.parseInt(sayi);

				}

			} while (!sayi.equalsIgnoreCase("="));

			System.out.println("Girilen sayýlarýn toplmaý :" + sonuc);
		} else if (islem == '-') {

			System.out.print("Lütfen çýkarmak için iki sayý giriniz :");

			sayi = scan.next();
			String sayi2 = scan.next();

			sonuc = Integer.parseInt(sayi) - Integer.parseInt(sayi2);

			System.out.println("Girilen sayýlarýn farký :" + sonuc);
		}else if (islem == '*') {
			do {
				System.out.print("Ýþlemi bitirmek için = yazýnýz\nLütfen çarpmak için bir sayý giriniz :");

				sayi = scan.next();

				if (!sayi.equalsIgnoreCase("=")) {

					sonuc *= Integer.parseInt(sayi);

				}

			} while (!sayi.equalsIgnoreCase("="));

			System.out.println("Girilen sayýlarýn çarpýmý :" + sonuc);
		} else if (islem == '-') {

			System.out.print("Lütfen bölmek için iki sayý giriniz :");

			sayi = scan.next();
			int sayi2 = scan.nextInt();

			sonuc = Integer.parseInt(sayi) / sayi2;

			System.out.println("Girilen sayýlarýn bölümü :" + sonuc);
		}else {
			
			System.out.println("Hatalý sembol girdiniz lütfen yeniden embol giriniz");
			
			hesapMakinesi();
			
		}

}}
