package com.omniops.omniops_backend.service;

import com.omniops.omniops_backend.entity.Client;

import java.util.List;

public interface ClientService {

    Client save(Client client);

    List<Client> findAll();

    Client findById(Integer id);

    void delete(Integer id);
Client convertLead(Integer leadId);
}