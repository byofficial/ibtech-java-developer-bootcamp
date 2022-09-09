package com.ibtech.filer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SupplierFiler {
    private String filePath;

    public SupplierFiler(String filePath) {
        this.filePath = filePath;
    }

    public void store(Iterable<Supplier> supplierList) throws IOException {
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

    public List<Supplier> load() throws IOException {
        List<Supplier> supplierList = new ArrayList<Supplier>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(";");
            Supplier supplier = new Supplier();
            supplier.setSupplierId(Long.parseLong(tokens[0]));
            supplier.setSupplierName(tokens[1]);
            supplier.setTotalCredit(Double.parseDouble(tokens[2]));
            supplierList.add(supplier);
        }

        br.close();
        return supplierList;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
