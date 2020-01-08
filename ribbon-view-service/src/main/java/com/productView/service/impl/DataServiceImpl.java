package com.productView.service.impl;

import com.productView.client.ClientRibbon;
import com.productView.service.DataService;
import com.productView.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private ClientRibbon clientRibbon;

    @Override
    public List<Product> listProducts() {
        return clientRibbon.listProdcuts();
    }
}
