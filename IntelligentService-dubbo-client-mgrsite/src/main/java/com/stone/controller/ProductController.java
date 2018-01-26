package com.stone.controller;

import com.stone.entity.Product;
import com.stone.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author stone
 * @date 2018/1/22 15:28
 */


@Controller
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ApplicationContext context;
    @Resource
    private IProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable("id") Long id) {
        Product product = productService.getProduct(id);
        System.out.println("product: "+product);
        return product;
    }
}
