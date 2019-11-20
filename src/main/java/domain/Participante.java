package domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PARTICIPANTES")
@Data
@SequenceGenerator(name = "PRT_SEQ", sequenceName = "PARTICIPANTE_SEQ")
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRT_SEQ")
    private Integer id;
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


    public Participante() {
    }

    public Participante(String nome, String email, String nomeCracha, String instituicao, String CPF,
                        String tipoUsuario, String profissao, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.nomeCracha = nomeCracha;
        this.instituicao = instituicao;
        this.CPF = CPF;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCracha() {
        return nomeCracha;
    }

    public void setNomeCracha(String nomeCracha) {
        this.nomeCracha = nomeCracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
