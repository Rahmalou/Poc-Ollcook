package fr.univ.rouen.ollcook.profile.ollcookprofile.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private UUID id;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OriginPreference> originPreferences;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<QualitePreference>qualitePreferences;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AlimentaryRegime>alimentaryRegimes;

    public Profile() {

    }

    public Profile(UUID id, List<OriginPreference> originPreferences,
                   List<QualitePreference> qualitePreferences, List<AlimentaryRegime> alimentaryRegimes) {
        this.id = id;
        this.originPreferences = originPreferences;
        this.qualitePreferences = qualitePreferences;
        this.alimentaryRegimes = alimentaryRegimes;
    }

    public UUID getId() {
        return id;
    }

    public List<OriginPreference> getOriginPreferences() {
        return originPreferences;
    }

    public List<QualitePreference> getQualitePreferences() {
        return qualitePreferences;
    }

    public List<AlimentaryRegime> getAlimentaryRegimes() {
        return alimentaryRegimes;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public void setOriginPreferences(List<OriginPreference> originPreferences) {
        this.originPreferences = originPreferences;
    }

    public void setQualitePreferences(List<QualitePreference> qualitePreferences) {
        this.qualitePreferences = qualitePreferences;
    }

    public void setAlimentaryRegimes(List<AlimentaryRegime> alimentaryRegimes) {
        this.alimentaryRegimes = alimentaryRegimes;
    }

}
