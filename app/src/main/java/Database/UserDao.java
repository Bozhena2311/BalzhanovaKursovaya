package Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import Models.User;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User where login= :login and password= :password")
    User getUser(String login,  String password);

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);


}
