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
import model.classEmprestimos;
import model.classIgreja;
import model.classObjetos;
import model.classUsuario;
import view.frmPrincipal;

/**
 *
 * @author USER
 */
public class classMetodosConexao {

    // Método para fazer o login do usuário
    public classUsuario loginUser(String login, String senha) {
        classConexao con = new classConexao(); // Instanciando a classe que faz a conexao com o banco
        classUsuario user = new classUsuario(); // Instanciando a classe do usuário

        try {
            // Aqui irá preparar para buscar as informacoes de login e senha do usuario para confirmar se está certo ou nao, caso esteja, realizará o login

            PreparedStatement psmt = con.conectar().prepareStatement("Select loginUsu, senhaUsu, nomeUsu, idIgreUsu from tbUsuario where loginUsu = ? and senhaUsu = ?");
            psmt.setString(1, login);
            psmt.setString(2, senha);

            //O objeto rs está recebendo o que foi executado
            //atrvés do pstmt.executeQuery()
            ResultSet rs = psmt.executeQuery();
            rs.next();

//            user.setLoginUsu(rs.getString("loginUsu"));
//            user.setSenhaUsu(rs.getString("senhaUsu"));
//            user.setNomeUsu(rs.getString("nomeUsu"));
            

            // Mandando para a classe do usuário as informações que foram buscadas do banco
            user.setLoginUsu(rs.getString("loginUsu"));
            user.setSenhaUsu(rs.getString("senhaUsu"));
            user.setNomeUsu(rs.getString("nomeUsu"));
            user.setIdIgreUsu(rs.getInt("idIgreUsu"));
            
            System.out.println("METODO LOGIN: " + user.getNomeUsu() + " E " + user.getIdIgreUsu());

            // Chamando a tela principal caso dê tudo certo

            frmPrincipal prin = new frmPrincipal();
            prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
            prin.setVisible(true);
            
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "LOGIN INVÁLIDO, VERIFIQUE AS INFORMAÇÕES " + ex);

            System.out.println("Erro no metodo de login " + ex);

        }
        return user;
    }


//    public void cadastrarIgreja(classIgreja ig) throws SQLException {
//        classConexao con = new classConexao();
//        
//        try{
//            PreparedStatement psmt = con.conectar().prepareStatement("Insert into tbIgreja (idIgre, nomeIgre, telefoneIgre, ruaIgre, numeroIgre, bairroIgre, cidadeIgre, cepIgre) values (null, ?, ?, ?, ?, ?, ?)");
//            psmt.setString(1, us.)
//        }catch(){
//            
//        }
//    }

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
    
    public void cadastrarEmprestimos(classEmprestimos empre) throws SQLException {
        classConexao con = new classConexao();
        System.out.println("Tudo certo ate no cadastrar emprestimos");
        
        try {
            PreparedStatement psmt = con.conectar().prepareStatement("Insert into tbEmprestimos ( idEmpre, dataRetiEmpre, dataDevoEmpre, idEmpreUsu) values (null, ?, ?, ?)");
            psmt.setInt(1, empre.getIdEmpre());
            psmt.setDate(2, empre.getDataReti());
            psmt.setDate(3, empre.getDataDevo());
            psmt.setInt(4, empre.getIdEmpreUsu());
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro no metodo de cadastrar emprestimos " + ex);
        }
    }
    
    public void cadastrarObjetos(classObjetos obj) throws SQLException {
        classConexao con = new classConexao();
        System.out.println("Tudo certo ate no cadastrar objetos");
        
        try {
            PreparedStatement psmt = con.conectar().prepareStatement("Insert into tbObjetos ( idObj, nomeObj, descricaoObj, idObjIgre, statusObj) values (null, ?, ?, ?, ?)");
            psmt.setInt(1, obj.getIdObj());
            psmt.setString(2, obj.getNomeObj());
            psmt.setString(3, obj.getDescObj());
            psmt.setInt(4, obj.getIdObjIgre());
            psmt.setBoolean(5, obj.getStatusObj());
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro no metodo de cadastrar objetos " + ex);
        }
    }

}
