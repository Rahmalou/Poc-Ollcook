package fr.univ.rouen.ollcook.profile.ollcookprofile.controllers;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.OriginPreference;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.OriginPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/origin")
public class OriginPreferenceController {
    @Autowired
    private OriginPreferenceRepository originPreferenceRepository;

    @GetMapping("")
    public List<OriginPreference> getAll() {
        return originPreferenceRepository.findAll();
    }
    @PostMapping
    public OriginPreference save(@RequestBody OriginPreference origin ) {
        return originPreferenceRepository.save(origin);
    }
}

