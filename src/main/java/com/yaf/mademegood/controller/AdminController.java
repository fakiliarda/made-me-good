package com.yaf.mademegood.controller;

import com.yaf.mademegood.model.Disease;
import com.yaf.mademegood.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author arda.fakili
 * @date 4.11.2020 15:18
 */

@Controller
@RequestMapping("admin")
public class AdminController {

    private final DiseaseService diseaseService;

    public AdminController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @GetMapping("hastalik")
    public ModelAndView diseases() {

        ModelAndView model = new ModelAndView("admin/diseases");
        model.addObject("diseases", diseaseService.getAllDiseases());

        return model;
    }

    @PostMapping("hastalik")
    public String addDisease(@RequestParam(name = "disease") Disease disease) {
        diseaseService.addDisease(disease);
        return "admin/diseases";
    }

    @DeleteMapping("hastalik")
    public String deleteDisease(@RequestParam(name = "id") Long id) {
        diseaseService.deleteDiseaseById(id);
        return "admin/diseases";
    }

    @PostMapping("hastalik")
    public String updateDisease(@RequestParam(name = "disease") Disease disease) {
        diseaseService.updateDisease(disease);
        return "admin/diseases";
    }

}
