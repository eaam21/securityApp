package edu.cibertec.config;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import edu.cibertec.model.entity.Usuario;
import edu.cibertec.model.repository.IUsuarioRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioDetailsService implements UserDetailsService {

	private IUsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByUsuario(username);
		
        Set<GrantedAuthority> authorities = usuario.getRoles().stream()
                .map((roles) -> new SimpleGrantedAuthority(roles.getRol()))
                .collect(Collectors.toSet());
        
        return new org.springframework.security.core.userdetails.User(
                username,
                usuario.getPassword(),
                authorities
        );
	}

}
