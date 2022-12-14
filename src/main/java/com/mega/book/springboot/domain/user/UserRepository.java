package com.mega.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    //Optional<T> 클래스는 Integer나 Double 클래스처럼 'T'타입의 객체를 포장해 주는 래퍼 클래스(Wrapper class)입니다.
    //따라서 Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있습니다.
}
