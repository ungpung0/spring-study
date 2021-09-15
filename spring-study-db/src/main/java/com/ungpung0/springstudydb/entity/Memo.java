package com.ungpung0.springstudydb.entity;

import lombok.*;

import javax.persistence.*;

@Entity // JPA에서는 반드시 엔티티 클래스를 추가해야만 한다. @Entity는 해당 클래스가 엔티티를 위한 클래스란 의미이다.
@Table(name = "tbl_memo") // @Entity와 사용하는 어노테이션으로 DB에서 어떠한 테이블로 생성할 것인지를 결정한다.
@ToString
@Getter // Getter를 이용하여 메소드를 생성한다.
@Builder // Builder를 사용하여 객체를 생성한다.
@AllArgsConstructor
@NoArgsConstructor
/* @Builder를 사용하기 위해서는 @AllArgsConstructor와 @NoArgsConstructor를 사용해야만 한다. */
public class Memo {
    @Id // @Entity가 붙은 클래스는 PK에 해당하는 필드를 @Id로 지정해야만 한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    * '키 생성 전략'으로서 'auto increament'를 기본으로 한다. 종류는 아래와 같다.
    * 1) AUTO(default) : JPA 구현체가 생성 방식을 결정한다.
    * 2) IDENTITY : 사용하는 DB가 키 생성을 결정한다. mariadb는 auto increment를 사용한다.
    * 3) SEQUENCE : DB의 sequence를 이용해서 키를 생성한다. @SequenceGenerator와 함께 사용한다.
    * 4) TABLE : 키 생성 전용 테이블을 생성해서 키를 생성한다. @TableGenerator와 함께 사용한다.
    */
    private Long mno;

    @Column(length = 200, nullable = false)
    private String mnoText;
}
