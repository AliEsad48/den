package ucus;

import java.util.Scanner;

public class ucus {

	public static void main(String[] args) {
		/*
		 * A �ehrinden u�amak isteyen bir ki�i B �ehrine 500km C �ehrine 700km D �ehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa ya� indirimlerinden hari� 20% indirim bu
		 * kosullara gore yolcudan gidece�i mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yaz�n�z
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("1-A �ehrinden - B �ehrine 500km\n2-A �ehrinden - C �ehrine 700km\n"
				+ "3-A �ehrinden - D �ehrine 900km\nL�TFEN 3 SE��MDEN 1 TANES�N� G�R�N�Z:");
		int istikamet = scan.nextInt();
		System.out.print("L�TFEN YA�INIZI G�R�N�Z:");
		int yas = scan.nextInt();
		System.out.print("1- YALNIZCA G�D�� VEYA D�N�� B�LET�\n2- G�D��-D�N�� B�LET�\nL�TFEN YOLCULUK T�P�N� SE��N�Z:");
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
				System.out.println("GE�ERL� B�R YOLCULUK �ST�KAMET� SE��N�Z");
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
				System.out.println("GE�ERL� B�R YOLCULUK �ST�KAMET� SE��N�Z");
			}
		} else {
			System.out.println("GE�ERL� B�R YOLCULUK T�P�N� SE��N�Z");
		}
		scan.close();

	}

}
