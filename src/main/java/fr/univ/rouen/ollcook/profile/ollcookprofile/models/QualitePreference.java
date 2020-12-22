package fr.univ.rouen.ollcook.profile.ollcookprofile.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "quality_preference")
public class QualitePreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qualite_preference_id")
    private UUID id;

    private String label;

    public QualitePreference() {

    }

    public QualitePreference(UUID id, String label) {
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
