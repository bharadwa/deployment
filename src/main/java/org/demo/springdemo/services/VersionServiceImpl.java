package org.demo.springdemo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceImpl implements VersionService {


    private static final Logger logger = LoggerFactory.getLogger(VersionServiceImpl.class);


    @Override
    public String getVersion() {
        logger.info("Fetching application version");
        return "1.0.0";
    }
}
