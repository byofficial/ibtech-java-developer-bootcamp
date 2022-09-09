package com.ibtech.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Supplier> supplierList = new ArrayList<>();
    private static String filePath = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Supplier.txt";

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
        try {
            System.out.println("Yükleniyor...");
            SupplierFiler supplierFiler = new SupplierFiler(filePath);
            supplierList = supplierFiler.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Yükleme tamamlandı.");
    }

    private static void doStore() {
        try {
            System.out.println("Saklanıyor...");
            SupplierFiler supplierFiler = new SupplierFiler(filePath);
            supplierFiler.store(supplierList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saklama tamamlandı.");
    }

    private static void doList() {
        System.out.println("Dizelgeleniyor...");
        if (!supplierList.isEmpty()) {
            System.out.println(supplierList.size() + " kayıt bulundu.\n");

            for (Supplier supplier : supplierList) {
                System.out.println(supplier.getSupplierId() + " "
                        + supplier.getSupplierName() + " "
                        + supplier.getTotalCredit());
            }
        } else {
            System.out.println("Kayıt bulunamadı.");
        }
    }

    private static void doFind() {
        try {
            System.out.println("Supplier Id: ");
            Supplier supplier = findBySupplierId(scanner.nextLong());
            if (supplier != null) {
                System.out.println("Bulunuyor:\n"
                        + supplier.getSupplierId() + " "
                        + supplier.getSupplierName() + " "
                        + supplier.getTotalCredit());
            } else {
                System.out.println("Kayıt bulunamadı.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void doAdd() {
        System.out.println("Supplier Id: ");

        long supplierId = scanner.nextLong();
        scanner.nextLine();
        Supplier supplier = findBySupplierId(supplierId);

        if (supplier == null) {
            System.out.println("Supplier Name: ");
            String supplierName = scanner.nextLine();

            System.out.println("Supplier Total Credit: ");
            double totalCredit = scanner.nextDouble();

            System.out.println("Ekleme yapılıyor...");
            supplierList.add(new Supplier(supplierId, supplierName, totalCredit));
            System.out.println("Eklendi!");
        } else {
            System.out.println("Supplier zaten kayıtlı! SuplierId: " + supplierId);
        }
    }

    private static void doUpdate() {
        System.out.println("Supplier Id: ");

        long supplierId = scanner.nextLong();
        scanner.nextLine();
        Supplier supplier = findBySupplierId(supplierId);

        if (supplier != null) {
            System.out.println("Yeni Supplier Name: ");
            String supplierName = scanner.nextLine();

            System.out.println("Yeni Supplier Total Credit: ");
            double totalCredit = scanner.nextDouble();

            System.out.println("Güncelleme yapılıyor...");
            supplier.setSupplierName(supplierName);
            supplier.setTotalCredit(totalCredit);
            System.out.println("Güncellendi!");
        } else {
            System.out.println("Kayıt Bulunamadı.");
        }
    }

    private static void doDelete() {
        System.out.println("Supplier Id: ");

        long supplierId = scanner.nextLong();
        Supplier supplier = findBySupplierId(supplierId);

        if (supplier != null) {
            System.out.println("Siliniyor...");
            supplierList.remove(supplier);
            System.out.println("Silindi!");
        } else {
            System.out.println("Kayıt Bulunamadı.");
        }
    }

    private static void doExit() {
        System.exit(0);
    }

    private static Supplier findBySupplierId(long supplierId) {
        for (Supplier supplier : supplierList) {
            if (supplier.getSupplierId() == supplierId) {
                return supplier;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanChoice();
            handleChoice(choice);
        }
    }
}
