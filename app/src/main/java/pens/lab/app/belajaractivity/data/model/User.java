package pens.lab.app.belajaractivity.data.model;

import pens.lab.app.belajaractivity.base.BaseModel;

public class User extends BaseModel {
    private String email;
    private String token;

    public User(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
