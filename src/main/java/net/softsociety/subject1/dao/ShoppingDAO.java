package net.softsociety.subject1.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.subject1.vo.Item;

@Mapper
public interface ShoppingDAO {

	ArrayList<Item> selectItem();

	Item selectOne(int p_num);

}
