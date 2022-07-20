package net.softsociety.subject1.service;

import java.util.ArrayList;

import net.softsociety.subject1.vo.Item;

public interface ShoppingService {

	public ArrayList<Item> selectItem();

	public Item selectOne(int p_num);

}
