package beans;

import java.util.List;

import lombok.Data;

@Data
public class CustomerBean {
	private int id;
	private String name;
	private long contact;
	List<ProductBean> beans;
}
