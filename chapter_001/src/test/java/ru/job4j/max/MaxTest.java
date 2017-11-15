package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	@Test
	public void returnMax() {
		Max max = new Max();
		int result = max.returnMax(5, 8);
		int expected = 8;
		assertThat(result, is(expected));
	}
	@Test
	public  void max() {
		Max maxi = new Max();
		int result = maxi.max(5, 11, 4);
		int expected = 11;
		assertThat(result, is(expected));
	}


}