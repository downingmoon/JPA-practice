package com.downing.jpa.user;

import com.downing.jpa.common.model.CommonEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "MD_USER")
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
