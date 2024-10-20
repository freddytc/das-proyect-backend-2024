package com.example.backend.Controller.Services;

import com.example.backend.Model.Entities.Order;
import com.example.backend.Model.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get an order by ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Create a new order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Update an existing order
    public Order updateOrder(Long id, Order orderDetails) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            Order existingOrder = optionalOrder.get();
            existingOrder.setClient(orderDetails.getClient());
            existingOrder.setOrderDate(orderDetails.getOrderDate());
            existingOrder.setTotal(orderDetails.getTotal());
            existingOrder.setStatus(orderDetails.getStatus());
            return orderRepository.save(existingOrder);
        }
        return null; 
    }

    // Delete an order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
