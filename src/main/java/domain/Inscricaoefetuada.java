package domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@SequenceGenerator(name = "ISF_SEQ", sequenceName = "inscricaoefetuada_id_seq")
public class Inscricaoefetuada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISF_SEQ")
    private Integer id;
    private String formaPagamento;
    private Integer quantidade;
    private String transacao;
    private String status;
    private Double valor;


    public Inscricaoefetuada() {

    }

    public Inscricaoefetuada(Integer id, String formaPagamento, Integer quantidade, String transacao, String status, Double valor) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.quantidade = quantidade;
        this.transacao = transacao;
        this.status = status;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getTransacao() {
        return transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
