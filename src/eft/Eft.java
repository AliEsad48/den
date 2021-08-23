package eft;

import java.util.Scanner;

public class Eft {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen EFT/Havale Yapmak Ýstediðiniz Kiþinin Adýný Giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("Lütfen EFT/Havale Yapmak Ýstediðiniz Kiþinin Soyadýný Giriniz");
		
		String surname = scan.nextLine();
		
		System.out.println("Lütfen adýnýzýn ilk harfini giriniz");
							
		System.out.println("Lütfen Gödermek Ýstediðiniz Miktarý giriniz");
		
		int miktar = scan.nextInt();
		
		double vergi = 10.25;
		
		int hBedeli=5;
		
		System.out.println("Ödyeceðiniz miktar gönderilen para + vergiler ile :" + (miktar + vergi));
		
		System.out.println("Kiþiye ulaþacak miktar gönderieln miktar - hizmet bedeli ile : " + (miktar-hBedeli));
		
		System.out.println("Parnýn gönderileceði kiþi :" + name + " "+ surname );
		
		
		
		
		

	}

}
