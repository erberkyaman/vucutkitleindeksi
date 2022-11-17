import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            double boy,kilo,indeks;
            System.out.print("Boyunuzu Girin:");
            boy=input.nextDouble();
            System.out.print("Kilonuzu Girin:");
            kilo=input.nextDouble();

            indeks = kilo/(boy*boy);
            System.out.print("Vücut Kitle İndeksiniz:"+indeks);
    }
}
