package repository;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<Funcionario> {

    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT id,nome,cpf,salario FROM folha.funcionario ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Funcionario> funcionarios = new ArrayList<>();

        while (resultSet.next()) {
            Long id = resultSet.getLong(1);
            String nome = resultSet.getString(2);
            String cpf = resultSet.getString(3);
            Double salario = resultSet.getDouble(4);
            Funcionario funcionario = new Funcionario(id,nome,cpf,salario);
            funcionarios.add(funcionario);
        }
        conn.close();

        return funcionarios;
    }

    @Override
    public Funcionario findById(Long id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT nome,cpf,salario FROM folha.funcionario WHERE id = ?");
        statement.setLong(1, id);
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        Funcionario funcionario = new Funcionario();
        while (resultSet.next()) {
            String nome = resultSet.getString(1);
            String cpf = resultSet.getString(2);
            Double salario = resultSet.getDouble(3);
            funcionario = new Funcionario(id,nome,cpf,salario);
        }
        conn.close();

        return funcionario;
    }

}
