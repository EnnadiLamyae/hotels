package org.simple.crud;

import java.util.Arrays;
import java.util.List;

import org.simple.crud.entities.Address;
import org.simple.crud.entities.Hotel;
import org.simple.crud.entities.Review;
import org.simple.crud.repository.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder  implements CommandLineRunner{
	
	private HotelRepository hotelRepository;
	

	public DBSeeder(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}


	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Hotel capitale = new Hotel(
				"Capitale",
				130,
				new Address("Rabat","Morocco"),
				Arrays.asList(
						new Review("lamyae",5,false),
						new Review("ennadi",3,true)
						)
				);
		Hotel ibis = new Hotel(
				"Ibis",
				90,
				new Address("Casablanca","Morocco"),
				Arrays.asList(
						new Review("Jhon",7,true)
						)
				);
		Hotel sofitel = new Hotel(
				"Sofitel",
				230,
				new Address("Fes","Morocco"),
				Arrays.asList(
						new Review("Teddy",9,true)
						)
				);
		//drop all hotels
		this.hotelRepository.deleteAll();
		
		// add our hotel to the database
		List<Hotel> hotels = Arrays.asList(ibis,sofitel,capitale);
		this.hotelRepository.save(hotels);
	}

}
