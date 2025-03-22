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
@Table(name = "Area")
public class Area implements Serializable{

    @Id
    @Column(name = "NOMBRE_AREA", columnDefinition =  "TEXT", nullable = false)
    private String nombre;
    @Column(name = "DESCRIPCION_AREA", columnDefinition =  "TEXT", nullable = false)
    private String descripcion;



}
