package fr.univ.rouen.ollcook.profile.ollcookprofile.services;

import fr.univ.rouen.ollcook.profile.ollcookprofile.Dto.ApiResponseDTO;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.AlimentaryRegime;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.OriginPreference;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.Profile;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.QualitePreference;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.AlimentaryRegimeRepository;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.OriginPreferenceRepository;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.ProfileRepository;
import fr.univ.rouen.ollcook.profile.ollcookprofile.repository.QualitePreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private AlimentaryRegimeRepository alimentaryRegimeRepository;
    @Autowired
    private OriginPreferenceRepository originPreferenceRepository;
    @Autowired
    private QualitePreferenceRepository qualitePreferenceRepository;

    public Profile getprofile(UUID id) {
        return  profileRepository.findById(id).orElse(null);
    }

    public ApiResponseDTO addAlimentaryRegime (UUID id, List<UUID> diets) {

        Profile profile = profileRepository.findById(id).orElse(null);
        if (profile == null) {
            return new ApiResponseDTO(HttpStatus.NOT_FOUND, "Profile non existant");
        }

        List<AlimentaryRegime> all = new ArrayList<>();
        for (UUID idAR : diets) {
            AlimentaryRegime ar = alimentaryRegimeRepository.findById(idAR).orElse(null);
            if (ar != null) {
                all.add(ar);
            }
        }
        profile.setAlimentaryRegimes(all);
        profileRepository.save(profile);
        return new ApiResponseDTO(HttpStatus.OK, "Regime alimentaire modifié");
    }

    public ApiResponseDTO addOriginPreference (UUID id, List<UUID> origines) {
        Profile profile = profileRepository.findById(id).orElse(null);
        if (profile == null) {
            return new ApiResponseDTO(HttpStatus.NOT_FOUND, "Profile non existant");
        }

        List<OriginPreference> all = new ArrayList<>();
        for (UUID idAR : origines) {
            OriginPreference ar = originPreferenceRepository.findById(idAR).orElse(null);
            if (ar != null) {
                all.add(ar);
            }
        }
        profile.setOriginPreferences(all);
        profileRepository.save(profile);
        return new ApiResponseDTO(HttpStatus.OK, "Origine préférence modifié");

    }

    public ApiResponseDTO addQualitePreference (UUID id, List<UUID> qualities) {
        Profile profile = profileRepository.findById(id).orElse(null);
        if (profile == null) {
            return new ApiResponseDTO(HttpStatus.NOT_FOUND, "Profile non existant");
        }

        List<QualitePreference> all = new ArrayList<>();
        for (UUID idAR : qualities) {
            QualitePreference ar = qualitePreferenceRepository.findById(idAR).orElse(null);
            if (ar != null) {
                all.add(ar);
            }
        }
        profile.setQualitePreferences(all);
        profileRepository.save(profile);
        return new ApiResponseDTO(HttpStatus.OK, "Qualité préférence modifiée");

    }
}
