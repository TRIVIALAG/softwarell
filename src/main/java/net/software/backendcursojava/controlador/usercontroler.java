package net.software.backendcursojava.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import net.software.backendcursojava.models.request.UserDetailRequestModel;
import net.software.backendcursojava.models.responses.UserRest;
//import net.software.backendcursojava.shared.dto.UserDTO;
import net.software.backendcursojava.services.UserServiceInterface;

@RestController
@RequestMapping("/users")//http;//localhost:8080/users
public class usercontroler {

  @Autowired

  UserServiceInterface userService;

    @GetMapping
    public String getUser(){
        return "obtener usuarios";

    }

  @PostMapping// CREANDO INFORMACION
  public UserRest createUser(@RequestBody UserDetailRequestModel userDetails){

    UserRest userToReturn = new  UserRest();

    UserDTO userDTO = new  UserDTO();

    BeanUtil.copyPropertis(userDetails, userDTO);

    UserDTO createdUser = userService.createdUser(userDTO);

    BeanUtil.copyPropertis(createdUser, userToReturn);





  
    return userToReturn;
  }
  
}
