package nfsKyt;

import java.util.Scanner;

public class nfsKyt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen N�fusa Kay�t Etmek �stedi�iniz Ki�inin Ad�n� Giriniz");
		
		String isim = scan.nextLine();
		
		System.out.println("L�tfen Ki�inin Do�um Tarihini �rnekteki Gibi Giriniz ");
		
		System.out.println("�rnek: G�n/Ay/Y�l");
		
		String dTarih = scan.nextLine();
						
		System.out.println("L�tfen Ki�in E�itim Seviyesini Ya Da Okudu�u S�n�f� Veya Fak�lteyi Giriniz");
		
		String egitim = scan.nextLine();
		
		System.out.println("L�tfen Ki�inin Do�du�u �ehri Ve �l�eyi �rnekteki Gibi Giriniz");
		
		System.out.println("�rnek: �ehir/�l�e");
		
		String dYeri = scan.nextLine();
		
		System.out.println("Ki�inin Kay�t Bilgileri :" + "\nKi�inin Ad� : " + isim + "\nKi�inin Do�um Tarihi : " + dTarih + "\nKi�inin E�itim Seviyesi : " + egitim + "\nKi�inin Do�um Yeri :" + dYeri);
		
		
		
		
		
		
	}

}
