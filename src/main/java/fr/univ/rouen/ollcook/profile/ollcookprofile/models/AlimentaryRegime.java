package fr.univ.rouen.ollcook.profile.ollcookprofile.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "alimentary_regime")
public class AlimentaryRegime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alimentary_regime_id")
    private UUID id;
    private String label;
    public  AlimentaryRegime() {

    }

    public AlimentaryRegime(UUID id, String label) {
        this.id = id;
        this.label = label;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
