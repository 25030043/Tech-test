package logintest.demo.service;

import logintest.demo.DTO.UserDTO;
import logintest.demo.entities.UsersEntity;
import logintest.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UsersEntity getUser(String username , String password) throws Exception {

        try{
            UsersEntity users = userRepository.findByUserNameAndPassword(username,password);

            System.out.println();
            return users;
        }catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Can not Retive Users");
        }
    }

}
