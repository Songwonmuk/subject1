package net.softsociety.subject1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.subject1.dao.ShoppingDAO;
import net.softsociety.subject1.vo.Item;

@Service
@Slf4j
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	public ShoppingDAO shoppingDAO;
	
	@Override
	public ArrayList<Item> selectItem() {
		
		ArrayList<Item> list = shoppingDAO.selectItem();
		
		return list;
	}

	@Override
	public Item selectOne(int p_num) {

		Item tem = shoppingDAO.selectOne(p_num);
		
		return tem;
	}

}
