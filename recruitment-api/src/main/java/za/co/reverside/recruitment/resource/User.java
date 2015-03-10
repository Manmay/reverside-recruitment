package za.co.reverside.recruitment.resource;

import lombok.Data;


import javax.persistence.*;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "password")
    private String password;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "emailid")
    private String emailId;


}
