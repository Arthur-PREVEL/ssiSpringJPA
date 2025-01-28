package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String role;
    @NonNull
    private Float pourcentage;

    @ManyToOne
    @JoinColumn(name = "personne_matricule", nullable = false)
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "projet_code", nullable = false)
    private Projet projet;

    public Participation(Float pourcentage, Personne personne, Projet projet) {
        this.pourcentage = pourcentage;
        this.personne = personne;
        this.projet = projet;
    }

}
