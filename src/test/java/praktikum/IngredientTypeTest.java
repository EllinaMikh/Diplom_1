package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {

    @Test
    public void testEnumValueSauceExists() {
        Assert.assertNotNull(IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void testEnumValueFillingExists() {
        Assert.assertNotNull(IngredientType.valueOf("FILLING"));
    }

    @Test
    public void testEnumValuesLength() {
        IngredientType[] values = IngredientType.values();
        Assert.assertEquals("Ожидается 2 типа ингредиентов", 2, values.length);
    }

    @Test
    public void testEnumFirstValueIsSauce() {
        IngredientType[] values = IngredientType.values();
        Assert.assertEquals(IngredientType.SAUCE, values[0]);
    }

    @Test
    public void testEnumSecondValueIsFilling() {
        IngredientType[] values = IngredientType.values();
        Assert.assertEquals(IngredientType.FILLING, values[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnumValueThrowsException() {
        IngredientType.valueOf("INVALID_TYPE");
    }
}