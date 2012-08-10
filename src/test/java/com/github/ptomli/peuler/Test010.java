package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test010 {

	@Test
	public void test() {
		long sum = 2;
		for (int i = 3; i < 2000000; i += 2) {
			if (prime(i))
				sum += i;
		}

		assertThat(sum, is(142913828922L));
	}
	private boolean prime(int n) {
		if (n % 2 == 0) return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
