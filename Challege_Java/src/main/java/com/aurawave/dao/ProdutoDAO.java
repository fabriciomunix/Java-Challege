package com.aurawave.dao;

import com.aurawave.model.Produto;
import com.aurawave.util.ConnectionFactory;
import java.sql.*;
import java.time.LocalDate;

public class ProdutoDAO {
    public void create(Produto p){
        String ddl = "CREATE TABLE IF NOT EXISTS PRODUTO(UUID VARCHAR(36) PRIMARY KEY, NOME VARCHAR(120), QUANTIDADE INT, ESTOQUE_MINIMO INT, SITUACAO VARCHAR(20), VALIDADE DATE)";
        String sql = "INSERT INTO PRODUTO(UUID,NOME,QUANTIDADE,ESTOQUE_MINIMO,SITUACAO,VALIDADE) VALUES(?,?,?,?,?,?)";
        try(Connection c = ConnectionFactory.getConnection()){
            c.createStatement().execute(ddl);
            try(PreparedStatement ps = c.prepareStatement(sql)){
                ps.setString(1, p.getUuid());
                ps.setString(2, p.getNome());
                ps.setInt(3, p.getQuantidade());
                ps.setInt(4, p.getEstoqueMinimo());
                ps.setString(5, p.getSituacao());
                ps.setDate(6, p.getValidade()==null? null : Date.valueOf(p.getValidade()));
                ps.executeUpdate();
            }
        }catch(Exception e){ throw new RuntimeException(e); }
    }

    public Produto findById(String uuid){
        String sql = "SELECT * FROM PRODUTO WHERE UUID=?";
        try(Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, uuid);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Produto p = new Produto();
                p.setUuid(rs.getString("UUID"));
                p.setNome(rs.getString("NOME"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setEstoqueMinimo(rs.getInt("ESTOQUE_MINIMO"));
                p.setSituacao(rs.getString("SITUACAO"));
                Date d = rs.getDate("VALIDADE");
                p.setValidade(d==null? null : d.toLocalDate());
                return p;
            }
        }catch(Exception e){ throw new RuntimeException(e); }
        return null;
    }

    public void updateQuantidade(String uuid, int novaQtd){
        String sql = "UPDATE PRODUTO SET QUANTIDADE=? WHERE UUID=?";
        try(Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setInt(1, novaQtd);
            ps.setString(2, uuid);
            ps.executeUpdate();
        }catch(Exception e){ throw new RuntimeException(e); }
    }

    public void delete(String uuid){
        String sql = "DELETE FROM PRODUTO WHERE UUID=?";
        try(Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, uuid);
            ps.executeUpdate();
        }catch(Exception e){ throw new RuntimeException(e); }
    }
}
