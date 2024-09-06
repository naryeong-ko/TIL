package jpql;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member");
            member.setAge(10);
            member.setTeam(team);

            em.persist(member);

            em.flush();
            em.clear();

            /*
            내부 조인(inner는 생략 가능)
            String query = "select m from Member m inner join m.team t";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();
            */

            /*
            외부 조인(outer는 생략 가능)
            String query = "select m from Member m left outer join m.team t";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();
             */

            /*
            세타 조인
            String query = "select m from Member m, Team t where m.username = t.name";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();
            */

            /*
            조인 대상 필터링
            String query = "select m from Member m left join m.team t on t.name = 'teamA'";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();
             */

            /*
            연관관계 없는 엔티티 외부 조인
            String query = "select m from Member m left join Team t on m.username = t.name";
            List<Member> result = em.createQuery(query, Member.class)
                    .getResultList();
             */

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }

}
