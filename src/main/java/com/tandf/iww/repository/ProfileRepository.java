package com.tandf.iww.repository;

import com.tandf.iww.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByXmlId(String xmlId);


   // @Query(value = "select p from Profile p where p.indexed_name similar to ':letter%|&:letter%' order by indexed_name")
    List<Profile> findByIndexedNameStartsWithOrderByIndexedName(String letter);

    @Query(value = "select * from ww_people where indexed_name not similar to '[A-Z]%|&[A-Z]%' order by indexed_name", nativeQuery = true)
    List<Profile> findByIndexedNameNotLikeOrderByIndexedName();
}
