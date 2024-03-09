package com.gap.training.repository;

import com.gap.training.been.Order;
import com.gap.training.mapper.OrderRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Order> findAllOrders() {
        return this.jdbcTemplate.query("select * from orderinfo", new OrderRowMapper());
    }

    public Order findById(int id) {
        return this.jdbcTemplate.queryForObject("select * from orderinfo where id ="+id, new OrderRowMapper());
    }
}
