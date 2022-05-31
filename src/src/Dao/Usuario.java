package Dao;

import java.util.Objects;

public class Usuario {
    int id;
    String username;
    String pass;
    String email;

    public Usuario() {
    }

    public Usuario( String username, String pass, String email) {

        this.username = username;
        this.pass = pass;
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String guardarUsuario(){
        // guardar en la base de datos
        return "El usuario ha sido guardado en la base de datos";
    }
}
