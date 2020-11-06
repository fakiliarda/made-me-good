package com.yaf.mademegood.service;

import com.yaf.mademegood.model.Disease;

import java.util.List;
import java.util.Optional;

/**
 * @author arda.fakili
 * @date 6.11.2020 16:20
 */

public interface DiseaseService {

    public void addDisease(Disease disease);

    public Disease getDiseaseById(Long id);

    public void deleteDiseaseById(Long id);

    public int updateDisease(Disease disease);

    public List<Disease> getAllDiseases();
}
