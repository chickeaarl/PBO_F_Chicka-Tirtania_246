package com.praktikum.main;

import java.util.Scanner;
import com.praktikum.users.*;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Admin246", "Password246");
        Mahasiswa mahasiswa = new Mahasiswa("Chicka Tirtania", "202410370110246", "hfj");

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        boolean loginBerhasil = false;

        switch (pilihan) {
            case 1:
                System.out.print("Username: ");
                String user = scanner.nextLine();
                System.out.print("Password: ");
                String pass = scanner.nextLine();

                if (admin.login(user, pass)) {
                    admin.displayInfo();
                    loginBerhasil = true;
                    admin.displayAppMenu(scanner);
                } else {
                    System.out.println("Login Admin gagal. Username atau password salah.");
                }
                break;

            case 2:
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                    loginBerhasil = true;
                } else {
                    System.out.println("Login Mahasiswa gagal. Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        if (!loginBerhasil && (pilihan == 1 || pilihan == 2)) {
            System.out.println("Silakan coba login kembali.");
        }

        scanner.close();
    }
}