package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesiD01 {

	public static void main(String[] args) {
		/* Problem Tanýmý :
        Basit 4 iþlem yapan bir hesap makinesi methodu kodlayýnýz....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinýz.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirýnýz.
      */
		
		hesapMakinesi();
		
	}
	private static void hesapMakinesi() {
		
		Scanner scan=new Scanner(System.in);
		
		
	
		System.out.println("Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz\nToplama iþlemi yapmak için + yazýnýz\nÇýkarma iþlemi yapmak için - yazýnýz\nÇarpma iþlemi yapmak için * yazýnýz\nBölme iþlemi yapmak için / yazýnýz");
		
		char islem=scan.next().charAt(0);
		
		switch (islem) {
		case '*':
			System.out.println("Lütfen 2 sayý giriniz");
			
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			System.out.println("Girdiðiniz sayýlarýn çarpýmý :" + (sayi1*sayi2) );
			break;
		case '/':
			System.out.println("Lütfen 2 sayý giriniz");
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			System.out.println("Girdiðiniz sayýlarýn bölümü :" + (sayi1/sayi2) );
			break;
		case '+':
			System.out.println("Lütfen 2 sayý giriniz");
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			System.out.println("Girdiðiniz sayýlarýn toplamý :" + (sayi1+sayi2) );
			break;
		case '-':
			System.out.println("Lütfen 2 sayý giriniz");
			
			sayi1=scan.nextInt();
			sayi2=scan.nextInt();
			
			System.out.println("Girdiðiniz sayýlarýn farký :" + (sayi1-sayi2) );
			break;

		default:
			
			System.out.println("Hatalý iþlem sembolü girdiniz lütfen geçerli bir sembol giriniz");
			
			hesapMakinesi();
			
			break;
		}
		
	}
		
		
	}


