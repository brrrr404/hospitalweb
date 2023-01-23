package hospital_web.controller.authorization;

import hospital_web.service.authorization.AuthorizationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Авторизация")
@RequestMapping("/api/authorization")
@RequiredArgsConstructor
public class AuthorizationController {

    private final AuthorizationService authorizationService;

    @ApiOperation(value = "Регистрация аккаунта")
    @PostMapping("/registry-account")
    public void registryAccount(
            @ApiParam(name = "login", value = "Логин")
            @RequestParam String login,
            @ApiParam(name = "password", value = "Пароль")
            @RequestParam String password) {
        authorizationService.registryAccount(login, password);
    }

    @ApiOperation(value = "Авторизация в аккаунт")
    @PostMapping("/authorization-account")
    public void authorization(
            @ApiParam(name = "login", value = "Логин")
            @RequestParam String login,
            @ApiParam(name = "password", value = "Пароль")
            @RequestParam String password) {
        authorizationService.authorization(login, password);
    }
}
