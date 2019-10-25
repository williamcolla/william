/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author williamcolla
 */
public class classIgreja {
   private int idIgre;
   private String nomeIgre;
   private String teleIgre;
   private String ruaIgre;
   private int numIgre;
   private String bairroIgre;
   private String cidadeIgre;
   private String cepIgre;
   
   // Construtor
   public classIgreja(int idIgre, String nomeIgre, String teleIgre, String ruaIgre, int numIgre, String bairroIgre, String cidadeIgre, String cepIgre) {
       this.idIgre = idIgre;
       this.nomeIgre = nomeIgre;
       this.teleIgre = teleIgre;
       this.ruaIgre = ruaIgre;
       this.numIgre = numIgre;
       this.bairroIgre = bairroIgre;
       this.cidadeIgre = cidadeIgre;
       this.cepIgre = cepIgre;
   }

    public classIgreja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public int getIdIgre() { 
       return this.idIgre;
   }
   
   public void setIdIgre(int idIgre) {
       this.idIgre = idIgre;
   }
   
   public String getNomeIgre() {
       return this.nomeIgre;
   }
   
   public void setNomeIgre(String nomeIgre) {
       this.nomeIgre = nomeIgre;
   }
   
   public String getTeleIgre() {
       return this.teleIgre;
   }
   
   public void setTeleIgre(String teleIgre) {
       this.teleIgre = teleIgre;
   }
   
   public String getRuaIgre() {
       return this.ruaIgre;
   }
   
   public void setRuaIgre(String ruaIgre) {
       this.ruaIgre = ruaIgre;
   }
   
   public int getNumIgre() {
       return this.numIgre;
   }
   
   public void setNumIgre(int numIgre) {
       this.numIgre = numIgre;
   }
   
   public String getBairroIgre() {
       return this.bairroIgre;
   }
   
   public void setBairroIgre(String bairroIgre) {
       this.bairroIgre = bairroIgre;
   }
   
   public String getCidadeIgre() {
       return this.bairroIgre;
   }
   
   public void setCidadeIgre(String cidadeIgre) {
       this.cidadeIgre =cidadeIgre;
   }
   
   public String getCepIgre() {
       return this.cepIgre;
   }
   
   public void setCepIgre(String cepIgre) {
       this.cepIgre = cepIgre;
   }
}
