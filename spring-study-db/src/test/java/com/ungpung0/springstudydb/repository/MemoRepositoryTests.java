package com.ungpung0.springstudydb.repository;

import com.ungpung0.springstudydb.entity.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() { // testClass는 MemoRepository 인터페이스의 실제 객체가 무엇인지 확인한다.
        System.out.println(memoRepository.getClass().getName());
    }

    // INSERT 문의 예.
    @Test
    public void testInsertDummies() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Memo memo = Memo.builder().mnoText("Sample..." + i).build();
            memoRepository.save(memo);
        });
    }

    // SELECT 문의 예.
    @Test
    public void testSelectDummies() {

    }
}
