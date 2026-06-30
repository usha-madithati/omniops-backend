package com.omniops.omniops_backend.service;

import com.omniops.omniops_backend.dto.JDResponse;

public interface JDService {

    JDResponse fetchJobDetails(String url);

}