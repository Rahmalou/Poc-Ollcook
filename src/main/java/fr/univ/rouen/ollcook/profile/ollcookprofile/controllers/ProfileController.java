package fr.univ.rouen.ollcook.profile.ollcookprofile.controllers;
import fr.univ.rouen.ollcook.profile.ollcookprofile.Dto.ApiResponseDTO;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.Profile;
import fr.univ.rouen.ollcook.profile.ollcookprofile.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/user")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile/{id}")
    public Profile getprofile(@PathVariable UUID id){
        return profileService.getprofile(id);
    }


    @PutMapping("/diet/{id}")
    public ApiResponseDTO addAlimentaryRegime (@PathVariable UUID id, @RequestBody List<UUID> diets) {

        return profileService.addAlimentaryRegime(id,diets);

    }

    @PutMapping("/origin/{id}")
    public ApiResponseDTO addOriginPreference (@PathVariable UUID id, @RequestBody List<UUID> origin) {

        return profileService.addOriginPreference(id,origin);

    }

    @PutMapping("/quality/{id}")
    public ApiResponseDTO addQualitePreference (@PathVariable UUID id, @RequestBody List<UUID> qualities) {

        return profileService.addQualitePreference(id,qualities);

    }

}
