package Tarea;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class patient {
    private String name;
    private String CI;
    Date birth = new Date();
    private boolean sex;
    private double weight;
    private double height;
    private String address;
    private List<Photos> medicalImages;
    private List<Diseases> diseases;
    
    
    public patient (String name, String CI, Date birth_date, boolean sex, float weight, float height, String address, ArrayList medicalImages, ArrayList diseases){
        this.name = name;
        this.CI = CI;
        this.birth = birth_date;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.address = address;
        this.medicalImages = new ArrayList<>();
        this.diseases = new ArrayList<>();
        
    
    }
    
    public String getName(){
    
        return name;
        
    }
    public void setName(String name){
    
        this.name = name;
        
    }
    public String getCI(){
    
        return CI;
        
    }
    public void setCI(String CI){
        
    
        this.CI = CI;
        
    }
    public Date getBirth(){
    
        return birth;
        
    }
    public void setBirth(Date birth){
        
         this.birth= birth;
        
    }
    public boolean getSex(){
    
        return sex;
        
    }
     public void setSex(boolean sex){
    
        this.sex = sex;
        
    }
    public double getWeight(){
    
        return weight;
        
    }
    public void setWeight(double weight){
    
        this.weight = weight;
        
    }
    public double getHeight(){
    
        return height;
        
    }
    
    public void setHeight(double height){
    
        this.height = height;
        
    }
    
    public String getAddress(){
    
        return address;
        
    }
    public void setAddress(String address){
    
        this.address = address;
        
    }
    
    
}
