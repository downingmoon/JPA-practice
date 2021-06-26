package com.downing.jpa.user;

import com.downing.jpa.common.model.CommonEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class UserEntity extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;
    private String userId;
    private String userPassword;

    @Builder
    public UserEntity(Long userNo, String userId, String userPassword) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPassword = userPassword;
    }

}
