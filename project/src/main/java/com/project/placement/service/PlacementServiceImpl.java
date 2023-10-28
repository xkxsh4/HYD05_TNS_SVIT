package com.project.placement.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.placement.entity.Placement;
import com.project.placement.repository.PlacementRepo;

@Service
public class PlacementServiceImpl implements PlacementService{
	
	@Autowired
	private PlacementRepo placementRepo;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return placementRepo.save(placement);
	
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return placementRepo.findAll();
		
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		placementRepo.deleteById(id);
		
	}

	

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return placementRepo.findById(id).get();
	}
	
	@Override
	public Placement updatePlacement(Long id, Placement placement) {
		// TODO Auto-generated method stub
		Placement place = placementRepo.findById(id).get();
		
		if (Objects.nonNull(placement.getName()) && !"".equalsIgnoreCase(placement.getName()))
		{
			place.setName(placement.getName());
		}
		
		if (Objects.nonNull(placement.getCollege()) && !"".equalsIgnoreCase(placement.getCollege()))
		{
			place.setCollege(placement.getCollege());
		}
		
		if (Objects.nonNull(placement.getDate()) )
		{
			place.setDate(placement.getDate());
		}
		
		if (Objects.nonNull(placement.getQualification()) && !"".equalsIgnoreCase(placement.getQualification()))
		{
			place.setQualification(placement.getQualification());
		}
		
		if (Objects.nonNull(placement.getYear()))
		{
			place.setYear(placement.getYear());
		}
		
		return placementRepo.save(place);
	}
	

}
