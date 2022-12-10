package com.buraksahin.carpricecollector.controller;

import com.buraksahin.carpricecollector.domain.request.CollectRequest;
import com.buraksahin.carpricecollector.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collect")
public class CollectController {
    private final CollectService collectService;

    @Autowired
    public CollectController(CollectService collectService) {
        this.collectService = collectService;
    }

    @PostMapping(path="/saveBulkRecord", produces = "application/json")
    public ResponseEntity<String> saveBulkRecord(@RequestBody CollectRequest collectRequest){
        return ResponseEntity.ok(collectService.createCarCollection(collectRequest));
    }
}
