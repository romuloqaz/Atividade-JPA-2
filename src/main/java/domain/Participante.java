package domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PARTICIPANTES")
@Data
@SequenceGenerator(name = "PRT_SEQ", sequenceName = "PARTICIPANTE_SEQ", initialValue = 88, allocationSize = 1)
public class Participante implements Serializable {

    private static final long serialVersionUID = -4023522856316087762L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRT_SEQ")
    private long id;
    private String nome;
    private String email;
    @Column(name = "nome_cracha")
    private String nomeCracha;
    private String instituicao;
    private String CPF;
    private String tipoUsuario;
    private String profissao;

    @Embedded
    private Contato contato;
    @Embedded
    private Endereco endereco;

    @OneToMany
    private List<Inscricao> inscricao;

}
