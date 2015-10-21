class Chick implements Animal 
{     
     //your code here
	private String myType;     
    private String mySound;    
    private String mySound1;     
    public Chick(String type, String sound1, String sound)
    {         
         myType = type;
         mySound1 = sound1;         
         mySound = sound;     
    }  

 
    public Chick()
    {         
        myType = "Chick";  
        mySound1 = "Cheep";       
        mySound = "Cluck";     
    }      
    public String getSound()
    {
    	int num = (int)(Math.random()*2);
 		if(num == 1)
 		{
 			return mySound;
 		}
 		else 
 		{
 			return mySound1;
 		}
    	
    }     
    public String getType(){return myType;} 

}