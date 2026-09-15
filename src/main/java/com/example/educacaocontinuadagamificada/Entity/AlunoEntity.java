package com.example.educacaocontinuadagamificada.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cursosLiberados;
    private String plano;
    private int moedas;

    public AlunoEntity() {
    }

    public AlunoEntity(String nome, int cursosLiberados, String plano, int moedas) {
        this.nome = nome;
        this.cursosLiberados = cursosLiberados;
        this.plano = plano;
        this.moedas = moedas;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCursosLiberados() {
        return cursosLiberados;
    }

    public void setCursosLiberados(int cursosLiberados) {
        this.cursosLiberados = cursosLiberados;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
}