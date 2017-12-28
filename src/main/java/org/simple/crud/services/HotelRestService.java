package org.simple.crud.services;

import java.util.List;

import org.simple.crud.entities.Hotel;
import org.simple.crud.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelRestService {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping("/all")
	public List<Hotel> hotels(){
		
		List<Hotel> hotels = this.hotelRepository.findAll();
		return hotels;
	}
}
