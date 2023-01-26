package peaksoft.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private String klass;
    @ManyToMany(mappedBy = "students")
    private List<Instructor>instructors;
}
