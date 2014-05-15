package com.sysiq.javaeducation.contest.spec;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sysiq.javaeducation.contest.solution.Clock;
import com.sysiq.javaeducation.contest.solution.MyClock;

public class AprilJavaNinjaSpec {

	@Test
	public void test12_00() {
		Clock clock = new MyClock();
		clock.setHour(12);
		clock.setMinute(0);
		assertEquals(0, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test12_20() {
		Clock clock = new MyClock();
		clock.setHour(12);
		clock.setMinute(20);
		assertEquals(110, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test16_04() {
		Clock clock = new MyClock();
		clock.setHour(16);
		clock.setMinute(4);
		assertEquals(98, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test13_35() {
		Clock clock = new MyClock();
		clock.setHour(13);
		clock.setMinute(35);
		assertEquals(162.5, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test9_00() {
		Clock clock = new MyClock();
		clock.setHour(9);
		clock.setMinute(0);
		assertEquals(90, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test21_00() {
		Clock clock = new MyClock();
		clock.setHour(21);
		clock.setMinute(0);
		assertEquals(90, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test6_00() {
		Clock clock = new MyClock();
		clock.setHour(6);
		clock.setMinute(0);
		assertEquals(180, clock.getAngleInDegrees(), 0.001);
	}
	
	@Test
	public void test18_00() {
		Clock clock = new MyClock();
		clock.setHour(18);
		clock.setMinute(0);
		assertEquals(180, clock.getAngleInDegrees(), 0.001);
	}

}
