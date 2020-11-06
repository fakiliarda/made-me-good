package com.yaf.mademegood.repository;

import com.yaf.mademegood.model.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author arda.fakili
 * @date 6.11.2020 16:28
 */

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long> {


}
