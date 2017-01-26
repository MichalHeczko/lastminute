package org.mikesh.lastminute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodsTest {

    @Test
    public void constructorTest() {
        Goods goods = new Goods(1, false, false, "chocolate bar", 0.85);

        assertEquals(1, goods.getAmount());
        assertEquals(false, goods.isImported());
        assertEquals(false, goods.isTaxApplicable());
        assertEquals("chocolate bar", goods.getName());
        assertEquals(0.85, goods.getPrice(), 0.0);
    }
}
