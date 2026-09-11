package com.example.educacaocontinuadagamificada.DomainTest;

import com.example.educacaocontinuadagamificada.Domain.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    @Test
    public void deveLiberarTresCursosQuandoMediaForMaiorQueSete() {

        // Arrange
        Aluno aluno = new Aluno("Gabrielle");

        // Action
        aluno.avaliarConclusaoCurso(8.0);

        // Assert
        assertEquals(
                3,
                aluno.getCursosLiberados()
        );
    }

    @Test public void naoDeveLiberarCursosQuandoMediaForMenorQueSete() {

        // Arrange
        Aluno aluno = new Aluno("Giulianno");

        // Action
        aluno.avaliarConclusaoCurso(6.0);

        // Assert
        assertEquals(0, aluno.getCursosLiberados()); }
    @Test
    public void naoDeveLiberarCursosQuandoMediaForIgualASete() {
        // Arrange
        Aluno aluno = new Aluno("Afonso");
        // Action
        aluno.avaliarConclusaoCurso(7.0);
        // Assert
        assertEquals(0, aluno.getCursosLiberados());
    }
}

