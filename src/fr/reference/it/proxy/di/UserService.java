package fr.reference.it.proxy.di;

import java.util.List;

public interface UserService {
    boolean ajouterUtilisateur(User pUser);
    boolean supprimerUtilisateur(User pUser);
    User trouverUtilisateurParId(int id);
    List<User> recuepereUtilisateurs();
}
