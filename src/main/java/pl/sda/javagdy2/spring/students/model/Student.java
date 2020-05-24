package pl.sda.javagdy2.spring.students.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imie;
    private String nazwisko;
    private boolean pelnoletni;
    private double wzrost;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "student")
    private List<Grade> gradeList;
}
