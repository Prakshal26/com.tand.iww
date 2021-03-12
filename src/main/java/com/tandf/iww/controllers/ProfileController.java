package com.tandf.iww.controllers;

import com.tandf.iww.model.Profile;
import com.tandf.iww.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController implements ErrorController {

    ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public Profile findProfileByXmlId(@RequestParam("id") String id) {

        try {
            return profileService.findByXmlId(id);
        } catch (Exception e){
            return null;
        }
    }

    @GetMapping("/browse")
    public List<String> findByLetter(@RequestParam("letter") String letter) {

        List<Profile> profileList;
        try {
            if (letter.isEmpty()) {
                profileList = profileService.findByIndexedNameNotLikeOrderByIndexedName();
            } else {
              //  profileList = profileService.findByIndexedNameStartsWithOrderByIndexedName(letter.toUpperCase());
                letter =letter.toUpperCase();
                profileList = profileService.findExp(letter,"&"+letter);

            }
            List<String> indexNames = new ArrayList<>();
            for (Profile profile : profileList) {
                indexNames.add(profile.getIndexedName());
            }
            return indexNames;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/error")
    public String errorHandle(){
        return "Invalid URL";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
