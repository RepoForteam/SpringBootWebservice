package com.gap.training.mapper;

import com.gap.training.been.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt(1));
        order.setName(rs.getString(2));
        order.setType(rs.getString(3));
        order.setPrice(rs.getInt(4));
        order.setNumberOfItem(rs.getInt(5));
        return order;
    }
}
