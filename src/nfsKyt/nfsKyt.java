package nfsKyt;

import java.util.Scanner;

public class nfsKyt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Nüfusa Kayýt Etmek Ýstediðiniz Kiþinin Adýný Giriniz");
		
		String isim = scan.nextLine();
		
		System.out.println("Lütfen Kiþinin Doðum Tarihini Örnekteki Gibi Giriniz ");
		
		System.out.println("Örnek: Gün/Ay/Yýl");
		
		String dTarih = scan.nextLine();
						
		System.out.println("Lütfen Kiþin Eðitim Seviyesini Ya Da Okuduðu Sýnýfý Veya Fakülteyi Giriniz");
		
		String egitim = scan.nextLine();
		
		System.out.println("Lütfen Kiþinin Doðduðu Þehri Ve Ýlçeyi Örnekteki Gibi Giriniz");
		
		System.out.println("Örnek: Þehir/Ýlçe");
		
		String dYeri = scan.nextLine();
		
		System.out.println("Kiþinin Kayýt Bilgileri :" + "\nKiþinin Adý : " + isim + "\nKiþinin Doðum Tarihi : " + dTarih + "\nKiþinin Eðitim Seviyesi : " + egitim + "\nKiþinin Doðum Yeri :" + dYeri);
		
		
		
		
		
		
	}

}
