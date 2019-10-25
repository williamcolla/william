/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.classConexao;
import model.classEmprestados;
import model.classIgreja;
import model.classUsuario;
import view.frmLogin;
import view.frmPrincipal;

/**
 *
 * @author USER
 */
public class classMetodosConexao {

    // Método para fazer o login do usuário
    public String loginUser(String login, String senha) {
        classConexao con = new classConexao(); // Instanciando a classe que faz a conexao com o banco
        classUsuario user = new classUsuario(); // Instanciando a classe do usuário

        try {
            // Aqui irá preparar para buscar as informacoes de login e senha do usuario para confirmar se está certo ou nao, caso esteja, realizará o login
            PreparedStatement psmt = con.conectar().prepareStatement("Select loginUsu, senhaUsu, nomeUsu from tbUsuario where loginUsu = ? and senhaUsu = ?");
            psmt.setString(1, login);
            psmt.setString(2, senha);

            //O objeto rs está recebendo o que foi executado
            //atrvés do pstmt.executeQuery()
            ResultSet rs = psmt.executeQuery();
            rs.next();
            // Mandando para a classe do usuário as informações que foram buscadas do banco
            user.setLoginUsu(rs.getString("loginUsu"));
            user.setSenhaUsu(rs.getString("senhaUsu"));
            user.setNomeUsu(rs.getString("nomeUsu"));

            // Chamando a tela principal caso dê tudo certo
            frmPrincipal prin = new frmPrincipal();
            prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
            prin.setVisible(true);
        } catch (SQLException ex) {
            System.out.println("Erro no metodo de login " + ex);
        }
        return user.getNomeUsu();
    }

    // Função para realizar o cadastro das igrejas
    public void cadastrarIgreja(classIgreja igr) throws SQLException {
        classConexao con = new classConexao(); // Classe para realizar a conexão com o banco de dados
        System.out.println("Tudo certo até aqui no cadastrar igreja");

        try {
            // Inserindo a informações no banco de dados
            PreparedStatement psmt = con.conectar().prepareStatement("Insert into tbIgreja (idIgre, nomeIgre, telefoneIgre, ruaIgre, numeroIgre, bairroIgre, cidadeIgre, cepIgre) values (null, ?, ?, ?, ?, ?, ?)");
            psmt.setInt(1, igr.getIdIgre());
            psmt.setString(2, igr.getNomeIgre());
            psmt.setString(3, igr.getTeleIgre());
            psmt.setString(4, igr.getRuaIgre());
            psmt.setInt(5, igr.getNumIgre());
            psmt.setString(6, igr.getBairroIgre());
            psmt.setString(7, igr.getCidadeIgre());
            psmt.setString(8, igr.getCepIgre());
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro no metodo de cadastrar igreja " + ex);
        }
    }

    // Função para cadastrar os objetos emprestados
    public void cadastrarEmprestados(classEmprestados emp) throws SQLException {
        classConexao con = new classConexao();
        System.out.println("Tudo certo ate aqui no cadastrar emprestados");

        try {
            // Inserindo na tabela do banco os objetos emprestados
            PreparedStatement psmt = con.conectar().prepareStatement("Insert into tbEmprestados (idEmp, idEmpEmpre, idEmpObj) values (null, ?, ?)");
            psmt.setInt(1, emp.getIdEmp());
            psmt.setInt(2, emp.getIdEmpEmpre());
            psmt.setInt(3, emp.getIdEmpObj());
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro no metodo de cadastrar emprestados " + ex);
        }
    }
}
