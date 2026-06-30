package com.omniops.omniops_backend.service.impl;

import com.omniops.omniops_backend.dto.JDResponse;
import com.omniops.omniops_backend.service.JDService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JDServiceImpl implements JDService {

    @Override
    public JDResponse fetchJobDetails(String url) {

        JDResponse response = new JDResponse();

        try {

            Document doc = Jsoup
                    .connect(url)
                    .userAgent("Mozilla/5.0")
                    .timeout(10000)
                    .get();

            response.setDescription(doc.text());

            String title = doc.title();

            response.setRole(title);

            response.setCompany("Not Found");
            response.setLocation("Not Detected");
            response.setExperience("Not Detected");
            response.setEmploymentType("Not Detected");
            response.setSkills(new ArrayList<>());

        } catch (Exception e) {

            response.setCompany("Unable to Fetch");
            response.setRole("Unable to Fetch");
            response.setLocation("");
            response.setExperience("");
            response.setEmploymentType("");
            response.setDescription("");
            response.setSkills(new ArrayList<>());

        }

        return response;
    }
}