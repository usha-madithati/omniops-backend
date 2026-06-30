package com.omniops.omniops_backend.repository;

import com.omniops.omniops_backend.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {

}