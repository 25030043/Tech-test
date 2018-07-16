package logintest.demo.repository;

import logintest.demo.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersEntity,Integer> {

    UsersEntity findByUserNameAndPassword(String UserName , String Password);
}
