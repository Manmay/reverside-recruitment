package za.co.reverside.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.reverside.recruitment.resource.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUserNameAndPassword(String userName, String password);


}
