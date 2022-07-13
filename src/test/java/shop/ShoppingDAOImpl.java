package shop;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.DriverManager.getConnection;
import static org.assertj.core.api.Assertions.*;

public class ShoppingDAOImpl {

    public static final String HOST = "jdbc:mysql://localhost:3306/shop";
    public static final String USER = "root";
    public static final String PASSWORD = "1372165509";
    public static final String ERROR = "connection to database is impossible";
    public static final String INSERT_SQL = "INSERT INTO item (name, quantity) VALUES (?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
    public static final String DELETE_SQL = "DELETE FROM item ORDER BY id DESC LIMIT 1";

    @Test
    void should_connect_to_mysql() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD)) {
            if (con == null){
                fail(ERROR);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            fail(ERROR);
        }
    }

    @Test
    void should_insert_read_and_delete() {
        try (final Connection con = getConnection(HOST, USER, PASSWORD);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL);
             final PreparedStatement delete = con.prepareStatement(DELETE_SQL)) {
            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();

            final ResultSet resultSet = select.executeQuery();

            while (resultSet.next()){
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");

                assertThat(name).isEqualTo("Orange");
                assertThat(quantity).isEqualTo(5);
            }
            delete.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            fail(ERROR);
        }
    }
}
