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
public class classObjetos {
    private int idObj;
    private String nomeObj;
    private String descObj;
    private int idObjIgre;
    private boolean statusObj;
    
    public classObjetos(int idObj, String nomeObj, String descObj, int idObjIgre, boolean statusObj) {
        this.idObj = idObj;
        this.nomeObj = nomeObj;
        this.descObj = descObj;
        this.idObjIgre = idObjIgre;
        this.statusObj = statusObj;
    }
    
    public int getIdObj() {
        return this.idObj;
    }
    
    public void setIdObj(int idObj) {
        this.idObj = idObj;
    }
    
    public String getNomeObj() {
        return this.nomeObj;
    }
    
    public void setNomeObj(String nomeObj) {
        this.nomeObj = nomeObj;
    }
    
    public String getDescObj() {
        return this.descObj;
    }
    
    public void setDescObj(String descObj) {
        this.descObj = descObj;
    }
    
    public int getIdObjIgre() {
        return this.idObjIgre;
    }
    
    public void setIdObjIgre(int idObjIgre) {
        this.idObjIgre = idObjIgre;
    }
    
    public boolean getStatusObj() {
        return this.statusObj;
    }
    
    public void setStatusObj(boolean statusObj) {
        this.statusObj = statusObj;
    }
}
