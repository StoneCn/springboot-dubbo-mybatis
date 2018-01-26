package com.stone.service;

import com.stone.entity.Product;
import org.springframework.stereotype.Service;

/**
 * @author stone
 * @date 2018/1/22 10:03
 */
public interface IProductService {

    public Product getProduct(Long id);
}
