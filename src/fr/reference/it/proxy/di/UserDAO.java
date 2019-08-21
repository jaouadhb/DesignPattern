package fr.reference.it.proxy.di;

import java.util.List;

public interface UserDAO {

    boolean create(User pUser);
    boolean remove(User pUser);
    User findById(int id);
    List<User> findAll();

}
