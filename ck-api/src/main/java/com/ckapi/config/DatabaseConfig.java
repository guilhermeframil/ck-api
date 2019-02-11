package com.ckapi.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.ckapi.reopsitory")
@EnableTransactionManagement
public class DatabaseConfig {

}
