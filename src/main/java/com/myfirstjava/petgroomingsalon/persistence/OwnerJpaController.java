package com.myfirstjava.petgroomingsalon.persistence;

import com.myfirstjava.petgroomingsalon.logic.Owner;
import com.myfirstjava.petgroomingsalon.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class OwnerJpaController implements Serializable {

    public OwnerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    // --------- This Block of Code Was Added by MPC  1hr:33min:30s https://www.youtube.com/watch?v=Gd4QQtQz5DE&t=3638s ----------------------//
    public OwnerJpaController() {
        emf = Persistence.createEntityManagerFactory("PetGroomingSalonPU");
    }
    //------------ Ends -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Owner owner) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(owner);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Owner owner) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            owner = em.merge(owner);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = owner.getOwner_id();
                if (findOwner(id) == null) {
                    throw new NonexistentEntityException("The owner with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Owner owner;
            try {
                owner = em.getReference(Owner.class, id);
                owner.getOwner_id();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The owner with id " + id + " no longer exists.", enfe);
            }
            em.remove(owner);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Owner> findOwnerEntities() {
        return findOwnerEntities(true, -1, -1);
    }

    public List<Owner> findOwnerEntities(int maxResults, int firstResult) {
        return findOwnerEntities(false, maxResults, firstResult);
    }

    private List<Owner> findOwnerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Owner.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Owner findOwner(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Owner.class, id);
        } finally {
            em.close();
        }
    }

    public int getOwnerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Owner> rt = cq.from(Owner.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
