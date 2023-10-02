

import com.example.demo.DAO.Entities.TypeChambre;
import jakarta.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id

    private long idChambre;

    @Column(name="numeroChambre")
    private long numChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
}
