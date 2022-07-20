package net.softsociety.subject1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	public int order_num;
	public String id;
	public String name;
	public String address;
	public String p_name;
	public int p_amount;
	public int p_price;
	public int num;
	
}
