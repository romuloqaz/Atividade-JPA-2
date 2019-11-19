package domain;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Contato implements Serializable {

    private long id;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;

    public Contato() {

    }
}
