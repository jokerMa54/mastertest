package com.tedu.spitemservice.service;

import com.tedu.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public String findItemByOrderId(Long orderId) {
        return "impl";
    }
}
