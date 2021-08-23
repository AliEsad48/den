package oyun;

import java.util.Scanner;

public class OyunD01 {

	public static void main(String[] args) {
/*
         * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 1.Adým- Baslangicta
         * 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2.Adým- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini
         * sorun. * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf
         * sayisi kadar puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
         * "gecersiz kelime" yazdirin ve hangi oyuncunun kazandigini yazip oyunu
         * bitirin.
         *
         * 3.Adým- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam
         * etmek isterse kelimeye eklemek istedigi string'i ve basa mi sona mi
         * ekleyecegini sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
         * kazanan oyuncuyu yazdirin
         */
        String kelime;
        int birinciOyuncuPuani = 0;
        int ikinciOyuncuPuani = 0;
        String oyuncu1 = "Birinci oyuncu";
        String oyuncu2 = "Ikinci oyuncu";
        System.out.println(oyuncu1 + " bir kelime giriniz: ");
        Scanner scan = new Scanner(System.in);
        kelime = scan.next();
        System.out.println("Girdiginiz kelime: " + kelime);
        kabulMu(oyuncu1, oyuncu2, kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
    }
    // adim2
    public static void kabulMu(String oyuncu1, String oyuncu2, String kelime, int birinciOyuncuPuani,
            int ikinciOyuncuPuani) {
        Scanner scan = new Scanner(System.in);
        System.out.println(oyuncu2 + " kelimeyi kabul ediyor musunuz? (Ediyorum/etmiyorum)");
        String cevap = scan.next();
        boolean kabul = cevap.equalsIgnoreCase("ediyorum");
        kabuluAl(kabul, oyuncu1, oyuncu2, kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
    }
    // adim3
    public static void kabuluAl(boolean kabul, String oyuncu1, String oyuncu2, String kelime, int birinciOyuncuPuani,
            int ikinciOyuncuPuani) {
        if (kabul) {
            if (oyuncu1.equalsIgnoreCase("birinci oyuncu")) {
                birinciOyuncuPuani = kelime.length();
            } else {
                ikinciOyuncuPuani = kelime.length();
            }
            devamMi(oyuncu1, oyuncu2, kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
        } else {
            System.out.println("Gecersiz kelime");
            kazananiBelirle(kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
        }
    }
    // adim4
    public static void devamMi(String oyuncu1, String oyuncu2, String kelime, int birinciOyuncuPuani,
            int ikinciOyuncuPuani) {
        Scanner scan = new Scanner(System.in);
        System.out.println(oyuncu2 + " oyuna devam etmek istiyor musunuz? (Istiyorum/Istemiyorum)");
        String cevap = scan.next();
        boolean devam = cevap.equalsIgnoreCase("istiyorum");
        devamiAl(devam, kelime, oyuncu1, oyuncu2, birinciOyuncuPuani, ikinciOyuncuPuani);
    }
    // adim5
    public static void devamiAl(boolean devam, String kelime, String oyuncu1, String oyuncu2, int birinciOyuncuPuani,
            int ikinciOyuncuPuani) {
        if (devam) {
            kelime = eklemeYap(kelime);
            String degistir = oyuncu2;
            oyuncu2 = oyuncu1;
            oyuncu1 = degistir;
            kabulMu(oyuncu1, oyuncu2, kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
        } else {
            System.out.println("Oyun bitti!");
            kazananiBelirle(kelime, birinciOyuncuPuani, ikinciOyuncuPuani);
        }
    }
    // adim 6
    public static String eklemeYap(String kelime) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelimeye ne eklemek istersiniz?");
        String ekleme = scan.next();
        System.out.println("Basa mi sona mi eklemek istersiniz (Basa/sona)");
        String cevap = scan.next();
        boolean basa = cevap.equalsIgnoreCase("basa");
        if (basa) {
            kelime = ekleme + kelime;
        } else {
            kelime = kelime + ekleme;
        }
        return kelime;
    }
    // adim7
    public static void kazananiBelirle(String kelime, int birinciOyuncuPuani, int ikinciOyuncuPuani) {
        String kazanan;
        if (birinciOyuncuPuani > ikinciOyuncuPuani) {
            kazanan = "Birinci oyuncu";
        } else if (birinciOyuncuPuani < ikinciOyuncuPuani) {
            kazanan = "Ikinci oyuncu";
        } else {
            kazanan = "Yok";
        }
        System.out.println("Oyuncu puanlari: \n Birinci oyuncu: " + birinciOyuncuPuani + "\n Ikinci oyuncu: "
                + ikinciOyuncuPuani + "\n Kazanan: " + kazanan + "\n Kelimeniz: " + kelime);}

	
		
		
	}


