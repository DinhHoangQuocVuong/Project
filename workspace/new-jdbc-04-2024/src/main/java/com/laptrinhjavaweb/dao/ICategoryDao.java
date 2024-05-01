package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;

public interface ICategoryDao extends GenericDAO<CategoryModel>{

	List<CategoryModel>findAll();
}
