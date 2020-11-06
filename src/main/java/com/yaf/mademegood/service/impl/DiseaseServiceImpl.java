package com.yaf.mademegood.service.impl;

import com.yaf.mademegood.model.Disease;
import com.yaf.mademegood.repository.DiseaseRepository;
import com.yaf.mademegood.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author arda.fakili
 * @date 6.11.2020 16:21
 */

@Service
public class DiseaseServiceImpl implements DiseaseService {

    private final DiseaseRepository diseaseRepository;

    @Autowired
    public DiseaseServiceImpl(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @Override
    public void addDisease(Disease disease) {
        diseaseRepository.save(disease);
    }

    @Override
    public Disease getDiseaseById(Long id) {
        return diseaseRepository.getOne(id);
    }

    @Override
    public void deleteDiseaseById(Long id) {
        diseaseRepository.deleteById(id);
    }

    @Override
    public int updateDisease(Disease disease) {
        diseaseRepository.save(disease);
        return 1;
    }

    @Override
    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }
}
