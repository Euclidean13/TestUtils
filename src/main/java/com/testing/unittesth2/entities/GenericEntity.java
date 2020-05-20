package com.testing.unittesth2.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "generic_entity")
public class GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String valor;

    public GenericEntity() {

    }

    public GenericEntity(String valor) {
        this.valor = valor;
    }
}
