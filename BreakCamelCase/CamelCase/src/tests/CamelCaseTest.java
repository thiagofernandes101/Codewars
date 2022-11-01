package tests;

import main.CamelCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamelCaseTest {

    @Test
    public void breakInput() {
        assertEquals( "Incorrect", "camel Casing", CamelCase.breakInput("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", CamelCase.breakInput("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", CamelCase.breakInput("camelcasingtest"));
    }
}