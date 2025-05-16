package com.praktikum.users;

import com.praktikum.action.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {

    public Admin(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return getName().equals(inputUsername) && getPassword().equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin Berhasil!");
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Menu Admin");
            System.out.println("1. Kelola Barang");
            System.out.println("2. Kelola Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Masukkan angka yang valid !(1, 2, 3)");
                scanner.nextLine();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 3:
                    System.out.println("Anda berhasil keluar.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Mohon pilih angka 1, 2, 3");
            }
        } while (choice != 0);
    }
}