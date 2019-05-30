package com.sak.sarma.nwmontool.model;

public enum IpStatus {
	DOWN,
	UP,
	PACKET_LOSS;

	public String getIpStatus() {
		return this.toString();
	}
}
