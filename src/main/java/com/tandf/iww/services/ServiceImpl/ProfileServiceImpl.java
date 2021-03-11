package com.tandf.iww.services.ServiceImpl;

import com.tandf.iww.model.Profile;
import com.tandf.iww.repository.ProfileRepository;
import com.tandf.iww.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<Profile> findByIndexedNameStartsWithOrderByIndexedName(String letter) {
        return profileRepository.findByIndexedNameStartsWithOrderByIndexedName(letter);
    }

    @Override
    public Profile findByXmlId(String xmlId) {
        return profileRepository.findByXmlId(xmlId);
    }

    @Override
    public List<Profile> findByIndexedNameNotLikeOrderByIndexedName() {
        return profileRepository.findByIndexedNameNotLikeOrderByIndexedName();
    }
}
