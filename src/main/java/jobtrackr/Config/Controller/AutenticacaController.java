package jobtrackr.Config.Controller;

import jakarta.validation.Valid;
import jobtrackr.Config.Dto.DadosTokenJWT;
import jobtrackr.Config.Dto.LoginDTO;
import jobtrackr.Config.Entity.Usuario;
import jobtrackr.Config.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid LoginDTO login) {
        var AuthenticationToken = new UsernamePasswordAuthenticationToken(login.login(), login.password());
        var autentication = authenticationManager.authenticate(AuthenticationToken);
        var tokenJWT = tokenService.gerarToken((Usuario) autentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }
}
