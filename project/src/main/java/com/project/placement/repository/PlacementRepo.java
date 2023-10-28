package com.project.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.placement.entity.Placement;

@Repository
public interface PlacementRepo extends JpaRepository<Placement, Long>{

}
