package fr.univ.rouen.ollcook.profile.ollcookprofile.repository;

import fr.univ.rouen.ollcook.profile.ollcookprofile.models.QualitePreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QualitePreferenceRepository extends JpaRepository<QualitePreference, UUID> {

}
