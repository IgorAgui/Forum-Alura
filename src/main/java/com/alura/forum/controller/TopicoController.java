package com.alura.forum.controller;

import com.alura.forum.domain.topico.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {

    @Autowired
    private TRepository repository;

    @PostMapping("preencher")
    public ResponseEntity preencherTopico(@RequestBody @Valid DadosTopico dados) {

        var topico = new Topico(dados);
        repository.save(topico);
        return ResponseEntity.ok().body(dados);

    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemTopico>> listar(@PageableDefault(size = 10, sort = {"id"}) Pageable paginacao) {
        Page<Topico> page = repository.findTopicosNaoFechados(paginacao);
        Page<DadosListagemTopico> dadosPage = page.map(DadosListagemTopico::new);
        return ResponseEntity.ok(dadosPage);
    }

    @GetMapping("/{id}")
    public  ResponseEntity detalhar(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoTopico dados) {
        var topico = repository.getReferenceById(dados.id());
        topico.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        topico.setStatus(Status.FECHADO);
        repository.save(topico);

        return ResponseEntity.noContent().build();
    }

}
