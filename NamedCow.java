class NamedCow extends Cow
{
   private String myName; 

   public NamedCow(String type, String name, String sound)
   {
   		
   		myName = name;
   		
   }

   public void NamedCow()
   {
   	
   	  myName ="Andrew";	 
   }

   public String getName(){return myName;}
   public String getSound(){return mySound;}     
   public String getType(){return myType;} 
}