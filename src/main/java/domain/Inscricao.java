package domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INSCRICOES")
@Data
@SequenceGenerator(name = "ISC_SEQ", sequenceName = "inscricoes_id_seq", initialValue = 1, allocationSize = 1)
public class Inscricao implements Serializable {

    public enum TipoEvento {CONGRESSO, SIMPOSIO};

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "status_inscricao")
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInscricao;
    private Double preco;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private String tipoParticipacao;

    @OneToOne(cascade = CascadeType.ALL)
    private Participante participante;

    public Inscricao() {

    }

    public Inscricao(String status, Date dataInscricao, Double preco, TipoEvento tipoEvento, String tipoParticipacao, Participante participante) {
        this.status = status;
        this.dataInscricao = dataInscricao;
        this.preco = preco;
        this.tipoEvento = tipoEvento;
        this.tipoParticipacao = tipoParticipacao;
        this.participante = participante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
}