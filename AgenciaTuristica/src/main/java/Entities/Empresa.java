package Entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOMBRE_EMPRESA", columnDefinition =  "TEXT", nullable = false)
    private String nombre;
    @Column(name = "FECHAINGRESA_EMPRESA", columnDefinition =  "DATE", nullable = false)
    private LocalDate fechaIngreso;
    @Column(name = "FACTURACION_EMPRESA", columnDefinition =  "NUMBER", nullable = false)
    private Float facturacion;
    @Column(name = "NUMVENDEDORES_EMPRESA", columnDefinition =  "INTENGER", nullable = false)
    private Integer numVendedores;

    private String ciudadSede;
    @ManyToMany
    private List<Empresa> empresas;
}
