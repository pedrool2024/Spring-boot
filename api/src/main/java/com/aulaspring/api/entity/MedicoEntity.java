package com.aulaspring.api.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor 
 
@Entity 
@Table (name = "medico")
public class MedicoEntity {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private String genero;
    private String telefone;
    private String endereco;
    private String crm;
    private Boolean experiencia;

        @Enumerated(EnumType.STRING)
        private Especialidade especialidade;

        public enum Especialidade {
            ORTOPEDIA, CARDIOLOGIA, PEDIATRIA, DERMATOLOGIA
        }
}
