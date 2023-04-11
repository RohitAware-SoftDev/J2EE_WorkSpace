package beans;

import lombok.Data;

@Data
public class PersonBean {

	private int id;
	private String name;	
	private String email;
	private String contact;
 	private AdharBean adhar;  
}
