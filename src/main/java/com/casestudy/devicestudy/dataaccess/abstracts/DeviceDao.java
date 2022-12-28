package com.casestudy.devicestudy.dataaccess.abstracts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.casestudy.devicestudy.entities.concretes.Device;

public interface DeviceDao extends JpaRepository<Device, Integer>{
	
	Device findByBrandAndModelAndOsVersion(String brand, String model, String osVersion);
	Page<Device> findByBrandContaining(String brand, Pageable pageable);
	Page<Device> findByModelContaining(String model, Pageable pageable);
	Page<Device> findByOsContaining(String os, Pageable pageable);
	Page<Device> findByOsVersionContaining(String osVersion, Pageable pageable);
	
	Page<Device> findByBrandAndModelContaining(String brand, String model, Pageable pageable);
	Page<Device> findByBrandAndOsContaining(String brand, String os, Pageable pageable);
    Page<Device> findByBrandAndOsVersionContaining(String brand, String osVersion, Pageable pageable);
    
    Page<Device> findByModelAndOsContaining(String model, String os, Pageable pageable);
    Page<Device> findByModelAndOsVersionContaining(String model, String osVersion, Pageable pageable);
    
    Page<Device> findByOsAndOsVersionContaining(String os, String osVersion, Pageable pageable);
    
    
    Page<Device> findByBrandAndModelAndOsContaining(String brand, String model, String os, Pageable pageable);
    Page<Device> findByBrandAndModelAndOsVersionContaining(String brand, String model, String osVersion, Pageable pageable);
    Page<Device> findByBrandAndOsAndOsVersionContaining(String brand,String os, String osVersion, Pageable pageable);
    Page<Device> findByModelAndOsAndOsVersionContaining(String model,String os, String osVersion, Pageable pageable);
    
	
}
