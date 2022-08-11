import java.util.Scanner;
public class taksimetreProgrami {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, toplam = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Olarak Giriniz:");
        km = input.nextInt();

        toplam += (km * perKM);

        toplam = (toplam < 20) ? 20 : toplam;
        System.out.print("Toplam Tutar:" +toplam);

    }
}
