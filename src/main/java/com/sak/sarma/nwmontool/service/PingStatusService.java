package com.sak.sarma.nwmontool.service;

import com.sak.sarma.nwmontool.model.IpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PingStatusService {

	private Map<String, Map<String, IpStatus>> siteStatus = new HashMap<>();

	public void saveStatus(String locationName, String ip, IpStatus ipStatus) {

		if(!siteStatus.containsKey(locationName)) {
			siteStatus.put(locationName, new HashMap<>());
		}
		siteStatus.get(locationName).put(ip, ipStatus);
	}

	public Map<String, Map<String, IpStatus>> getAllLocationsStatus(){
		return siteStatus;
	}
}
