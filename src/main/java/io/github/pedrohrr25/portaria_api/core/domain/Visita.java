package io.github.pedrohrr25.portaria_api.core.domain;

import java.time.LocalDateTime;

public class Visita {
    private Long id;
    private LocalDateTime dataHora;
    private Long idMorador;
    private Long getVisitante;

    public Visita() {
    }

    public Visita(Long id, LocalDateTime dataHora, Long idMorador, Long getVisitante) {
        this.id = id;
        this.dataHora = dataHora;
        this.idMorador = idMorador;
        this.getVisitante = getVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Long getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Long idMorador) {
        this.idMorador = idMorador;
    }

    public Long getGetVisitante() {
        return getVisitante;
    }

    public void setGetVisitante(Long getVisitante) {
        this.getVisitante = getVisitante;
    }
}
