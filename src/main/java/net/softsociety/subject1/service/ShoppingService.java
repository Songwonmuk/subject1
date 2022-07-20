package net.softsociety.subject1.service;

import java.util.ArrayList;

import net.softsociety.subject1.vo.item;

public interface ShoppingService {

	public ArrayList<item> selectItem();

	public item selectOne(int p_num);

}
