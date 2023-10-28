package com.project.placement.service;

import java.util.List;

import com.project.placement.entity.Placement;

public interface PlacementService {

	public Placement savePlacement(Placement placement);
	
    public List<Placement> fetchPlacementList();
	
	public void deletePlacementById(Long id);
	
	public Placement updatePlacement(Long id,Placement placement);

	public Placement fetchPlacementById(Long id);

}
