package com.getrosoft.teleport.repository;

import com.getrosoft.teleport.model.TrackingNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingNumberRepository extends JpaRepository<TrackingNumber, Long> {
	boolean existsByTrackingNumber(String trackingNumber);
}
