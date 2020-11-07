package com.yaf.mademegood.controller;

import com.yaf.mademegood.model.Disease;
import com.yaf.mademegood.service.DiseaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author arda.fakili
 * @date 4.11.2020 15:18
 */

@Controller
@RequestMapping("admin")
@CrossOrigin("*")
public class AdminController {

    private final DiseaseService diseaseService;

    public AdminController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @GetMapping("hastalik")
    public String diseases(Model model) {

        model.addAttribute("diseases", diseaseService.getAllDiseases());
        model.addAttribute("disease", new Disease());
        model.addAttribute("diseaseToEdit", new Disease());

        return "admin/diseases-table";
    }

    @GetMapping("hastalik/sil/{id}")
    public String deleteDisease(@PathVariable(name = "id") Long id) {
        diseaseService.deleteDiseaseById(id);
        return "redirect:/admin/hastalik";
    }

    @GetMapping("hastalik/guncelle/{id}")
    public Model showUpdateDisease(@PathVariable(name = "id") Long id, Model model) {

        model.addAttribute("diseaseToUpdate", diseaseService.getDiseaseById(id));

        return model;
    }

    @PostMapping("hastalik/ekle")
    public String addDisease(@Valid Disease disease, BindingResult result) {

        if (result.hasErrors()) {
            return "redirect:/admin/hastalik";
        }

        diseaseService.addDisease(disease);
        return "redirect:/admin/hastalik";
    }


    @PostMapping("hastalik/guncelle/{id}")
    public String editDisease(@PathVariable(name = "id") Long id, @Valid Disease disease, BindingResult result, Model model) {

        if (result.hasErrors()) {
            disease.setId(id);
            return "admin/diseases-table-update";
        }

        disease.setId(id);
        diseaseService.updateDisease(disease);

        return "redirect:/admin/hastalik";
    }

}
