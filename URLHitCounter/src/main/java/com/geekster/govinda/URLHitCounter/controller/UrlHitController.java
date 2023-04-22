package com.geekster.govinda.URLHitCounter.controller;

import com.geekster.govinda.URLHitCounter.model.HitCountResponse;
import com.geekster.govinda.URLHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/v1/visitor-count-app")

public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("/count")
    public ResponseEntity<HitCountResponse> getHitCount() {
        int hitCount = urlHitService.getHitCount();
        HitCountResponse response = new HitCountResponse("gm235612", hitCount);
        return ResponseEntity.ok(response);
    }



}
