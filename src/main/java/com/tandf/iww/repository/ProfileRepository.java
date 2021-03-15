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

    List<Profile> findByPlainIndexedNameStartsWithOrderByPlainIndexedName( String letter);

    @Query(value = "select *\n" +
            "from \n" +
            "ww_people where indexed_name not similar to '[A-Z]%|&[A-Z]%'\n" +
            "order by substring(indexed_name, '^[0-9]+'), substring(indexed_name, '[^0-9]*$')", nativeQuery = true)
    List<Profile> findByIndexedNameNotLikeOrderByIndexedName();

}
