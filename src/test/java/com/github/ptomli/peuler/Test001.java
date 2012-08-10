package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test001 {
	@Test
	public void test() {
		int sum = 0;
		for (int x = 999; x > 0; x--) {
			if (x % 3 == 0 || x % 5 == 0)
				sum += x;
		}
		assertThat(sum, is(233168));
	}
}