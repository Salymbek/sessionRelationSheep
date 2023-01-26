package peaksoft.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private String lesson;
    @ManyToMany
    @JoinTable(name = "instructors_students",
    joinColumns = @JoinColumn(name = "instructor_id"),                  //не обезательно
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student>students;
}
