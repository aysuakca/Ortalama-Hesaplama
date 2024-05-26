import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,muzik,turkce;
        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :  ");
        mat= inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz :  ");
        fizik= inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz :  ");
        kimya= inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz :  ");
        tarih= inp.nextInt();

        System.out.println("Turkce Notunuzu Giriniz :  ");
        turkce= inp.nextInt();

        System.out.println("Muzik Notunuzu Giriniz :  ");
        muzik= inp.nextInt();

        int toplam= (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc= toplam/6.0;
        System.out.println("Ortalamaniz : "+sonuc);

        String degerlendirme= (sonuc>=60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Sonuç: " +degerlendirme);




    }
}