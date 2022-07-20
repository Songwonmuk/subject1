package net.softsociety.subject1.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.subject1.vo.Order;

@Mapper
public interface OrderDAO {

	ArrayList<Order> selectAll();

	int deleteOrder(int order_num);

}
