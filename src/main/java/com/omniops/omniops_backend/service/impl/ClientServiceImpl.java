package com.omniops.omniops_backend.service.impl;

import com.omniops.omniops_backend.entity.Client;
import com.omniops.omniops_backend.repository.ClientRepository;
import com.omniops.omniops_backend.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.omniops.omniops_backend.entity.Lead;
import com.omniops.omniops_backend.repository.LeadRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final LeadRepository leadRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
    @Override
public Client convertLead(Integer leadId) {

    Lead lead = leadRepository.findById(leadId).orElse(null);

    if (lead == null) {
        return null;
    }

    Client client = new Client();

    client.setLead(lead);
    client.setCompanyName(lead.getCompanyName());
    client.setIndustry(lead.getIndustry());
    client.setRecruiterName("TEST_RECRUITER");
client.setExpectedCtc("999999");
    client.setClientType(Client.ClientType.Startup);
    client.setStatus(Client.Status.Active);

    return clientRepository.save(client);
}
}
