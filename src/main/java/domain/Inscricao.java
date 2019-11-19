package domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INSCRICOES")
@Data
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

    public Inscricao() {

    }
}