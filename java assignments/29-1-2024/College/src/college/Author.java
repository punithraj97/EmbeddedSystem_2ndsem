package college;

public class Author {
	
	String name;
	String email;
	char gender;
	
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	
	public String tostring()
	{
	    return "Author_name="+name+" "+"Author_email="+email+" "+"Author_sgender="+gender;	
	}
}
