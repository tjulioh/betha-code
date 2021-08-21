package integracaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ServerSidePreparedStatement {

    public static void main(String args[]) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/folha";
        Connection conn = DriverManager.getConnection(url, "folha_owner", "");

        //Inserção
        PreparedStatement stmt = conn.prepareStatement("insert into clientes values(?,?,?,?,?,?,?)");
        stmt.setInt(1, 8);
        stmt.setString(2, "Bruno Kurzawe");
        stmt.setString(3, "04696900975");
        stmt.setDouble(4, 1.74);
        stmt.setInt(5, 99);
        stmt.setDate(6, null);
        stmt.setInt(7, 1);

        int i = stmt.executeUpdate();
        System.out.println(i + " records inserted");


        //Busca
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM clientes ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }

        //Busca por id
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM clientes WHERE id = ?");
        statement3.setLong(1, 1);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        while (resultSet3.next()) {
            String index = resultSet3.getString(2);
            System.out.println(index);
        }


        //Update
        PreparedStatement ps = conn.prepareStatement("UPDATE clientes SET nome = ? WHERE id = ?");
        ps.setString(1, "Alterado");
        ps.setLong(2, 1);
        ps.executeUpdate();

        //delete
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM clientes WHERE ID = ?");
        statement2.setInt(1, 2);
        statement2.executeUpdate();


        conn.close();
    }

}
