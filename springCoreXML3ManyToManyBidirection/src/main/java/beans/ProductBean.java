package beans;

import java.util.List;

import lombok.Data;

@Data
public class ProductBean {
	private int id;
	private String name;
	private String type;
	List<CustomerBean> customer; 
}
