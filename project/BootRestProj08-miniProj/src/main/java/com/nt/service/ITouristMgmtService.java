package com.nt.service;

import java.util.List;

import com.nt.entity.Tourist;
import com.nt.error.TouristNotFoundException;

public interface ITouristMgmtService {
	public String registerTourist(Tourist tourist);
	public List<Tourist>fetchAllTourist();
	public Tourist fetchTouristById(Integer id)throws TouristNotFoundException;
}
