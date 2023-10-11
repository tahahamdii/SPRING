
import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
@Table(name = "Foyer")
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer;

    @Column(name="nomFoyer")
    private String nomFoyer;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer;
    @OneToOne (mappedBy = "foyer")
    private Universite universite;

    @ManyToOne(cascade = CascadeType.ALL,mappedBy="foyer")
    private Set<Foyer> foyers ;
}
