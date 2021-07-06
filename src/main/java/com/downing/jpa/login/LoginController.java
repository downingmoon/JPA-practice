package com.downing.jpa.login;

import com.downing.jpa.common.model.ResponseModel;
import com.downing.jpa.user.UserEntity;
import com.downing.jpa.user.UserModel;
import com.downing.jpa.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.Map;

@RestController
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseModel login(UserModel userModel, ResponseModel responseModel) {
        responseModel.setResult(true);
        responseModel.setMessasge("로그인 되었습니다.");
        try {
            log.info("### USER ID : {}", userModel.getUserId());
            userService.findByUserId(userModel.getUserId());
        } catch (Exception e) {
            responseModel.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseModel.setMessasge("로그인중 오류가 발생했습니다.");
            responseModel.setResult(false);
        }
        return responseModel;
    }

}
