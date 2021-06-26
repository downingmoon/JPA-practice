package com.downing.jpa.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    /**
     * UserId 로 회원 조회
     * @param userEntity
     * @return
     */
    UserEntity findByUserId(String userId);
}