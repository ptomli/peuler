package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test004 {
	@Test
	public void test() {
		int x = 0;
		for (int a = 999; a > 99; a--) {
			for (int b = a; b > 99; b--) {
				int n = a * b;
				if (String.valueOf(n).equals(new StringBuilder().append(n).reverse().toString())) {
					x = Math.max(x, n);
				}
			}
		}
		assertThat(x, is(906609));
	}
}
