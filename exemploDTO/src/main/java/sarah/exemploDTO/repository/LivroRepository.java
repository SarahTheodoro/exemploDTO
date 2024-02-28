package sarah.exemploDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sarah.exemploDTO.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}