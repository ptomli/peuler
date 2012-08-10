package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test006 {
	@Test
	public void test() {
		int x = 0,
			y = 0;

		for (int i = 1; i <= 100; i++) {
			x += (i * i);
			y += i;
		}
		y = (y * y);

		assertThat(y - x, is(25164150));
	}
}
