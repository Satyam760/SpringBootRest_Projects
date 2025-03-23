package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.error.TouristNotFoundException;
import com.nt.repo.ITouristRepo;

@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo touristRepo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		
		return "Tourist is registed having the id val :: "+touristRepo.save(tourist).getTid();
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> list=touristRepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer tid) throws TouristNotFoundException {
		
		return touristRepo.findById(tid)
				.orElseThrow(()->new TouristNotFoundException(tid+"tourist not found"));
	}
	
	
	

}
