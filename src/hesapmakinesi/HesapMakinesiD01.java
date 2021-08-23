package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesiD01 {

	public static void main(String[] args) {
		/* Problem Tan�m� :
        Basit 4 i�lem yapan bir hesap makinesi methodu kodlay�n�z....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalin�z.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdir�n�z.
      */
		
		hesapMakinesi();
		
	}
	private static void hesapMakinesi() {
		
		Scanner scan=new Scanner(System.in);
		
		
	
		System.out.println("L�tfen Yapmak �stedi�iniz ��lemi Se�iniz\nToplama i�lemi yapmak i�in + yaz�n�z\n��karma i�lemi yapmak i�in - yaz�n�z\n�arpma i�lemi yapmak i�in * yaz�n�z\nB�lme i�lemi yapmak i�in / yaz�n�z");
		
		char islem=scan.next().charAt(0);
		
		switch (islem) {
		case '*':
			System.out.println("L�tfen 2 say� giriniz");
			
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			System.out.println("Girdi�iniz say�lar�n �arp�m� :" + (sayi1*sayi2) );
			break;
		case '/':
			System.out.println("L�tfen 2 say� giriniz");
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			System.out.println("Girdi�iniz say�lar�n b�l�m� :" + (sayi1/sayi2) );
			break;
		case '+':
			System.out.println("L�tfen 2 say� giriniz");
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			
			System.out.println("Girdi�iniz say�lar�n toplam� :" + (sayi1+sayi2) );
			break;
		case '-':
			System.out.println("L�tfen 2 say� giriniz");
			
			sayi1=scan.nextInt();
			sayi2=scan.nextInt();
			
			System.out.println("Girdi�iniz say�lar�n fark� :" + (sayi1-sayi2) );
			break;

		default:
			
			System.out.println("Hatal� i�lem sembol� girdiniz l�tfen ge�erli bir sembol giriniz");
			
			hesapMakinesi();
			
			break;
		}
		
	}
		
		
	}


