package Tarea;

import java.util.Date;


public class diseases {
    private String disease_name;
    private Date date = new Date();
    private String disease_treatment;
    
    public diseases(String disease_name, Date date, String disease_treatment){
    this.disease_name = disease_name;
    this.date = date;
    this.disease_treatment = disease_treatment;
    }    
    public String get_Disease_Name(){
    return disease_name;
    }
    
    public void set_Disease_Name(String disease_name){
    
        this.disease_name = disease_name;
    
    }
    public Date get_Date(){
    return date;
    }
    
    public void set_Date(Date date){
    
        this.date = date;
    
    }
    public String get_Disease_Treatment(){
    return disease_treatment;
    }
    
    public void set_Disease_Treatment(String disease_treatment){
    
        this.disease_treatment = disease_treatment;
    
    }
}
    
    
    
