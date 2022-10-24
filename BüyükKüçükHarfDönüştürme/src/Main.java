import java.util.Scanner;


public class Main {

	/*
	Fonksiyona girdi olarak verilen metin icerisinde kucuk harf olarak yazilan harfi buyuk harfe, buyuk harf olarak verilen harfi kucuk harfe ceviren
	bir fonksiyon yaziniz.
	Örn;
	Fonksiyonunun adi; harfDonusturme
	harfDonusturme("Yuksek! İhtisas? Universitesi")
	Sonuc; "yUKSEK! iHTİSAS? uNİVERSİTESİ"

	Not; Bosluklara ve diger ifadelere duyarli olmali ve onlarda degisiklik yapmamali
	Onceki Odevlerden biri olan ASCII TABLE odevi size bu konuda yardimci olacaktir.
	*/




        public static String harfDonusturme(){

        Scanner in = new Scanner(System.in);

        System.out.println("Metin gir : ");

        String harfDonusturme = in.next();

        System.out.println("Küçük harfe çevrilmiş hali : " + harfDonusturme.toLowerCase());


            return harfDonusturme;
        }



    }








