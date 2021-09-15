package com.pluralsight;

import java.util.Hashtable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PluralsightSpringcloudM5Dataservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM5Dataservice2Application.class, args);
	}
	
	@GetMapping(value="/customer/{cid}/vehicledetails")
	public String getCustomerVehicleDetails(@PathVariable Integer cid) {
		
		Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
		vehicles.put(100, "Lincoln Continental; Plate SNUG30");
		vehicles.put(101, "Chevrolet Camaro; Plate R7TYR43");
		vehicles.put(102, "Volkswagen Beetle; Plate 6CVI3E2");
		
		String result = vehicles.get(cid);
		
		return result;
	}

}
