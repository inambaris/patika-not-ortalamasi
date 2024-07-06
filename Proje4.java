import java.util.Scanner;
public class Proje4 {
    public static void main(String[] args){
    double km,tutar,startPrice=10;

    Scanner input = new Scanner(System.in);

    System.out.println("Kilometreyi giriniz :");
    km = input.nextDouble();
    tutar = (km * 2.20);
    tutar += startPrice;

    if(tutar<20){
        tutar = 20;
    }
    System.out.print("Tutar :" +tutar);
    }
}
