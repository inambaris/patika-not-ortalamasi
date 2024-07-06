import java.util.Scanner;

public  class Main {
public static void main(String[] args){
    int mat, fizik, kimya, turkce, tarih, muzik;

    Scanner inp = new Scanner(System.in);

    System.out.print("Matematik Notunuz : ");
    mat = inp.nextInt();

    System.out.print("Fizik notunu giriniz : ");
    fizik = inp.nextInt();

    System.out.print("Kimya notunu giriniz : ");
    kimya = inp.nextInt();

    System.out.print("Türkçe notunu giriniz : ");
    turkce = inp.nextInt();

    System.out.print("Tarih notunu giriniz : ");
    tarih = inp.nextInt();

    System.out.print("Müzik notunu giriniz : ");
    muzik = inp.nextInt();

    double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
    double ortalama = toplam/6;
    System.out.println(ortalama);

    String gano = ortalama>60?  "Sınıfı geçtiniz":"Sınıfta kaldınız";
    System.out.print(gano);
}
}