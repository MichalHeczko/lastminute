package org.mikesh.lastminute;

import java.math.BigDecimal;

public class Goods {
    private final int amount;
    private final boolean imported;
    private final boolean exampt;
    private final String name;
    private final BigDecimal price;

    public Goods(int amount, boolean imported, boolean exampt, String name, BigDecimal price) {
        this.amount = amount;
        this.imported = imported;
        this.exampt = exampt;
        this.name = name;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isImported() {
        return imported;
    }

    public boolean isExampt() {
        return exampt;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
