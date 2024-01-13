package voiture.service;

import com.etudiant.springWeb.auth.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import voiture.auth.AuthenticationResponse;
import voiture.auth.RegisterRequest;
import voiture.model.Utilisateur;
import voiture.repository.UtilisateurRepository;
import voiture.tools.JwtUtil;
import voiture.tools.Role;

@Service
public class AuthenticationService {

  @Autowired
  private UtilisateurRepository utilisateurRepository;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtUtil jwtUtil;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public AuthenticationResponse register(RegisterRequest request) {
    var user = new Utilisateur();
    user.setLogin(request.getLogin());
    user.setNom(request.getNom());
    user.setPrenom(request.getPrenom());
    user.setTelephone(request.getTelephone());
    user.setDatenaissance(request.getDatenaissance());
    user.setMotdepasse(passwordEncoder.encode(request.getMotDePasse()));

    String role = request.getRole();
    if(role.compareToIgnoreCase("ROLE_ADMIN") == 0){
      user.setRole(Role.ROLE_ADMIN);
    }else{
      user.setRole(Role.ROLE_USER);
    }
    Utilisateur userToken = utilisateurRepository.save(user);
    var jwtToken = jwtUtil.generateToken(userToken);
    return new AuthenticationResponse(jwtToken);
  }

  public AuthenticationResponse authenticate(AuthenticationRequest request) {
    System.out.println(utilisateurRepository.findByLogin(request.getLogin()));
    System.out.println(request.getLogin());
    System.out.println(request.getMotDePasse());
    authenticationManager.authenticate(
      new UsernamePasswordAuthenticationToken(
        request.getLogin(),
        request.getMotDePasse()
      )
    );
    var user = utilisateurRepository
      .findByLogin(request.getLogin())
      .orElseThrow();
    var token = jwtUtil.generateToken(user);

    AuthenticationResponse response = new AuthenticationResponse(token);
    return response;
  }
}
