
package emkllk;
import java.util.Scanner;
public class emkllk {
    public static void main(String[] args) {
        // Soru 3) Kullaniciya yasini sorun, 
        // eger yas 65’e esit veya kucuk ise “emekli olamazsin, calismalisin”, 
        // 65’den buyukse “Emekli olabilirsin” yazdirin
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Lutfen yasinizi giriniz");
        
        int yas= scan.nextInt();
        
        if (yas<=65 && yas>=18) {
            
            System.out.println("Emekli olamazsin, calismalisin emekli olmana " + (65-yas) + " yýl var");
        }
        if(yas>65) {
            System.out.println("Emekli olabilirsin");
        }
        
        if (yas<=17) {
        	
        	System.out.println("Sen daha çocuksun ne emekli olmasý sen çalýþamazsýn");
			
		}
        
        scan.close();
    }
}
