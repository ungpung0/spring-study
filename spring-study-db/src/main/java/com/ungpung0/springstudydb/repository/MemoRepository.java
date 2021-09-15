package com.ungpung0.springstudydb.repository;

import com.ungpung0.springstudydb.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository와 entity 패키지의 Memo 클래스를 상속한다.
public interface MemoRepository extends JpaRepository<Memo, Long> {

}
// JPA는 인터페이스 선언만으로도 자동으로 스프링의 빈(bean)으로 등록된다.
