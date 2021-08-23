package cinema;

import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("L?tfen yapmak istedi?iniz i?lemi se?iniz" + "\nBilet sat?n alma  ekran? i?in 1 yaz?n?z"
				+ "\nVizyondaki filmleri g?rmek i?in 2 yaz?n?z\nYapmak istedi?iniz i?lem :");

		int islem = scan.nextInt();
		String film3 = "Esaretin Bedeli";
		String film2 = "Shrek";
		String film1 = "H?zl? Ve ?fkeli";

		switch (islem) {

		case 2:
			System.out.print("\n-----------------------------" + "?u anda vizyonda olan filmeler :"

					+ "\n" + film1
					+ " \nSaat :16.30 \n?iddet-Korku Ve 7 Ya? Ve ?zeri \nFilmi se?mek i?in bilet ekran?na 1 yaz?n"
					+ "\n-----------------------------------------" + "\n" + film2
					+ "\nSaat :18.15 \nGenel izleyici kitlesi i?in uygundur \nFilmi se?mek i?in bilet ekran?na 2 yaz?n"
					+ "\n-----------------------------------------" + "\n" + film3
					+ "\nSaat :22.30 \n13 Ya? Ve ?zeri ??in Uygundur ?iddet Korku Ve OLumsuz ?rnek OLuturabilecek ?geler ??ermektedir \nFilmi se?mek i?in bilet ekran?na 3 yaz?n"
					+ "\n-----------------------------------------" + "\nFilmeler ki?i ba?? sabit fiyat ile 10$'d?r"
					+ "\nBilet ekran?na d?nmek i?in 1 yaz?n?z" + "\nSistemden ??kmak i?in 2 yaz?n?z"
					+ "\nYapmak istedi?iniz i?lem :");

			int donus = scan.nextInt();

			if (donus == 1) {

				biletSistemi(film1, film2, film3);
			} else if (donus == 2) {

				System.out.println("Sistemden ??kt?n?z g?r??mek ?zere ho??a kal?n");
			} else {

				System.out.println("L?tfen ge?erli bir i?lem numaras? giriniz");

			}

		case 1:

			biletSistemi(film1, film2, film3);

		}

	}

	private static void biletSistemi(String film1, String film2, String film3) {

		Scanner scan = new Scanner(System.in);

		System.out.print("L?tfen girmek istedi?iniz filmin numaras?n? giriniz :");

		int film = scan.nextInt();

		System.out.print("L?tfen ka? ki?i oldu?unuzu giriniz :");

		int kisi = scan.nextInt();

		switch (film) {
		case 1:

			System.out.println("Se?ti?iniz film " + film1 + " ?deyece?iniz fiyat : " + kisi * 10 + "$");
			
			break;

		case 2:

			System.out.println("Se?ti?iniz film " + film2 + " ?deyece?iniz fiyat : " + kisi * 10 + "$");

			break;

		case 3:

			System.out.println("Se?ti?iniz film " + film3 + " ?deyece?iniz fiyat : " + kisi * 10 + "$");

			
			break;
		default:

			System.out.println("L?tfen ge?erli bir film numaras? giriniz ");

			biletSistemi(film1, film2, film3);

			break;
		}

		scan.close();

	}

	

}
