package org.mikesh.lastminute;

public class Goods {
    private final int amount;
    private final boolean imported;
    private final boolean taxApplicable;
    private final String name;
    private final double price;

    public Goods(int amount, boolean imported, boolean taxApplicable, String name, double price) {
        this.amount = amount;
        this.imported = imported;
        this.taxApplicable = taxApplicable;
        this.name = name;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isImported() {
        return imported;
    }

    public boolean isTaxApplicable() {
        return taxApplicable;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
