package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl service = new UserDaoHibernateImpl();

        service.createUsersTable();

        service.saveUser("Andrei", "Pestrikov", (byte) 21);
        service.saveUser("Ivan", "Ivanov", (byte) 24);
        service.saveUser("Pavel", "Sun", (byte) 17);
        service.saveUser("Victory", "Pahomova", (byte) 19);

        System.out.println(service.getAllUsers());
        service.removeUserById(2);
        System.out.println(service.getAllUsers());
        service.dropUsersTable();

    }
}
