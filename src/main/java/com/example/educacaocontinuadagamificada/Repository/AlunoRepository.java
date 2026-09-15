package com.example.educacaocontinuadagamificada.Repository;

import com.example.educacaocontinuadagamificada.Entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}