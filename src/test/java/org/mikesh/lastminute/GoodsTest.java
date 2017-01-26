package org.mikesh.lastminute;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void constructorTest() {
        Goods goods = new Goods(1, false, false, "chocolate bar", BigDecimal.valueOf(0.85));

        assertEquals(1, goods.getAmount());
        assertEquals(false, goods.isImported());
        assertEquals(false, goods.isExampt());
        assertEquals("chocolate bar", goods.getName());
        assertEquals(BigDecimal.valueOf(0.85), goods.getPrice());
    }
}
