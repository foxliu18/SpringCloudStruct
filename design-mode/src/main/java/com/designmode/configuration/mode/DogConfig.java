package com.designmode.configuration.mode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DogConfig {
    @Value("旺财")
    public String name;
}
