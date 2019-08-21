package fr.reference.it.proxy.di;

public class DIMain {
    public static void main(String[] args) {
        UserDAO userDAO  = new UserDAOimpl();
        /**
         * Injection par constructeur
         */
        UserService userService = new UserServiceImpl(userDAO);
        User user = userService.trouverUtilisateurParId(1);
        System.out.println(user.getName());
    }
}
