package org.mikesh.lastminute;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReceiptTest {

    @Test
    public void receiptInput1Test() {
        List<Goods> goodsList = Arrays.asList(
                new Goods(1, false, true, "book", BigDecimal.valueOf(12.49)),
                new Goods(1, false, false, "music CD", BigDecimal.valueOf(14.99)),
                new Goods(1, false, true, "chocolate bar", BigDecimal.valueOf(0.85))
        );

        Receipt receipt = new Receipt(goodsList);

        assertEquals(BigDecimal.valueOf(1.50), receipt.getSalesTax());
        assertEquals(BigDecimal.valueOf(29.83), receipt.getTotal());
        assertEquals(getOutput1(), receipt.toString());

        System.out.println(receipt);
    }

    @Test
    public void receiptInput2Test() {
        List<Goods> goodsList = Arrays.asList(
                new Goods(1, true, true, "box of chocolates", BigDecimal.valueOf(10.00)),
                new Goods(1, true, false, "bottle of perfume", BigDecimal.valueOf(47.50))
        );

        Receipt receipt = new Receipt(goodsList);

        assertEquals(BigDecimal.valueOf(7.65), receipt.getSalesTax());
        assertEquals(BigDecimal.valueOf(65.15), receipt.getTotal());
        assertEquals(getOutput2(), receipt.toString());

        System.out.println(receipt);
    }

    @Test
    public void receiptInput3Test() {
        List<Goods> goodsList = Arrays.asList(
                new Goods(1, true, false, "bottle of perfume", BigDecimal.valueOf(27.99)),
                new Goods(1, false, false, "bottle of perfume", BigDecimal.valueOf(18.99)),
                new Goods(1, false, true, "packet of headache pills", BigDecimal.valueOf(9.75)),
                new Goods(1, true, true, "box of chocolates", BigDecimal.valueOf(11.25))
        );

        Receipt receipt = new Receipt(goodsList);

        assertEquals(BigDecimal.valueOf(6.70), receipt.getSalesTax());
        assertEquals(BigDecimal.valueOf(74.68), receipt.getTotal());
        assertEquals(getOutput3(), receipt.toString());

        System.out.println(receipt);
    }

    private String getOutput1() {
        return "1 book: 12.49\n" +
                "1 music CD: 16.49\n" +
                "1 chocolate bar: 0.85\n" +
                "Sales Taxes: 1.50\n" +
                "Total: 29.83\n";
    }

    private String getOutput2() {
        return "1 imported box of chocolates: 10.50\n" +
                "1 imported bottle of perfume: 54.65\n" +
                "Sales Taxes: 7.65\n" +
                "Total: 65.15\n";
    }


    private String getOutput3() {
        return "1 imported bottle of perfume: 32.19\n" +
                "1 bottle of perfume: 20.89\n" +
                "1 packet of headache pills: 9.75\n" +
                "1 imported box of chocolates: 11.85\n" +
                "Sales Taxes: 6.70\n" +
                "Total: 74.68\n";
    }
}
