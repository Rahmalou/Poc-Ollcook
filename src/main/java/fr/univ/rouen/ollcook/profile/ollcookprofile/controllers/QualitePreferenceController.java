package fr.univ.rouen.ollcook.profile.ollcookprofile.controllers;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.QualitePreference;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.QualitePreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/quality")
public class QualitePreferenceController {
    @Autowired
    private QualitePreferenceRepository qualitePreferenceRepository;

    @GetMapping("")
    public List<QualitePreference> getAll() {
        return qualitePreferenceRepository.findAll();
    }
    @PostMapping
    public QualitePreference save(@RequestBody QualitePreference quality ) {
        return qualitePreferenceRepository.save(quality);
    }
}

