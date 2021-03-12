package com.tandf.iww.services;

import com.tandf.iww.model.Profile;

import java.util.List;

public interface CrudService<T,ID> {

    Profile findByXmlId(String xmlId);

    List<Profile> findByIndexedNameStartsWithOrderByIndexedName(String letter);

    List<Profile> findByIndexedNameNotLikeOrderByIndexedName();

    List<Profile> findExp(String exp1, String exp2);

}
