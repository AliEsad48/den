package banka;

import java.util.Scanner;

public class banka {
	     public static void main(String[] args) {
	    	 Scanner scan=new Scanner( System.in );
		System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz ");
		System.out.println("Para Yat�rmak");
				 System.out.println( "Kredi �ekmek");       
				   System.out.println("EFT / Havale Yapmak");     		
		String islem=scan.nextLine();
		System.out.println("Miktar?");
		int miktar=scan.nextInt();
		
		
		System.out.println("Neden bu i�lemi yap�yorsunuz:");
		String neden=scan.next();
		System.out.println("Yapt���n�z i�lem : " + islem);
		System.out.println("Miktar : " + miktar);
		System.out.println("Sebebiniz : " + neden);
		
		System.out.println("Bankam�z� tercih etti�iniz i�in te�ekk�rler");
		
		
		
    	
	}
}
