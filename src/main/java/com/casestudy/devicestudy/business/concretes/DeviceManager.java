package com.casestudy.devicestudy.business.concretes;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.casestudy.devicestudy.business.abstracts.DeviceService;
import com.casestudy.devicestudy.dataaccess.abstracts.DeviceDao;
import com.casestudy.devicestudy.entities.concretes.Device;


@Service 
public class DeviceManager implements DeviceService {
	
	private DeviceDao deviceDao;
	
	public DeviceManager(DeviceDao deviceDao) {
		super();
		this.deviceDao = deviceDao;
		
	}
	
	
	@Override
	public int save(Device device) {
		if (device.getOs().equals("Android") || device.getOs().equals("ios")) { // Validation control
			if(deviceDao.findByBrandAndModelAndOsVersion(device.getBrand(), device.getModel(), device.getOsVersion()) == null) { // Validation control
				
				deviceDao.save(device);
				return device.getId();
				
				}else {
					
				return -1; // -1 Error code for device is already exists.
				
			}
		}
		
		else {
			return -2; // -2 Error code for device invalid operating system.
		}
		
	}
	
	public List<Device> save(List<Device> devices) {		
		return deviceDao.saveAll(devices);
	}


	@Override
	public Page<Device> getAll(Pageable pageable) {
	
		return deviceDao.findAll(pageable);
		
	}

	@Override
	public Page<Device> getByBrand(String brand, Pageable pageable) {
		return deviceDao.findByBrandContaining(brand, pageable);
	}
	

	@Override
	public Page<Device> getByModel(String model, Pageable pageable) {
		return deviceDao.findByModelContaining(model, pageable);
	}


	@Override
	public Page<Device> getByOs(String os, Pageable pageable) {
		return deviceDao.findByOsContaining(os, pageable);
	}
	

	@Override
	public Page<Device> getByOsVersion(String osVersion, Pageable pageable) {
		return deviceDao.findByOsVersionContaining(osVersion, pageable);
	}

	

	@Override
	public Page<Device> getByBrandAndModel(String brand, String model, Pageable pageable) {
		return deviceDao.findByBrandAndModelContaining(brand, model, pageable);
	}

	@Override
	public Page<Device> getByBrandAndOs(String brand, String os, Pageable pageable) {
		return deviceDao.findByBrandAndOsContaining(brand, os, pageable);
	}
	
	@Override
	public Page<Device> getByBrandAndOsVersion(String brand, String osVersion, Pageable pageable) {
		return deviceDao.findByBrandAndOsVersionContaining(brand, osVersion, pageable);
	}
	
	@Override
	public Page<Device> getByModelAndOs(String model, String os, Pageable pageable) {
		return deviceDao.findByModelAndOsContaining(model, os, pageable);
	}

	@Override
	public Page<Device> getByModelAndOsVersion(String model, String osVersion, Pageable pageable) {
		return deviceDao.findByModelAndOsVersionContaining(model, osVersion, pageable);
	}
	
	@Override
	public Page<Device> getByOsAndOsVersion(String os, String osVersion, Pageable pageable) {
		return deviceDao.findByOsAndOsVersionContaining(os, osVersion, pageable);
	}

	@Override
	public Page<Device> getByBrandAndModelAndOs(String brand, String model, String os,Pageable pageable) {
		return deviceDao.findByBrandAndModelAndOsContaining(brand, model, os, pageable);
	}
	
	@Override
	public Page<Device> getByBrandAndModelAndOsVersion(String brand, String model, String osVersion,Pageable pageable) {
		return deviceDao.findByBrandAndModelAndOsVersionContaining(brand, model, osVersion, pageable);
	}
	
	@Override
	public Page<Device> getByBrandAndOsAndOsVersion(String brand, String os, String osVersion,Pageable pageable) {
		return deviceDao.findByBrandAndOsAndOsVersionContaining(brand, os, osVersion, pageable);
	}



	@Override
	public Page<Device> getByModelAndOsAndOsVersion(String model, String os, String osVersion, Pageable pageable) {
		return deviceDao.findByModelAndOsAndOsVersionContaining(model, os, osVersion, pageable);
	}
	
	






	


	




	
}
