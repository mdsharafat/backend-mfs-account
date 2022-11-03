package com.mfs.account.repo;


import com.mfs.account.entity.SystemAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemAccountRepository extends JpaRepository<SystemAccountEntity, Long> {
}
