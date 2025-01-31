package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String poste;

    @OneToMany
    @ToString.Exclude
    private List<Participation> participations = new LinkedList<>();

    @OneToMany(mappedBy = "superieur")
    private List<Personne> subordonnees = new LinkedList<>();

    @ManyToOne
    private Personne superieur;

}
