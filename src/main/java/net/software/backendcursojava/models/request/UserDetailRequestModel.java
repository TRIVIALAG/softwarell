package  net.software.backendcursojava.models.request;
public class UserDetailRequestModel {
    private String firstname;
   private String lastname;
   private String imail;
   private String password;
public String getFirsname() {
    return firstname;
}
public void setFirsname(String firsname) {
    this.firstname = firsname;
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