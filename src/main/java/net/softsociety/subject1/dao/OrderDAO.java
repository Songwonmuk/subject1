package net.softsociety.subject1.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import net.softsociety.subject1.vo.order;

@Mapper
public interface OrderDAO {

	ArrayList<order> selectAll();

}