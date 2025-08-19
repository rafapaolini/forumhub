package com.forumhub.api.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime data_criacao, Estado estado, String autor, String curso) {
    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData_criacao(), topico.getEstado(), topico.getAutor(), topico.getCurso());
    }
}