package dao;

import domain.Artigo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ArtigoDAO {

    @PersistenceContext(unitName = "dac")
    EntityManager em;

    public void salvar(Artigo artigo) {
        em.persist(artigo);
    }
    public void atualizar(Artigo a) {
        em.merge(a);
    }

    public Artigo buscar(int id) {
        return em.find(Artigo.class, id);
    }

}
