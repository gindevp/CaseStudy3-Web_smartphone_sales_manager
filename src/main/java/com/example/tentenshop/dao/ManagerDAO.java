package com.example.tentenshop.dao;

import java.util.List;

public interface  ManagerDAO<E> {
     boolean insert(E entity);
     boolean update(E entity);
     boolean delete(int key);
     List<E> selectAll();
     E selectByID(int key);
}
