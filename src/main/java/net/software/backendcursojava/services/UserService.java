package net.software.backendcursojava.services;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.software.backendcursojava.UserRepository;
import net.software.backendcursojava.entities.UserEntity;

import net.software.backendcursojava.shared.dto.UserDTO;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDto) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        userEntity.setEncrytedPassword("testpassword");
        userEntity.setLastname("testUserID");

         UserEntity storedUserDetail = userRepository.save(userEntity);

        UserDTO usertoReturn=new UserDTO();
        BeanUtils.copyProperties(storedUserDetail, usertoReturn);
        return usertoReturn;


    }

    
}
