package service;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.*;

public class FuncionarioService implements IService<Funcionario> {

    @Override
    public Funcionario save(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement insert = conn.prepareStatement("insert into folha.funcionario values(nextval('folha.SEQ_FUNCIONARIO'),?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            System.out.println(funcionario);
            insert.setString(1, funcionario.getNome());
            insert.setString(2, funcionario.getCpf());
            insert.setDouble(3, funcionario.getSalario());
            insert.executeUpdate();
            ResultSet rs = insert.getGeneratedKeys();
            if(rs.next()) {
                funcionario.setId((long) rs.getInt(1));
            }
        }
        conn.close();
        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE folha.funcionario SET nome = ?, cpf = ?, salario = ? WHERE id = ?");
        update.setString(1, funcionario.getNome());
        update.setString(2, funcionario.getCpf());
        update.setDouble(3, funcionario.getSalario());
        update.setLong(4, funcionario.getId());
        update.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM folha.funcionario WHERE ID = ?");
        statement2.setLong(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return funcionario;
    }
}
