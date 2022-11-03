package com.mfs.account.repo;

import com.mfs.account.entity.AgDhMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AgDhMapRepository extends JpaRepository<AgDhMappingEntity, Long> {
}
