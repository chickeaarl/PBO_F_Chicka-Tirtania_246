import java.time.LocalDate;
import java.util.Scanner;

public class dataDiriSederhana {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = objInput.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String gender = objInput.next().trim().toLowerCase();

        System.out.print("Masukkan tahun lahir: ");
        int year = objInput.nextInt();

        int tahunSekarang = LocalDate.now().getYear();

        int result = tahunSekarang-year;
        System.out.println("Data diri: ");
        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + (gender == "p" ? "Perempuan":"Laki-Laki"));
        System.out.println("Umur: " + result + " tahun");
    }
}