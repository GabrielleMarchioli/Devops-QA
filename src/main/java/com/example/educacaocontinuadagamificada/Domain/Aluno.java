package com.example.educacaocontinuadagamificada.Domain;

public class Aluno {

    private static final double MEDIA_MINIMA_BONUS = 7.0;
    private static final int CURSOS_BONUS = 3;

    private String nome;
    private int cursosLiberados;

    public Aluno(String nome) {
        this.nome = nome;
        this.cursosLiberados = 0;
    }

    public void avaliarConclusaoCurso(double media) {
        if (media > MEDIA_MINIMA_BONUS) {
            cursosLiberados += CURSOS_BONUS;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCursosLiberados() {
        return cursosLiberados;
    }
}