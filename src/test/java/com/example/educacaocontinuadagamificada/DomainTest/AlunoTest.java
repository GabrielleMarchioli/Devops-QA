package com.example.educacaocontinuadagamificada.DomainTest;

import com.example.educacaocontinuadagamificada.Domain.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    // BDD 1 - Gabrielle
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


    // BDD 2 - Afonso
    @Test
    public void naoDeveLiberarCursosQuandoMediaForIgualASete() {

        // Arrange
        Aluno aluno = new Aluno("Afonso");

        // Action
        aluno.avaliarConclusaoCurso(7.0);

        // Assert
        assertEquals(
                0,
                aluno.getCursosLiberados()
        );
    }


    // BDD 3 - Giulianno
    @Test
    public void naoDeveLiberarCursosQuandoMediaForMenorQueSete() {

        // Arrange
        Aluno aluno = new Aluno("Giulianno");

        // Action
        aluno.avaliarConclusaoCurso(6.0);

        // Assert
        assertEquals(
                0,
                aluno.getCursosLiberados()
        );
    }


    // Teste adicional para ajudar na cobertura do JaCoCo
    @Test
    public void deveCriarAlunoComNomeECursosZerados() {

        // Arrange
        Aluno aluno = new Aluno("Gabrielle");

        // Assert
        assertEquals(
                "Gabrielle",
                aluno.getNome()
        );

        assertEquals(
                0,
                aluno.getCursosLiberados()
        );
    }
}