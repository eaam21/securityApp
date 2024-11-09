package edu.cibertec.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.model.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByUsuario(String usuario);
}
