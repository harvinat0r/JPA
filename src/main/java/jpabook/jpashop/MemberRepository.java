package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//DAO 비스무리한거
@Repository
public class MemberRepository {

    @PersistenceContext // 이 annotation이 em을 생성해줌
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId(); // command 랑 query를 분리해라
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
