package com.nk.springboot_Mysql.pk1;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {
    private final JdbcTemplate jdbcTemplate;
    public CustomerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customers", (rs, rowNum) ->
                new Customer(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                )
        );
    }
}
