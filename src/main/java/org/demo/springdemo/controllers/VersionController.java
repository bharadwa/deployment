package org.demo.springdemo.controllers;

import org.demo.springdemo.dtos.VersionDTO;
import org.demo.springdemo.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/version")
@RestController
public class VersionController {


    private final VersionService versionService;

    @Autowired
    public VersionController(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping
    public VersionDTO getVersion(){
        String version= this.versionService.getVersion();
        VersionDTO dto =new VersionDTO();
        dto.setVersion(version);
        return dto;
    }
}
