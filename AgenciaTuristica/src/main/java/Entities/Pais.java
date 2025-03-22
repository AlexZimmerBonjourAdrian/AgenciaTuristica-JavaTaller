package Entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "Pais")
public class Pais implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String nombre;
    private Float pib;
    private Integer numHabitantes;
    private String capital;



}
