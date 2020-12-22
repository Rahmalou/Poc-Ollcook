package fr.univ.rouen.ollcook.profile.ollcookprofile.repository;

import fr.univ.rouen.ollcook.profile.ollcookprofile.models.AlimentaryRegime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlimentaryRegimeRepository extends JpaRepository<AlimentaryRegime, UUID> {
}
