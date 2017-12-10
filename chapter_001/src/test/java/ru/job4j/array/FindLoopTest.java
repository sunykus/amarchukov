package ru.job4j.array;

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void searchElement() {
        FindLoop findLoop = new FindLoop();
        int[] array = {1, 2, 4, 8, 9, -76};
        int el = -76;
        int expected = 3;
        int result = findLoop.indexOf(array, el);
        assertThat(result, is(expected));
    }

}