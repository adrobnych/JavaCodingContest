package com.sysiq.javaeducation.contest.solution;

public class MyClock implements Clock{
	private int hour;
	private int minute;

	@Override
	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public double getAngleInDegrees() {
		double hour_hand_angle_simple = hour * 360.0/12;
		double minute_hand_angle_simple = minute * 360.0/60;
		double hour_hand_delta = (360/12) * (minute / 60.0);
		double raw_angle = Math.abs(hour_hand_angle_simple + hour_hand_delta - minute_hand_angle_simple);
		double reduced_angle = raw_angle % 360;
		return Math.abs(reduced_angle < 180 ? reduced_angle : (360 - reduced_angle) );
	}

}
