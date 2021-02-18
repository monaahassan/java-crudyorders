package com.lambdaschool.crudyorders.repositories;

import com.lambdaschool.crudyorders.models.Agent;
import com.lambdaschool.crudyorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public class OrdersRepository extends CrudRepository<Order, long> {
}
