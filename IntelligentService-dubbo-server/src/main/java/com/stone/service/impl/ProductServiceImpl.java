package com.stone.service.impl;

import com.stone.entity.Product;
import com.stone.mapper.ProductMapper;
import com.stone.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author stone
 * @date 2018/1/22 10:06
 */
@Service
public class ProductServiceImpl implements IProductService {


    @Autowired
    private ProductMapper productMapper;



    @Override
    public Product getProduct(Long id) {
        Product product = productMapper.selectOne(id);
        return product;
    }

}
