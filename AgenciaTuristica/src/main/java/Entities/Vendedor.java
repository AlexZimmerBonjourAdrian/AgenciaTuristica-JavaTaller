package Entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "Vendedor")
public class Vendedor implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "NOMBRE_VENDEDOR", columnDefinition =  "TEXT", nullable = false)
    private String nombre;
    private String direccion;
    private LocalDate fechaCapacitacion;

    @OneToMany
    private List<Empresa> empresas;
}
