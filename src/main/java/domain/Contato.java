package domain;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Contato implements Serializable {


    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;

    public Contato() {

    }

    public Contato(String telefoneResidencial, String telefoneComercial, String telefoneCelular) {
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.telefoneCelular = telefoneCelular;
    }


    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
