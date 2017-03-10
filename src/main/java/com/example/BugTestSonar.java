package com.example;

import java.math.BigDecimal;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BugTestSonar {
	@Test
	public void getAge() {
		double age = 15;
		BigDecimal ageDecim = new BigDecimal(age);
		
		System.out.println("hey me"); 

		System.out.println("hey me"); 
		


		System.out.println("hey me"); 

		boolean elem1 = true;
		boolean elem2 = false;

		assertThat(elem1, equalTo(elem2));

	}

}
