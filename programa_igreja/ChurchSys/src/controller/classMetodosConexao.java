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
import model.classUsuario;
import view.frmLogin;
import view.frmPrincipal;

/**
 *
 * @author USER
 */
public class classMetodosConexao {

    public String loginUser(String login, String senha) {
        classConexao con = new classConexao();
        classUsuario user = new classUsuario();

        try {
            PreparedStatement psmt = con.conectar().prepareStatement("Select loginUsu, senhaUsu, nomeUsu from tbUsuario where loginUsu = ? and senhaUsu = ?");
            psmt.setString(1, login);
            psmt.setString(2, senha);

            //O objeto rs está recebendo o que foi executado
            //atrvés do pstmt.executeQuery()
            ResultSet rs = psmt.executeQuery();
            rs.next();
            user.setLoginUsu(rs.getString("loginUsu"));
            user.setSenhaUsu(rs.getString("senhaUsu"));
            user.setNomeUsu(rs.getString("nomeUsu"));
            
            frmPrincipal prin = new frmPrincipal();
            prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
            prin.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LOGIN INVÁLIDO, VERIFIQUE AS INFORMAÇÕES " + ex);
        }
        return user.getNomeUsu();
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
}
