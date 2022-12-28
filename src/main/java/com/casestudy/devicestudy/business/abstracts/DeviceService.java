package com.casestudy.devicestudy.business.abstracts;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.casestudy.devicestudy.entities.concretes.Device;

public interface DeviceService {

	int save(Device device); 
	List<Device> save(List<Device> devices);
	
	Page<Device> getAll(Pageable pageable);
	
	Page<Device> getByBrand(String brand, Pageable pageable);
	Page<Device> getByModel(String model, Pageable pageable);
	Page<Device> getByOs(String os, Pageable pageable);
	Page<Device> getByOsVersion(String osVersion, Pageable pageable);
	
	Page<Device> getByBrandAndModel(String brand, String model, Pageable pageable);
	Page<Device> getByBrandAndOs(String brand, String os, Pageable pageable);
	Page<Device> getByBrandAndOsVersion(String brand, String osVersion, Pageable pageable);
	
	Page<Device> getByModelAndOs(String model, String os, Pageable pageable);
	Page<Device> getByModelAndOsVersion(String model, String osVersion, Pageable pageable);
	
	Page<Device> getByOsAndOsVersion(String os, String osVersion, Pageable pageable);
	
	Page<Device> getByBrandAndModelAndOs(String brand,String model, String os, Pageable pageable);
	Page<Device> getByBrandAndModelAndOsVersion(String brand,String model, String osVersion, Pageable pageable);
	Page<Device> getByBrandAndOsAndOsVersion(String brand, String os, String osVersion, Pageable pageable);
	Page<Device> getByModelAndOsAndOsVersion(String model, String os, String osVersion, Pageable pageable);
	
	
	
	
}
