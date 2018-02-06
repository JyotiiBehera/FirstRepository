
public class Objectcreation {
	    String name;
	    String type;
	    int age;
	    String colormark;
	 
	    
	    public Objectcreation(String name, String breed,
	                   int age, String color)
	    {
	        this.name = name;
	        this.type= breed;
	        this.age = age;
	        this.colormark = colormark;
	    }
	 
	    
	    public String getName()
	    {
	        return name;
	    }
	 
	  
	    public String gettype()
	    {
	        return type;
	    }
	 
	    
	    public int getAge()
	    {
	        return age;
	    }
	 
	    
	    public String getColormark()
	    {
	        return colormark;
	    }
	 
	   
	    public String toString()
	    {
	        return("Hi my name is "+ this.getName()+
	               "My Type,age and color are " +
	               this.gettype()+"," + this.getAge()+
	               ","+ this.getColormark());
	    }
	 
	    public static void main(String[] args)
	    {
	    	 Objectcreation tuffy = new  Objectcreation("tuffy","papillon", 5, "white");
	        System.out.println(tuffy.toString());
	    }

}
