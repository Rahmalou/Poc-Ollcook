package fr.univ.rouen.ollcook.profile.ollcookprofile.Dto;


import fr.univ.rouen.ollcook.profile.ollcookprofile.models.AlimentaryRegime;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.OriginPreference;
import fr.univ.rouen.ollcook.profile.ollcookprofile.models.QualitePreference;


import java.util.List;
import java.util.UUID;

public class ProfileDTO {

    private UUID id;

    private List<OriginPreference> originPreferences;

    private List<QualitePreference>qualitePreferences;

    private List<AlimentaryRegime>alimentaryRegimes;

    public ProfileDTO() {

    }

    public ProfileDTO(UUID id, List<OriginPreference> originPreferences,
                   List<QualitePreference> qualitePreferences, List<AlimentaryRegime> alimentaryRegimes) {
        this.id = id;
        this.originPreferences = originPreferences;
        this.qualitePreferences = qualitePreferences;
        this.alimentaryRegimes = alimentaryRegimes;
    }

}
