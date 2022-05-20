package br.com.acsprudencio.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.acsprudencio.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
