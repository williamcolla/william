/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class classUsuario {
    private int idUsu;
    private String nomeUsu;
    private String loginUsu;
    private String senhaUsu;
    private int idUsuIgre;
    
<<<<<<< HEAD
////    public classUsuario(int idUsu, String nomeUsu, String loginUsu, String senhaUsu, int idUsuIgre){
////        this.idUsu = idUsu;
////        this.nomeUsu = nomeUsu;
////        this.loginUsu = loginUsu;
////        this.senhaUsu = senhaUsu;
////        this.idUsuIgre = idUsuIgre;
////    }  
=======
    // Construtor
    public classUsuario(int idUsu, String nomeUsu, String loginUsu, String senhaUsu, int idUsuIgre){
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.loginUsu = loginUsu;
        this.senhaUsu = senhaUsu;
        this.idUsuIgre = idUsuIgre;
    }  

    public classUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> william

    
    
    public int getIdUsu(){
        return idUsu;
    }
    
    public void setIdUsu(int idUsu){
        this.idUsu = idUsu;
    }
    
    public String getNomeUsu(){
        return nomeUsu;
    }
    
    public void setNomeUsu(String nomeUsu){
        this.nomeUsu = nomeUsu;
    }
    
    public String getLoginUsu(){
        return loginUsu;
    }
    
    public void setLoginUsu(String loginUsu){
        this.loginUsu = loginUsu;
    }
    
    public String getSenhaUsu(){
        return senhaUsu;
    }
    
    public void setSenhaUsu(String senhaUsu){
        this.senhaUsu = senhaUsu;
    }
    
    public int getIdUsuIgre(){
        return idUsuIgre;
    }
    
    public void setIdUsuIgre(int idUsuIgre){
        this.idUsuIgre = idUsuIgre;
    }
}
