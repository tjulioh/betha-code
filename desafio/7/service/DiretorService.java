package service;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiretorService implements IService<Diretor> {

    @Override
    public Diretor save(Diretor funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        try (PreparedStatement insert = conn.prepareStatement("insert into folha.diretor values(?,?,?,?,?)")) {
            insert.setInt(1, funcionario.getId());
            insert.setString(2, funcionario.getNome());
            insert.setString(3, funcionario.getCpf());
            insert.setDouble(4, funcionario.getSalario());
            insert.setDouble(5, funcionario.getBonus());
            insert.executeUpdate();
        }
        conn.close();

        return funcionario;
    }

    @Override
    public Diretor update(Diretor funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE folha.diretor SET nome = ?, cpf = ?, salario = ?, bonus = ? WHERE id = ?");
        update.setString(1, funcionario.getNome());
        update.setString(2, funcionario.getCpf());
        update.setDouble(3, funcionario.getSalario());
        update.setDouble(4, funcionario.getBonus());
        update.setInt(5, funcionario.getId());
        update.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Diretor delete(Diretor funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM folha.diretor WHERE ID = ?");
        statement2.setInt(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return funcionario;
    }
}