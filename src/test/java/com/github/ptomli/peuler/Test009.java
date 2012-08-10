package com.github.ptomli.peuler;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test009 {
	@Test
	public void test() {
		int a = 0,
			b = 1,
			c = 2,
			a2 = (a * a),
			b2 = (b * b),
			c2 = (c * c);

		do {
			c++;
			if (c > 1000) {
				b++;
				c = b + 1;
				if (b > 999) {
					a++;
					b = a + 1;
				}
			}

			a2 = a * a;
			b2 = b * b;
			c2 = c * c;
		}
		while (a2 + b2 != c2 || a + b + c != 1000);

		assertThat(a * b * c, is(31875000));
	}
}
