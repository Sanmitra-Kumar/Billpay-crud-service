package com.billpay.crud.billpaycrudservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.billpay.billpaycrudservice.formatter.IPaymentServiceFormatter;
import com.billpay.billpaycrudservice.formatter.PaymentServiceFormatter;
import com.billpay.billpaycrudservice.services.IPaymentService;
import com.billpay.billpaycrudservice.services.PaymentServiceImpl;


@Configuration
@SpringBootApplication
@ComponentScan(basePackages =  "com.billpay.billpaycrudservice.paymentservice.controller")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BillpayCrudServiceApplication {

	@Bean
    public IPaymentServiceFormatter paymentServiceFormatter() {
        return new PaymentServiceFormatter();
    }
	
	/*
	 * @Bean public IManagePaymentRepository makePaymentAggregator() { return new
	 * ManagePaymentRepository(); }
	 */
	@Bean
    public IPaymentService paymentService() {
        return new PaymentServiceImpl();
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(BillpayCrudServiceApplication.class, args);
	}

}
