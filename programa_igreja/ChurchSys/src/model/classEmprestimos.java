/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author williamcolla
 */
public class classEmprestimos {
    private int idEmpre;
    private Date dataRetiEmpre;
    private Date dataDevoEmpre;
    private int idEmpreUsu;
    
    public classEmprestimos(int idEmpre, Date dataRetiEmpre, Date dataDevoEmpre, int idEmpreUsu) {
        this.idEmpre = idEmpre;
        this.dataRetiEmpre = dataRetiEmpre;
        this.dataDevoEmpre = dataDevoEmpre;
        this.idEmpreUsu = idEmpreUsu;
    }
    
    public int getIdEmpre() {
        return this.idEmpre;
    }
    
    public void setIdEmpre(int idEmpre) {
        this.idEmpre = idEmpre;
    }
    
    public Date getDataReti() {
        return this.dataRetiEmpre;
    }
    
    public void setDataReti(Date dataRetiEmpre) {
        this.dataRetiEmpre = dataRetiEmpre;
    }
    
    public Date getDataDevo() {
        return this.dataDevoEmpre;
    }
    
    public void setDataDevo(Date dataDevoEmpre) {
        this.dataDevoEmpre = dataDevoEmpre;
    }
    
    public int getIdEmpreUsu() {
        return this.idEmpreUsu;
    }
    
    public void setIdEmpreUsu(int idEmpreUsu) {
        this.idEmpreUsu = idEmpreUsu;
    }
}
