package com.mobile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/mobile")//to get url http://localhost:8002/mobile
public class MobileController {
	@Autowired
	MobileService service;
	
	
	@PostMapping("/addMobile")//http://localhost:8002/mobile/addMobile
	public Mobile addMobile(@RequestBody Mobile mob) {
		return service.addMobile(mob);
	}
	@PutMapping("/mobile")//http:localhost:8002/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile mob) {
		return service.updateMobile(mob);
		
	}
	@GetMapping("/getMobile/{mId}")//to get url http://localhost:8002/mobile/getMobile/mId
	public Optional<Mobile> getEmployee(@PathVariable("mId") int mobileId) {
		return service.getMobile( mobileId);
		
	}
	@GetMapping("/getAllMobile")//to get url http://localhost:8002/mobile/getAllMobile
	public Iterable<Mobile> getAllMobile() {
		return service.getAllMobiles();
		
	}
	@DeleteMapping("/deleteMobile/{mId}")//to get url http://localhost:8002/mobile/deleteMobile/mId
	public void deleteEmployee(@PathVariable("mId") int mobileId) {
		service.deleteMobile(mobileId);

}
}
