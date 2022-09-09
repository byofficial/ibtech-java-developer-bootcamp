package com.ibtech.filer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class SupplierFiler {
    private String filePath;

    public SupplierFiler(String filePath) {
        this.filePath = filePath;
    }

    public void store(Iterable<Supplier> supplierList) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        for (Supplier supplier : supplierList) {
            String line = format(supplier);
            bw.write(line);
        }
        bw.close();
    }

    private String format(Supplier supplier) {
        StringBuilder builder = new StringBuilder();
        builder.append(supplier.getSupplierId()).append(";");
        builder.append(supplier.getSupplierName()).append(";");
        builder.append(supplier.getTotalCredit());
        return builder.toString();
    }

    public List<Supplier> load() {
        return null;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
