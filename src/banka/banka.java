package banka;

import java.util.Scanner;

public class banka {
	     public static void main(String[] args) {
	    	 Scanner scan=new Scanner( System.in );
		System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz ");
		System.out.println("Para Yatýrmak");
				 System.out.println( "Kredi Çekmek");       
				   System.out.println("EFT / Havale Yapmak");     		
		String islem=scan.nextLine();
		System.out.println("Miktar?");
		int miktar=scan.nextInt();
		
		
		System.out.println("Neden bu iþlemi yapýyorsunuz:");
		String neden=scan.next();
		System.out.println("Yaptýðýnýz iþlem : " + islem);
		System.out.println("Miktar : " + miktar);
		System.out.println("Sebebiniz : " + neden);
		
		System.out.println("Bankamýzý tercih ettiðiniz için teþekkürler");
		
		
		
    	
	}
}
