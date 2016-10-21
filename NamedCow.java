class NamedCow extends Cow {  
    private String myName; 
    private String myType;     
     private String mySound;      
    public NamedCow(String type, String name, String sound){
    myType = type;
    myName = name;
    mySound = sound;
}
public NamedCow(){
 myName ="Elsie";
}
     public String getName(){
        return myName;
     }
}
