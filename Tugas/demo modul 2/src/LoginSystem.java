import java.util.Scanner;
class Admin{
    String username;
    String password;

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword){
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

class Mahasiswa{
    String namaMahasiswa;
    String nim;

    public Mahasiswa(String namaMahasiswa, String nim){
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
    }

    public boolean login(String inputNamaMhs, String inputNimMhs){
        return this.namaMahasiswa.equals(inputNamaMhs) && this.nim.equals(inputNimMhs);
    }

    public void displayInfo(){
        System.out.println("Nama: " + this.namaMahasiswa);
        System.out.println("NIM: " + this.nim);
    }
}

public class LoginSystem{
    public static void main(String[] args){
        Scanner objInput = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");

        int choice;
        while (true) {
            System.out.print("Masukkan pilihan: ");

            if (objInput.hasNextInt()) {
                choice = objInput.nextInt();
                objInput.nextLine();

                if (choice == 1 || choice == 2) break;
                else System.out.println("Pilihan tidak valid! Harap pilih 1 atau 2!");
            } else {
                System.out.println("Pilihan tidak valid! Harap pilih 1 atau 2!");
                objInput.nextLine();
            }
        }

        while (true){
            if (choice == 1){
                Admin admin = new Admin("Admin246", "Password246");

                System.out.print("Masukkan username: ");
                String inputUsername = objInput.nextLine();
                System.out.print("Masukkan password: ");
                String inputPassword = objInput.nextLine();

                if (admin.login(inputUsername, inputPassword)){
                    System.out.println("Login Admin berhasil!");
                    return;
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else if (choice == 2) {
                Mahasiswa mahasiswa = new Mahasiswa("Chicka Tirtania", "202410370110246");

                System.out.print("Masukkan Nama: ");
                String inputNamaMhs = objInput.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNimMhs = objInput.nextLine();

                if (mahasiswa.login(inputNamaMhs, inputNimMhs)){
                    System.out.println("Login Mahasiswa berhasil!");
                    mahasiswa.displayInfo();
                    return;
                } else{
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            }else{
                System.out.println("pilihan tidak valid");
            }
        }
    }
}