package newpackage;




public class task0car {

    private String marka;
     private String model;
    private int sila;
    private  int godina;

    public task0car(String markaVar, String modelVar, int silaNaDvigatelqVar, int godinaVar) {
        marka = markaVar;
        model = modelVar;
        sila = silaNaDvigatelqVar;
        godina = godinaVar;
    }


    
      
    
    public void setMarka(String markaVar) {
        this.marka = markaVar;
        
        

    }
    
    public void setModel(String modelVar) {
        
        this.model = modelVar;
        

    }

    public void setGodina(int godinaVar) {
      
        this.godina = godinaVar; 

    }

    
    public void setSila(int silaNaDvigatelqVar) {
        this.sila = silaNaDvigatelqVar;
       

    }
    
    
    
    public int getSila() {
        return sila;

    }

    public String getModel() {
        return model;

    }
    
    public String getMarka() {
        return marka;

    }
    
    
    public int getGodina() {
        return godina;

    }

    //*„Hello, I am <име>. I am


//*<години> years old.” Ако годините не са зададени, да не се отпечатва второто изречение. Ако
//*и името не е зададено, да се отпечатва “I am John Doe”.
    public void saying() {
        
        int year = 2016 - godina;  
        
        
if (year<8 && sila<80) { System.out.println(150 + 150*(20.0/100));}
else if( year<8 && sila>160) { System.out.println(150 + 150*(45.0/100)); } 
else if ( year<8 && sila>80 && sila<160) {System.out.println(150); }

else if( year >= 8 && year<15 && sila<80) { System.out.println(200 + 200*(20.0/100));}
else if( year >= 8 && year<15 && sila>160) { System.out.println(200+200*(45.0/100));}
else if( year >= 8 && year<15 && sila>80 && sila<160) { System.out.println(200);}



else if( year>=15 && year<25 && sila<80) { System.out.println(300+300*(20./100));}
else if( year>=15 && year<25 && sila>160) { System.out.println(300+300*(45.0/100));}
else if( year>=15 && year<25 && sila>80 && sila<160 ) { System.out.println(300);}



else if( year>=25 && sila<80 ) { System.out.println(100 + 500*(20.0/100));}
else if( year>=25 && sila>160 ) { System.out.println(500+500*(45.0/100));}
else if( year>=25 && sila>80 && sila<160) { System.out.println(500);}

}
        }
    

   //ange body of generated methods, choose Tools | Templates.
    

