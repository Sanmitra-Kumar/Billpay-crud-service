package com.billpay.billpaycrudservice.paymentservice.controller;


import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billpay.billpaycrudservice.formatter.IPaymentServiceFormatter;
import com.billpay.billpaycrudservice.services.IPaymentService;
import com.billpay.billpaycrudservice.util.CrudBillpayConstants;
import com.billpay.crud.billpaycrudmodel.entity.PaymentEntity;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudMakePaymentRequest;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudManagePaymentResponse;


@RestController
@RequestMapping(CrudBillpayConstants.CRUD_MAPPING_URL)
public class PaymentServiceController {
	
	//private Logger Logger = (org.slf4j.Logger) LogFactory.getLog(PaymentServiceController.class);
	
	@Autowired
	IPaymentServiceFormatter paymentServiceFormatter;
	
	@Autowired
	IPaymentService paymentManagementService;
	
	@PostMapping(value = CrudBillpayConstants.CREATE_PAYMENT, consumes = "application/json", produces = "application/json")
	public CrudManagePaymentResponse createPayment(@RequestBody CrudMakePaymentRequest createPaymentRequest) {
		
		System.out.println("Make Payment Crud service request: " + createPaymentRequest.toString());
		//Logger.info("Make Payment UI request: {}",createPaymentRequest);
		PaymentEntity paymentEntity = paymentServiceFormatter.formatCreatePaymentRequestToEntity(createPaymentRequest);
		CrudManagePaymentResponse createPaymentResponse = paymentManagementService.createPayment(paymentEntity);
		//createPaymentResponse = paymentServiceFormatter.formatManagePaymentResponse(createPaymentResponse);
		System.out.println("Make Payment Crud service response: " + createPaymentResponse.toString());
		return createPaymentResponse;
	}

}
