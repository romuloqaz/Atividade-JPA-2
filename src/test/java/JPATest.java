import dao.ArtigoDAO;
import dao.InscricaoEfetuadaDAO;
import domain.Artigo;
import domain.Inscricaoefetuada;
import org.jboss.arquillian.container.test.api.Deployment;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(Arquillian.class)
public class JPATest {

    @Inject
    InscricaoEfetuadaDAO inscricaoEfetuadaDAO;

    @Deployment
    public static JavaArchive criarArquivoTeste() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(InscricaoEfetuadaDAO.class.getPackage())
                .addPackage(Inscricaoefetuada.class.getPackage())
                .addAsResource("META-INF/persistence.xml");
    }
    @Test
    public void testarInscricaoEfetuada(){
        Inscricaoefetuada inscricaoefetuada = new Inscricaoefetuada(1,"pagamento teste",2,"transacao teste",
                "status teste",2.00);
        inscricaoEfetuadaDAO.salvar(inscricaoefetuada);


    }

}
