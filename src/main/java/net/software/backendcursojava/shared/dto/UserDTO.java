package net.software.backendcursojava.shared.dto;

import java.io.Serializable;

public class UserDTO  implements serializable{

    private static final long serialVersionUID = 1L;

    private String firsname;
   private String lastname;
   private String imail;
   private String password;
   private String userid;
   private  long id;
   private String encryptedpassword;
   
public static long getSerialversionuid() {
    return serialVersionUID;
}
public String getFirsname() {
    return firsname;
}
public void setFirsname(String firsname) {
    this.firsname = firsname;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
public String getImail() {
    return imail;
}
public void setImail(String imail) {
    this.imail = imail;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getUserid() {
    return userid;
}
public void setUserid(String userid) {
    this.userid = userid;
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getEncryptedpassword() {
    return encryptedpassword;
}
public void setEncryptedpassword(String encryptedpassword) {
    this.encryptedpassword = encryptedpassword;
}

   
   


}