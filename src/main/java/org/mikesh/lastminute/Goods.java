package org.mikesh.lastminute;

import java.math.BigDecimal;

class Goods {
    private final int amount;
    private final boolean imported;
    private final boolean exampt;
    private final String name;
    private final BigDecimal price;

    Goods(int amount, boolean imported, boolean exampt, String name, BigDecimal price) {
        this.amount = amount;
        this.imported = imported;
        this.exampt = exampt;
        this.name = name;
        this.price = price;
    }

    int getAmount() {
        return amount;
    }

    boolean isImported() {
        return imported;
    }

    boolean isExampt() {
        return exampt;
    }

    String getName() {
        return name;
    }

    BigDecimal getPrice() {
        return price;
    }
}