package ssii.service;

import jakarta.validation.constraints.Positive;
import org.springframework.transaction.annotation.Transactional;
import ssii.dao.ParticipationRepository;
import ssii.dao.PersonneRepository;
import ssii.dao.ProjetRepository;
import ssii.entity.Participation;
import ssii.entity.Personne;

public class PersonneService {
    private final PersonneRepository personneDAO;
    private final ParticipationRepository participationDAO;
    private final ProjetRepository projetDAO;


    public PersonneService(PersonneRepository personneDAO, ParticipationRepository participationDAO, ProjetRepository projetDAO) {
        this.personneDAO = personneDAO;
        this.participationDAO = participationDAO;
        this.projetDAO = projetDAO;
    }

    @Transactional
    public Participation ajouterParticipation(int projetCode, int personneMatricule, @Positive Float pourcentage) {

        var personne = personneDAO.findById(personneMatricule).orElseThrow();

        var projet = projetDAO.findById(projetCode).orElseThrow();


        var nouvelleParticipation = new Participation( pourcentage, personne, projet );
        participationDAO.save(nouvelleParticipation);



        return nouvelleParticipation;
    }
}
