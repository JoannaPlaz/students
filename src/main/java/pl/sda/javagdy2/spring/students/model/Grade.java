package pl.sda.javagdy2.spring.students.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Grade{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Enumerated(EnumType.STRING)
    private Przedmiot przedmiot;

    private double ocena;

    @ManyToOne()
    private Student student;

    @CreationTimestamp
    private LocalDateTime dataDodania;

    public Grade(Przedmiot przedmiot, double ocena) {
        this.przedmiot = przedmiot;
        this.ocena = ocena;
    }
}
