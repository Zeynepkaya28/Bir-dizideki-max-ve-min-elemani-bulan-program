import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner Klavye=new Scanner(System.in);
 int dizininuzunlugu;
        System.out.println("dizinin uzunluğunu giriniz:");

        dizininuzunlugu=Klavye.nextInt();
        Klavye.nextLine();
        int[] sayilar=new int [dizininuzunlugu];

        for (int i=0; i<dizininuzunlugu; i++){
            System.out.println("diziniz "+(i+1)+ " .değerini giriniz:");
        sayilar[i]=Klavye.nextInt();}

        int min=sayilar[0];
        int max=sayilar[0];


        for (int i=1; i< sayilar.length; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }

            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }
            System.out.println("minimum sayı" +min);
            System.out.println("maximum sayı"+max);
    }
}

