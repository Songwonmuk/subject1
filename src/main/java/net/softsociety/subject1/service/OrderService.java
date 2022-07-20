package net.softsociety.subject1.service;

import java.util.ArrayList;

import net.softsociety.subject1.vo.Order;

public interface OrderService {

	ArrayList<Order> selectAll();

	int deleteOrder(int order_num);

}
