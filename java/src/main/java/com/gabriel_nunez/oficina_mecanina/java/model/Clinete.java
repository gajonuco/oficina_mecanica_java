package com.gabriel_nunez.oficina_mecanina.java.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Clinete{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "o CPF é obrigatório")
    @Column(unique = true, nullable = false)
    private String cpf;

    @Email(message = "E-mail inválido")
    private String email;

    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve ter 10 ou 11 dígitos")
    private String telefone;

}