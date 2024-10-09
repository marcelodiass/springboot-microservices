package com.marcelodias.microservices.order.repository;

import com.marcelodias.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
