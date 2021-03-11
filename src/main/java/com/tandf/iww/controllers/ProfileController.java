package com.tandf.iww.controllers;

import com.tandf.iww.model.Profile;
import com.tandf.iww.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController  {

    ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/{id}")
    public Profile findProfileByXmlId(@PathVariable("id") String id) {

        return profileService.findByXmlId(id);
    }

    @GetMapping("/browse")
    public List<String> findByLetter(@RequestParam("letter") String letter) {

        List<Profile> profileList;

        if (letter.equalsIgnoreCase("*")) {
            profileList = profileService.findByIndexedNameNotLikeOrderByIndexedName();
        } else {
            profileList = profileService.findByIndexedNameStartsWithOrderByIndexedName(letter.toUpperCase());
        }

        List <String> indexName = new ArrayList<>();

        for (Profile profile : profileList) {
            indexName.add(profile.getIndexedName());
        }
        return indexName;
    }

}
