package fr.univ.rouen.ollcook.profile.ollcookprofile.controllers;

import fr.univ.rouen.ollcook.profile.ollcookprofile.models.AlimentaryRegime;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.AlimentaryRegimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/diet")
public class AlimentaryRegimeController {
    @Autowired
    private AlimentaryRegimeRepository alimentaryRegimeRepository;

    @GetMapping("")
    public List<AlimentaryRegime> getAll() {
        return alimentaryRegimeRepository.findAll();
    }
    @PostMapping
    public AlimentaryRegime save(@RequestBody AlimentaryRegime diet ) {
        return alimentaryRegimeRepository.save(diet);
    }
}

