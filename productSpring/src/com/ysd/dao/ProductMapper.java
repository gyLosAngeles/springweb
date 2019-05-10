package com.ysd.dao;

import java.util.List;

import com.ysd.entity.Product;

public interface ProductMapper {

	List<Product> selectProductByTiaoJian();
}
