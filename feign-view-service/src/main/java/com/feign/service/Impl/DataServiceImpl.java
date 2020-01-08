package com.feign.service.Impl;

import com.feign.client.ClientFeign;
import com.feign.service.DataService;
import com.feign.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private ClientFeign clientFeign;

    @Override
    public List<Product> listProdcuts() {
        return clientFeign.listProdcuts();
    }
}
