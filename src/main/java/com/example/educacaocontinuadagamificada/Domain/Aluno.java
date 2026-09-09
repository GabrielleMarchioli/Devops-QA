package com.example.educacaocontinuadagamificada.Domain;

public class Aluno {

    private String nome;
    private int cursosLiberados;

    public Aluno(String nome) {
        this.nome = nome;
        this.cursosLiberados = 0;
    }

    public void avaliarConclusaoCurso(double media) {

        if (media > 7.0) {
            cursosLiberados += 3;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCursosLiberados() {
        return cursosLiberados;
    }
}