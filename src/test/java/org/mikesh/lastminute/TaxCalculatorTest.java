package org.mikesh.lastminute;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void simpleTaxCalculation() {
        Goods goods = new Goods(1, false, true, "chocolate bar", BigDecimal.valueOf(1));
        BigDecimal taxAmount = TaxCalculator.calculate(goods);
        assertEquals(BigDecimal.ZERO, taxAmount);
    }

    @Test
    public void importedGoodsTaxCalculation() {
        Goods goods = new Goods(1, true, false, "cd", BigDecimal.valueOf(1));
        BigDecimal taxAmount = TaxCalculator.calculate(goods);
        assertEquals(BigDecimal.valueOf(0.15), taxAmount);
    }

    @Test
    public void roundTaxCalculation() {
        Goods goods = new Goods(1, true, false, "cd", BigDecimal.valueOf(0.8));
        BigDecimal taxAmount = TaxCalculator.calculate(goods);
        assertEquals(BigDecimal.valueOf(0.15), taxAmount);
    }

}