package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test007 {
	@Test
	public void test() {
		int i = 0,
			c = 0;

		while (c < 10001) {
			i++;
			if (prime(i))
				c++;
		}
		assertThat(i, is(104743));
	}
	private static boolean prime(int n) {
		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		int m = (int) Math.sqrt(n) + 1;
		for (int i = 3; i < m; i+=2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
