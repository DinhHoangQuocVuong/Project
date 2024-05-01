package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;

public interface INewDao extends GenericDAO<NewModel> {
List<NewModel> findByCategoryId(Long categoryId);
Long save(NewModel newModel);


}
