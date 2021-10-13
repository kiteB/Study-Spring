package hellojpa;

import javax.persistence.*;

@Entity
public class Locker {

    @Id @GeneratedValue
    private Long id;

    private String name;
    
    //양방향으로 만들고 싶을 때 코드 추가
//    @OneToOne(mappedBy = "locker")
//    private Member member;

}
