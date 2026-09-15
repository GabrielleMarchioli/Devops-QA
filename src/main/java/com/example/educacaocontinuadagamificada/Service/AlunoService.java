package com.example.educacaocontinuadagamificada.Service;

import com.example.educacaocontinuadagamificada.DTO.AlunoDTO;
import com.example.educacaocontinuadagamificada.Entity.AlunoEntity;
import com.example.educacaocontinuadagamificada.Repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public AlunoDTO criar(AlunoDTO dto) {

        AlunoEntity aluno = new AlunoEntity(
                dto.getNome(),
                dto.getCursosLiberados(),
                dto.getPlano(),
                dto.getMoedas()
        );

        AlunoEntity salvo = alunoRepository.save(aluno);

        return converterParaDTO(salvo);
    }

    public List<AlunoDTO> listarTodos() {
        return alunoRepository.findAll()
                .stream()
                .map(this::converterParaDTO)
                .toList();
    }

    public AlunoDTO buscarPorId(Long id) {

        AlunoEntity aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        return converterParaDTO(aluno);
    }

    public void excluir(Long id) {
        alunoRepository.deleteById(id);
    }

    private AlunoDTO converterParaDTO(AlunoEntity aluno) {
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCursosLiberados(),
                aluno.getPlano(),
                aluno.getMoedas()
        );
    }
}