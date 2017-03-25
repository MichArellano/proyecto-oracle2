
package model;


public class usuario {
    private String Login;
    private String password; 

    public usuario(String Login, String password) {
        this.Login = Login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
}
