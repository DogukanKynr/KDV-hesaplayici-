import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double kdvOrani ;

        System.out.print("Ürün fiyatını giriniz : ");
        double tutar = input.nextDouble();

        kdvOrani = (tutar>0) && (tutar<=1000) ? 0.18 : 0.08;

        System.out.print("KDV oranı : ");
        System.out.print(kdvOrani);

        System.out.print("Kdv miktarı : ");
        System.out.print(tutar * kdvOrani);
        System.out.print("\n");

        System.out.print("Son fiyat : ");
        System.out.print(tutar * kdvOrani + tutar);



    }
}