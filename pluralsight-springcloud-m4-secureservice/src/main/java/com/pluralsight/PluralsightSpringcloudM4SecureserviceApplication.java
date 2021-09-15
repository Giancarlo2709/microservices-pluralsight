package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.web.servlet.oauth2.resourceserver.OAuth2ResourceServerSecurityMarker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@OAuth2ResourceServerSecurityMarker
public class PluralsightSpringcloudM4SecureserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM4SecureserviceApplication.class, args);
	}
	
	@GetMapping("/tolldata")
	public List<TollUsage> getTollData() {
		TollUsage instance1 = new TollUsage("200", "station150", "B65GT1W", "2021-09-13T22:23:22");
		TollUsage instance2 = new TollUsage("201", "station119", "AHY673B", "2021-09-13T22:24:11");
		TollUsage instance3 = new TollUsage("202", "station150", "ZN2GP0", "2021-09-13T22:25:45");
		
		List<TollUsage> tolls = new ArrayList<>();
		tolls.add(instance1);
		tolls.add(instance2);
		tolls.add(instance3);
		
		return tolls;
	}
	
	public class TollUsage {
		public String id;
		public String stationId;
		public String licensePlate;
		public String timestamp;
		
		public TollUsage() {}

		public TollUsage(String id, String stationId, String licensePlate, String timestamp) {
			super();
			this.id = id;
			this.stationId = stationId;
			this.licensePlate = licensePlate;
			this.timestamp = timestamp;
		}		
		
	}

}
