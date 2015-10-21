class NamedCow extends Cow
{
   private String myType;     
   private String mySound; 
   private String myName;     

   public NamedCow(String type, String name, String sound)
   {
   		myType = type;
   		myName = name;
   		mySound = sound;
   }

   public void NamedCow()
   {
   	  myType = "Cow"; 
   	  myName ="Andrew";
   	  mySound = "Moo"; 
   }

   public String getName(){return myName;}
   public String getSound(){return mySound;}     
   public String getType(){return myType;} 
}