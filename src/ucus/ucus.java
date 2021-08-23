package ucus;

import java.util.Scanner;

public class ucus {

	public static void main(String[] args) {
		/*
		 * A þehrinden uçamak isteyen bir kiþi B þehrine 500km C þehrine 700km D þehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa yaþ indirimlerinden hariç 20% indirim bu
		 * kosullara gore yolcudan gideceði mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yazýnýz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("1-A þehrinden - B þehrine 500km\n2-A þehrinden - C þehrine 700km\n"
				+ "3-A þehrinden - D þehrine 900km\nLÜTFEN 3 SEÇÝMDEN 1 TANESÝNÝ GÝRÝNÝZ:");
		int istikamet = scan.nextInt();
		System.out.print("LÜTFEN YAÞINIZI GÝRÝNÝZ:");
		int yas = scan.nextInt();
		System.out.print("1- YALNIZCA GÝDÝÞ VEYA DÖNÜÞ BÝLETÝ\n2- GÝDÝÞ-DÖNÜÞ BÝLETÝ\nLÜTFEN YOLCULUK TÝPÝNÝ SEÇÝNÝZ:");
		int tip = scan.nextInt();
		double normalFiyat = 1;
		double yasInd, tipInd;
		if (tip == 1) {
			if (istikamet == 1) {
				normalFiyat = 500 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else if (istikamet == 2) {
				normalFiyat = 700 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else if (istikamet == 3) {
				normalFiyat = 900 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else {
				System.out.println("GEÇERLÝ BÝR YOLCULUK ÝSTÝKAMETÝ SEÇÝNÝZ");
			}
		} else if (tip == 2) {
			if (istikamet == 1) {
				normalFiyat = 500 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				tipInd = normalFiyat * 0.2;
				normalFiyat = (normalFiyat - tipInd) * 2;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else if (istikamet == 2) {
				normalFiyat = 700 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				tipInd = normalFiyat * 0.2;
				normalFiyat = (normalFiyat - tipInd) * 2;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else if (istikamet == 3) {
				normalFiyat = 900 * 0.1;
				if (yas < 12) {
					yasInd = normalFiyat * 0.5;
				} else if (yas >= 12 && yas >= 25) {
					yasInd = normalFiyat * 0.1;
				} else if (yas >= 65) {
					yasInd = normalFiyat * 0.3;
				} else {
					yasInd = 0;
				}
				normalFiyat -= yasInd;
				tipInd = normalFiyat * 0.2;
				normalFiyat = (normalFiyat - tipInd) * 2;
				System.out.println("Fiyat : " + normalFiyat + "USD");
			} else {
				System.out.println("GEÇERLÝ BÝR YOLCULUK ÝSTÝKAMETÝ SEÇÝNÝZ");
			}
		} else {
			System.out.println("GEÇERLÝ BÝR YOLCULUK TÝPÝNÝ SEÇÝNÝZ");
		}
		scan.close();

	}

}
