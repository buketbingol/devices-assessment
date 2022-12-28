package com.casestudy.devicestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevicestudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevicestudyApplication.class, args);
	}
	
//	@Bean
//    CommandLineRunner runner(DeviceService deviceService) {
//        return args -> {
//            ObjectMapper mapper = new ObjectMapper();
//            TypeReference<List<Device>> typeReference = new TypeReference<List<Device>>() {};
//            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/devices.json");
//            try {
//                List<Device> devices = mapper.readValue(inputStream, typeReference);
//                deviceService.save(devices);
//                System.out.println("Devices Saved!");
//            } catch (IOException e) {
//                System.out.println("Unable to save users: " + e.getMessage());
//            }
//        };
//    }

}
