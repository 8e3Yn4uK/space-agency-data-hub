package com.ve3yn4uk.spaceagencydatahub.rest;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import com.ve3yn4uk.spaceagencydatahub.service.IMissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@RestController
@RequestMapping("/api")
public class MissionRestController {

    private IMissionService missionService;

    @Autowired
    public MissionRestController(IMissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping("/missions")
    public List<Mission> findAll(){
        return missionService.findAll();
    }
}
