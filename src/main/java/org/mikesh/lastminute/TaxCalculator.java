package org.mikesh.lastminute;

import java.math.BigDecimal;

public class TaxCalculator {
    private final static int GOODS_TAX_RATE = 10;
    private final static int IMPORT_TAX_RATE = 5;

    public static BigDecimal calculate(Goods goods) {
        double taxRate = 0;
        if (goods.isImported())
            taxRate += IMPORT_TAX_RATE;
        if (!goods.isExampt())
            taxRate += GOODS_TAX_RATE;

        BigDecimal tax = goods.getPrice().multiply(BigDecimal.valueOf(taxRate / 100));

        return (tax.multiply(BigDecimal.valueOf(20))).setScale(0, BigDecimal.ROUND_CEILING).divide(BigDecimal.valueOf(20));
    }
}
