package eft;

import java.util.Scanner;

public class Eft {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen EFT/Havale Yapmak �stedi�iniz Ki�inin Ad�n� Giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("L�tfen EFT/Havale Yapmak �stedi�iniz Ki�inin Soyad�n� Giriniz");
		
		String surname = scan.nextLine();
		
		System.out.println("L�tfen ad�n�z�n ilk harfini giriniz");
							
		System.out.println("L�tfen G�dermek �stedi�iniz Miktar� giriniz");
		
		int miktar = scan.nextInt();
		
		double vergi = 10.25;
		
		int hBedeli=5;
		
		System.out.println("�dyece�iniz miktar g�nderilen para + vergiler ile :" + (miktar + vergi));
		
		System.out.println("Ki�iye ula�acak miktar g�nderieln miktar - hizmet bedeli ile : " + (miktar-hBedeli));
		
		System.out.println("Parn�n g�nderilece�i ki�i :" + name + " "+ surname );
		
		
		
		
		

	}

}
