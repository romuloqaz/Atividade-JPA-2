package dao;

import domain.Inscricaoefetuada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class InscricaoEfetuadaDAO {
    @PersistenceContext(unitName = "dac")
    EntityManager em;

    public void salvar(Inscricaoefetuada inscricaoefetuada) {
        em.persist(inscricaoefetuada);
    }
    public void atualizar(Inscricaoefetuada i) {
        em.merge(i);
    }


}
