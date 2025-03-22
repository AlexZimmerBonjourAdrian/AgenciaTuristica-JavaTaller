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
@Table(name = "Asignacion")
public class Asignacion implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ACESOR_ASIGNACION", columnDefinition =  "TEXT", nullable = false)
    private String acesor;
    @Column(name = "AREANAME_ASIGNACION", columnDefinition =  "TEXT", nullable = false)
    private String areaName;
    @Column(name = "FECHAInicio_ASIGNACION", columnDefinition =  "DATE", nullable = false)
    private LocalDate fechaInicio;

    @ManyToMany
    private List<Empresa> empresas;

}
