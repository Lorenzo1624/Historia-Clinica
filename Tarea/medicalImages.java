package Tarea;

import java.util.Date;

public class medicalImages {
    private String photo_name;
    private Date photo_date = new Date ();
    private String doctor_opinion;
    private String photo_type;
    
    
    public void photo (String photo_name, Date photo_date, String photo_type, String doctor_opinion){
       this.photo_name = photo_name;
       this.photo_date = photo_date;
         this.photo_type = photo_type;
       this.doctor_opinion = doctor_opinion;
    
    }
    
    public String get_Photo_Name(){
    return photo_name;
}
    public void set_Photo_Name(String photo_name){
    this.photo_name = photo_name;
}
    public Date get_Photo_Date(){
    return photo_date;
}
    public void set_Photo_Date(Date photo_date){
    this.photo_date = photo_date;
}
   public String get_Photo_Type(){
    return photo_type;
}
    public void set_Photo_Type(String photo_type){
    this.photo_type = photo_type;
}    
    public String get_Doctor_Opinion(){
    return doctor_opinion;
}
    public void set_Doctor_Opinion(String doctor_opinion){
    this.doctor_opinion = doctor_opinion;
}
    }
