package service;

import model.Cliente;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteService implements IService<Cliente> {

    @Override
    public Cliente save(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.clientes values(?,?,?,?,?,?,?)");
        insert.setInt(1, cliente.getId());
        insert.setString(2, cliente.getNome());
        insert.setString(3, cliente.getDocumento());
        insert.setDouble(4, cliente.getAltura());
        insert.setDouble(5, cliente.getPeso());
        insert.setDate(6, null);
        insert.setLong(7, cliente.getCidadeId());
        insert.executeUpdate();
        conn.close();

        return cliente;
    }

    @Override
    public Cliente update(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.clientes SET nome = ?, cpf = ?, altura = ?,peso = ? WHERE id = ?");
        update.setString(1, cliente.getNome());
        update.setString(2, cliente.getDocumento());
        update.setDouble(3, cliente.getAltura());
        update.setDouble(4, cliente.getPeso());
        update.setInt(5, cliente.getId());
        update.executeUpdate();
        conn.close();

        return cliente;
    }

    @Override
    public Cliente delete(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.clientes WHERE ID = ?");
        statement2.setInt(1, cliente.getId());
        statement2.executeUpdate();
        conn.close();

        return cliente;
    }
}
