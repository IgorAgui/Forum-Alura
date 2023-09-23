package com.alura.forum.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TRepository  extends JpaRepository<Topico,Long> {

    @Query("SELECT t FROM Topico t WHERE t.status != 'FECHADO'")
    Page<Topico> findTopicosNaoFechados(Pageable pageable);

}
