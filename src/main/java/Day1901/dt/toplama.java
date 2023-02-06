package day1901.dt;

import java.sql.SQLOutput;

public class MethodCreation01 {
    public static int main(String[] args) {
        int sonuc = toplamayap(3,5);
        System.out.println("Alistirma 1: Toplama Islemi sonucu: "+ sonuc);

        int carpimSonucu = multiply(7,7);
        System.out.println("Alistirma 2: Carpma islemi sonucu: " + carpimSonucu);

        int islemsonucu = FirstTwoMultiplyAndAddTheLast(2,3,8);
        System.out.println("Alistirma 3: a*b+c: " + islemsonucu);

        int kup = getCube(12);
        System.out.println("Alistirma 4: Bir sayinin kupunu alma: " + kup);

        print("Alistirma 5: Hello TechPro, All done");
        print("______End of the program_____");

        return sonuc;
    }

    //Ornek1: Main metodunun disinda bir yerde toplama islemi yapan bir metot olusturuyoruz.
    public static int toplamayap(int a, int b) {
        return a+b;

    }


// Ornek2: Iki tam sayiyi carpan bir metod yazalim.
    public static int multiply(int a, int b) {
        return a*b;

    }
// Ornek3: Verilen uc tam sayidan ilk ikisini carpan ve sonucu ucuncu tam sayiya ekleyen bir  metod yapalim.
    public static int FirstTwoMultiplyAndAddTheLast (int a, int b, int c){
        return a*b+c;

    }
 // Onrek4: Bir tam sayinin kupunu alan bir metod yaziniz.
    public static int getCube(int a){
        return a*a*a;
    }


 // Ornek5: Girilen bir kelimeyi ekrana yazdiran bir metod olusturun.

    private static void print (String str){
        System.out.println(str);

    }



}