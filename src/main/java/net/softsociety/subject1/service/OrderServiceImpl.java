package net.softsociety.subject1.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.subject1.dao.OrderDAO;
import net.softsociety.subject1.vo.order;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderDAO orderDAO;
	
	@Override
	public ArrayList<order> selectAll() {

		ArrayList<order> list = orderDAO.selectAll();
		
		return list;
	}

}
