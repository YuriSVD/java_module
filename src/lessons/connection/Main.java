package lessons.connection;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Connection connection
                = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "secret");

        connection.close();
    }
}
