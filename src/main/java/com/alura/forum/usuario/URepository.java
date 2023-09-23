package com.alura.forum.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface URepository  extends JpaRepository<Usuario , Long> {

    UserDetails findByEmail(String email);

}
