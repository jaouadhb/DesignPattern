package fr.reference.it.proxy.di;

import java.util.ArrayList;
import java.util.List;

public class UserDAOimpl implements  UserDAO {

    private static List<User> users=null;

    static{
        users = new ArrayList<>();
        users.add(new User(1,"Jaouad",24));
        users.add(new User(2,"HBA",25));
        users.add(new User(3,"Smith",44));
    }

    @Override
    public boolean create(User pUser) {
        return users.add(pUser);
    }

    @Override
    public boolean remove(User pUser) {
        return users.remove(pUser);
    }

    @Override
    public User findById(int id) {
        return users.stream().filter(user->user.getId()==id).findFirst().get();
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
