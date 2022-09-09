package com.ibtech.console;

import com.ibtech.filer.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Supplier> supplierList = new ArrayList<>();

    private static void printMenu() {
        System.out.println("Menü: ");
        System.out.println("1. Yükle");
        System.out.println("2. Sakla");
        System.out.println("3. Dizelgele");
        System.out.println("4. Bul");
        System.out.println("5. Ekle");
        System.out.println("6. Güncelle");
        System.out.println("7. Sil");
        System.out.println("0. Çık");
    }

    private static int scanChoice() {
        System.out.println("Seçiniz: ");
        int choice = scanner.nextInt();
        System.out.println("Seçilen: " + choice);
        return choice;

    }

    private static void handleChoice(int choice) {
        System.out.println("Kotarılıyor : " + choice);
        switch (choice) {
            case 0:
                doExit();
                break;
            case 1:
                doLoad();
                break;
            case 2:
                doStore();
                break;
            case 3:
                doList();
                break;
            case 4:
                doFind();
                break;
            case 5:
                doAdd();
                break;
            case 6:
                doUpdate();
                break;
            case 7:
                doDelete();
                break;
            default:
                System.out.println("Geçersiz seçim: " + choice);
        }
    }

    private static void doLoad() {
        System.out.println("Yükleniyor...");
    }

    private static void doStore() {
        System.out.println("Saklanıyor...");
    }

    private static void doList() {
        System.out.println("Dizelgeleniyor...");
    }

    private static void doFind() {
        System.out.println("Bulunuyor...");
    }

    private static void doAdd() {
        System.out.println("Ekleniyor...");
    }

    private static void doUpdate() {
        System.out.println("Güncelleniyor...");
    }

    private static void doDelete() {
        System.out.println("Siliniyor...");
    }

    private static void doExit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanChoice();
            handleChoice(choice);
        }


    }
}
