package com.bl.springbatch.config;
import com.bl.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

import java.util.EmptyStackException;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws EmptyStackException {
        if(customer.getCountry().equals("United States")) {
            return customer;
        }else{
            return null;
        }
    }
}