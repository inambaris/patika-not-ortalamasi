import java.util.Scanner;

public  class Main {
public static void main(String[] args){
    int tutar;
    double kdvOran,kdvTutar;
    Scanner input= new Scanner(System.in);
    System.out.println("Tutarı Giriniz: ");
    tutar = input.nextInt();

    if(tutar <=1000 & tutar>=0 ){
    kdvOran = 0.18 ;
    kdvTutar = tutar * kdvOran;
    System.out.print("Kdv Tutarı : " +kdvTutar);
    }
    else{
    kdvOran = 0.08;
    kdvTutar = tutar * kdvOran;
    System.out.print("Kdv Tutarı : " +kdvTutar);
    }
}
}