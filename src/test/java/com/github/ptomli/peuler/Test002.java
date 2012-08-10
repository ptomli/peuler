package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test002 {
	@Test
	public void test() {
		int a = 1,
			b = 2,
			sum = 0;

		do {
			if (b % 2 == 0)
				sum += b;

			int n = a + b;
			a = b;
			b = n;
		}
		while (b <= 4000000);

		assertThat(sum, is(4613732));
	}
}