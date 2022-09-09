package com.ibtech.filer;

import java.io.IOException;
import java.util.List;

public class TestLoad {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Supplier.txt";
        SupplierFiler supplierFiler = new SupplierFiler(filePath);
        List<Supplier> supplierList = supplierFiler.load();

        for (Supplier supplier : supplierList) {
            System.out.println(supplier.getSupplierId() + " "
                    + supplier.getSupplierName() + " "
                    + supplier.getTotalCredit());
        }

    }
}
