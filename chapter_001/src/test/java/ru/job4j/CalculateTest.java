package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Aleksandr Marchukov (mailto:sunykus@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test echo.
     * Test
     */
//@Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Aleksandr Marchukov";
        String expect = "Echo, echo, echo : Aleksandr Marchukov";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}