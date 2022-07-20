package net.softsociety.subject1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.subject1.dao.ShoppingDAO;
import net.softsociety.subject1.vo.item;

@Service
@Slf4j
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	public ShoppingDAO shoppingDAO;
	
	@Override
	public ArrayList<item> selectItem() {
		
		ArrayList<item> list = shoppingDAO.selectItem();
		
		return list;
	}

}
