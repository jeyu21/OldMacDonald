class Chick implements Animal 
{     
      
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         if((int)(Math.random()*2)<1)    
            mySound = sound1;
        else
            mySound = sound2;
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
