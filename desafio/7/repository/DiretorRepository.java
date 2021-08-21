package repository;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements IRepository<Diretor> {

    @Override
    public List<Diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT id,nome,cpf,salario,bonus FROM folha.diretor ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Diretor> diretores = new ArrayList<>();

        while (resultSet.next()) {
            Long id = resultSet.getLong(1);
            String nome = resultSet.getString(2);
            String cpf = resultSet.getString(3);
            Double salario = resultSet.getDouble(4);
            Double bonus = resultSet.getDouble(5);
            Diretor diretor = new Diretor(id,nome,cpf,salario,bonus);
            diretores.add(diretor);
        }
        conn.close();

        return diretores;
    }

    @Override
    public Diretor findById(Long id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT nome,cpf,salario,bonus FROM folha.diretor WHERE id = ?");
        statement.setLong(1, id);
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        Diretor diretor = new Diretor();
        while (resultSet.next()) {
            String nome = resultSet.getString(1);
            String cpf = resultSet.getString(2);
            Double salario = resultSet.getDouble(3);
            Double bonus = resultSet.getDouble(4);
            diretor = new Diretor(id,nome,cpf,salario,bonus);
        }
        conn.close();

        return diretor;
    }

}
