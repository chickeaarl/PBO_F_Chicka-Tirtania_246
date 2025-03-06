import java.util.Scanner;
public class loginSystemSederhana {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        String userName = "Admin246";
        String passWord = "password246";

        String namaMhs = "Chicka Tirtania Primasasya";
        String nimMhs = "202410370110246";

        System.out.println("Pilih login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int choice;
        if (objInput.hasNextInt()){
            choice = objInput.nextInt();
            objInput.nextLine();
         } else {
            System.out.println("Pilihan tidak valid.");
            objInput.close();
            return;
        }

        if (choice == 1){
            while(true){
                System.out.print("Masukkan username: ");
                String inputUsername = objInput.nextLine();
                System.out.print("Masukkan password: ");
                String inputPassword = objInput.nextLine();

                if (inputUsername.equals(userName) && inputPassword.equals(passWord)){
                    System.out.println("Login admin berhasil!");
                    break;
                } else {
                    System.out.println("Login gagal! Username atau password salah!");
                }
            }
        } else if (choice == 2) {
            while(true){
                System.out.print("Masukkan Nama: ");
                String inputName = objInput.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = objInput.nextLine();

                if (inputName.equals(namaMhs) && inputNim.equals(nimMhs)){
                    System.out.println("Login mahasiswa berhasil!");
                    System.out.println("Nama: " + inputName);
                    System.out.println("NIM: " + inputNim);
                    break;
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah!");
                }
            }

        } else {
            System.out.println("Input tidak valid! Masukkan 1 atau 2!");
        }
        objInput.close();
    }
}