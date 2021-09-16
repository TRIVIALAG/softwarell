package  net.software.backendcursojava.models.responses;

public class UserRest {
    
    private  String userId;//contraseña generada
    private String firsname;
   private String lastname;
   private String imail;
   
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
public String getUserId() {
    return userId;
}
public void setUserId(String userId) {
    this.userId = userId;
}

}
