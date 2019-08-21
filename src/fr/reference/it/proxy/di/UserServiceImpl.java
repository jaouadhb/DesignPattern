package fr.reference.it.proxy.di;

import java.util.List;

public class UserServiceImpl implements  UserService {

    UserDAO userDao;

    UserServiceImpl(UserDAO userDAO)
    {
        this.userDao =userDAO;
    }

    @Override
    public boolean ajouterUtilisateur(User pUser) {
        return userDao.create(pUser);
    }

    @Override
    public boolean supprimerUtilisateur(User pUser) {
        return userDao.remove(pUser);
    }

    @Override
    public User trouverUtilisateurParId(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> recuepereUtilisateurs() {
        return userDao.findAll();
    }
}
