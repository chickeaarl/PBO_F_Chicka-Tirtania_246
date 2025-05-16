package com.praktikum.users;

import com.praktikum.action.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    public Mahasiswa(String name, String nim) {
        super(name);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public boolean login(String inputName, String inputNim) {
        return getName().equals(inputName) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login mahasiswa berhasil");
        System.out.println("Nama: " + getName());
        System.out.println("NIM: " + getNim());
    }

    @Override
    public void reportItem(Scanner scanner) {
        System.out.println("Masukkan nama barang: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan deskripsi barang: ");
        String deskripsi = scanner.nextLine();

        System.out.println("Masukkan lokasi terakhir barang ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("Laporan berhasil diterima");
        System.out.println("Barang: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Lokasi: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }

    @Override
    public void displayAppMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Menu Mahasiswa");
            System.out.println("1. Pelaporan barang hilang");
            System.out.println("2. Lihat Daftar Laporan");
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
                    reportItem(scanner);
                    break;
                case 2:
                    viewReportedItems();
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