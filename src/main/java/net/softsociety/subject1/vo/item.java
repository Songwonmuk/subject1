package net.softsociety.subject1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class item {

	public int p_num;
	public String p_name;
	public int amount;
	public int price;
}
