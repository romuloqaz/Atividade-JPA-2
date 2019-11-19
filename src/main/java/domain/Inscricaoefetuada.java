package domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Inscricaoefetuada implements Serializable {

    @Id
    private Integer id;
    private String formaPagamento;
    private Integer quantidade;
    private String transacao;
    private String status;
    private Double valor;


    public Inscricaoefetuada() {

    }

    // Relacionamento aqui com incrição.

}
