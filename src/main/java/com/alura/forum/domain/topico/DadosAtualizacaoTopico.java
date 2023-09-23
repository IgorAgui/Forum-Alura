package com.alura.forum.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(@NotNull Long id , String titulo, String mensagem, LocalDateTime data_criacao, Status status, String autor , Curso curso) {

}
