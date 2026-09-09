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
}