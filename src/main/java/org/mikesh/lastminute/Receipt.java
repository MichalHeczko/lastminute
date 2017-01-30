package org.mikesh.lastminute;

import java.math.BigDecimal;
import java.util.List;

public class Receipt {
    final private List<Goods> goodsList;
    private BigDecimal salesTax = BigDecimal.ZERO;
    private BigDecimal total = BigDecimal.ZERO;
    private String printing;

    Receipt(final List<Goods> goodsList) {
        this.goodsList = goodsList;

        for (Goods goods : goodsList) {
            BigDecimal tax = TaxCalculator.calculate(goods).multiply(BigDecimal.valueOf(goods.getAmount()));
            salesTax = salesTax.add(tax);
            total = total.add(BigDecimal.valueOf(goods.getAmount()).multiply(goods.getPrice()).add(tax));
        }

        printing = printing();
    }

    private String printing() {
        StringBuilder sb = new StringBuilder();

        for (Goods goods : goodsList) {
            sb.append(goods.getAmount())
                    .append(" ");

            if (goods.isImported())
                sb.append("imported ");
            sb.append(goods.getName())
                    .append(": ")
                    .append(goods.getPrice()
                            .add(TaxCalculator.calculate(goods))
                            .multiply(BigDecimal.valueOf(goods.getAmount())).setScale(2))
                    .append('\n');
        }

        sb.append("Sales Taxes: ").append(getSalesTax().setScale(2)).append('\n');
        sb.append("Total: ").append(getTotal().setScale(2)).append('\n');

        return sb.toString();
    }

    BigDecimal getSalesTax() {
        return salesTax;
    }

    BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return printing;
    }
}