package com.casestudy.devicestudy.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.devicestudy.business.abstracts.DeviceService;
import com.casestudy.devicestudy.entities.concretes.Device;

@RestController 
@RequestMapping("/api/devices") // localhost:8080/api/devices

public class DeviceController {
	
	private DeviceService deviceService; 
	
	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService; 
											
	}
	
	@PutMapping("/save") // localhost:8080/api/devices/save
	public int save(@RequestBody Device device) {
		return deviceService.save(device);
	}
	
	@GetMapping(params = {"page"})
	public Page<Device> getAll(@RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		
		return deviceService.getAll(pageable);
	}
	
	@GetMapping(params = {"brand", "page"})
	public Page<Device> getByBrand(@RequestParam String brand, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrand(brand, pageable);
	}
	
	@GetMapping(params= {"model", "page"})
	public Page<Device> getByModel(@RequestParam String model, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByModel(model, pageable);
	}
	@GetMapping(params = {"os","page"})
	public Page<Device> getByOs(@RequestParam String os, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByOs(os, pageable);
	}
	
	@GetMapping(params = {"osVersion","page"})
	public Page<Device> getByOsVersion(@RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByOsVersion(osVersion, pageable);
	}
	
	@GetMapping(params = {"brand","model","page"})
	public Page<Device> getByBrandAndModel(@RequestParam String brand, @RequestParam String model, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndModel(brand, model, pageable);
	}
	
	@GetMapping(params = {"brand","os","page"})
	public Page<Device> getByBrandAndOs(@RequestParam String brand, @RequestParam String os, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndOs(brand, os, pageable);
	}
	
	@GetMapping(params = {"brand", "osVersion", "page"})
	public Page<Device> getByBrandAndOsVersion(@RequestParam String brand, @RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndOsVersion(brand, osVersion, pageable);
	}
	
	@GetMapping(params = {"model", "os", "page"})
	public Page<Device> getByModelAndOs(@RequestParam String model, @RequestParam String os, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByModelAndOs(model, os, pageable);
	}
	
	@GetMapping(params = {"model", "osVersion", "page"})
	public Page<Device> getByModelAndOsVersion(@RequestParam String model, @RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByModelAndOsVersion(model, osVersion, pageable);
	}
	
	@GetMapping(params = {"os", "osVersion", "page"})
	public Page<Device> getByOsAndOsVersion(@RequestParam String os, @RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByOsAndOsVersion(os, osVersion, pageable);
	}
	
	@GetMapping(params = {"brand", "model", "os", "page"})
	public Page<Device> getByBrandAndModelAndOs(@RequestParam String brand, @RequestParam String model,@RequestParam String os, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndModelAndOs(brand,model, os, pageable);
	}
	
	@GetMapping(params = {"brand", "model", "osVersion", "page"})
	public Page<Device> getByBrandAndModelAndOsVersion(@RequestParam String brand, @RequestParam String model,@RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndModelAndOsVersion(brand,model, osVersion, pageable);
	}
	
	@GetMapping(params = {"brand", "os", "osVersion", "page"})
	public Page<Device> getByBrandAndOsAndOsVersion(@RequestParam String brand, @RequestParam String os,@RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByBrandAndOsAndOsVersion(brand,os, osVersion, pageable);
	}
	
	@GetMapping(params = {"model", "os", "osVersion", "page"})
	public Page<Device> getByModelAndOsAndOsVersion(@RequestParam String model, @RequestParam String os, @RequestParam String osVersion, @RequestParam int page){
		Pageable pageable = PageRequest.of(page-1, 5);
		return deviceService.getByModelAndOsAndOsVersion(model, os, osVersion, pageable);
	}

}
