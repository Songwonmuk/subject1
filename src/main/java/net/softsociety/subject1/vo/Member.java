package net.softsociety.subject1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
	String id;
	String password;
	String name;
	String address;
	
}
