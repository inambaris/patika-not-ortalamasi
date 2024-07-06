import java.util.Scanner;
public class Proje3 {
    public static void main(String[] args) {
        int a, b,c,u;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = input.nextInt();

        System.out.println("2. Kenarı Giriniz : ");
        b = input.nextInt();

        System.out.println("3. Kenarı Giriniz : ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u * (u-a)*(u-b*(u-c)));
        System.out.print("Üçgenin Alanı :" +alan);

    }
}
