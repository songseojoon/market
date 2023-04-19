package com.market.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.market.domain.ProductVO;

@Mapper
public interface ProductDAO {

	public List<ProductVO> getProdList(Map<String, Object> map);
}