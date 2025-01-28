package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NonNull
    private String nom;
    @NonNull
    private LocalDate debut;

    private LocalDate fin;

    @OneToMany
    @ToString.Exclude
    private List<Participation> participations = new LinkedList<>();
}
