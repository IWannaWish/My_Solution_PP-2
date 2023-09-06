package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Andrei", "Pestrikov", (byte) 21);
        service.saveUser("Ivan", "Ivanov", (byte) 24);
        service.saveUser("Pavel", "Sun", (byte) 17);
        service.saveUser("Victory", "Pahomova", (byte) 19);

        service.cleanUsersTable();
        service.dropUsersTable();

    }
}
