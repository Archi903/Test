package org.example;

public class User {

    private String login;
    private String email;

    public User(String login,String email) throws IllegalArgumentException {
        if (email.equals(login)) {
            throw new IllegalArgumentException();
        } else if (!isEmailValid(email)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        this.email = email;
    }
    public User(){

    }

    public String getLogin() {
        return login;
    }


    public String getEmail() {
        return email;
    }


    private boolean isEmailValid(String email){
        return email.matches("^[a-zA-z0-9._-]+@[a-zA-z0-9-]+.[a-zA-z]{2,4}$");
    }

}
