package com.alura.forum.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id , String titulo, String mensagem, LocalDateTime data_criacao, Status status, String autor , Curso curso) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(),topico.getDataCriacao(), topico.getStatus(), topico.getAutor() ,topico.getCurso() );
    }

}
