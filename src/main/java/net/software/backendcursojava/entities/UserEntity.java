package net.software.backendcursojava.entities;

import java.io.Serializable;

import javax.persistence.Column;
//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="Users")

public class UserEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userId;
    
    @Column(nullable = false, length = 50)
    private String firstname;

    
    @Column(nullable = false, length = 50)
    private String lastname;
    
    @Column(nullable = false)
    private String encrytedPassword;

    
    @Column(nullable = false, length = 255)
    private String email;


  


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getEncrytedPassword() {
        return encrytedPassword;
    }


    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    



    


}