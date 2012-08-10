package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test005 {
	@Test
	public void test() {
		int x = 20;
		for (int f = 1; f <= 20; f++) {
			if (x % f != 0) {
				x++;
				f = 1;
			}
		}
		assertThat(x, is(232792560));
	}
}
