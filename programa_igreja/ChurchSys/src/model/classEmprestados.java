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
public class classEmprestados {
    private int idEmp;
    private int idEmpEmpre;
    private int idEmpObj;
    
    public classEmprestados(int idEmp, int idEmpEmpre, int idEmpObj) {
        this.idEmp = idEmp;
        this.idEmpEmpre = idEmpEmpre;
        this.idEmpObj = idEmpObj;
    }
    
    public int getIdEmp() {
        return this.idEmp;
    }
    
    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }
    
    public int getIdEmpEmpre() {
        return this.idEmpEmpre;
    }
    
    public void setIdEmpEmpre(int idEmpEmpre) {
        this.idEmpEmpre = idEmpEmpre;
    }
    
    public int getIdEmpObj() {
        return this.idEmpObj;
    }
    
    public void setIdEmpObj(int idEmpObj) {
        this.idEmpObj = idEmpObj;
    }
}
