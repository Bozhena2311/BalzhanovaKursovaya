package Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class User implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private String name;

    private String login;
    private String password;

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @NonNull
    public int getId(){
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLogin(){
        return login; }

    public void setLogin(String login){
        this.login = login;}

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name=" + name +'\'' +
                ", login=" + login +'\'' +
                ", password=" + password +'\'' +
                "}";
    }
}
