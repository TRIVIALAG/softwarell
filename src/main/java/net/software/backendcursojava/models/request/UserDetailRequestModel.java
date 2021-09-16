package  net.software.backendcursojava.models.request;
public class UserDetailRequestModel {
    private String firsname;
   private String lastname;
   private String imail;
   private String password;
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


}