package peaksoft.oneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "capitals")
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int population;
    @OneToOne(mappedBy = "capital")
    private Country country;
}
