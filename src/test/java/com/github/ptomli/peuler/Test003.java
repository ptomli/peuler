package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test003 {
	@Test
	public void test() {
		long n = 600851475143L;
		long i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				n /= i;
				i--;
			}
		}
		assertThat(i, is(6857L));
	}
}