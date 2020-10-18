package com.billpay.billpaycrudservice.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.billpay.crud.billpaycrudmodel.entity.PaymentEntity;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudMakePaymentRequest;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudManagePaymentResponse;

public class PaymentServiceImpl implements IPaymentService {
	
	/*
	 * @Autowired IManagePaymentRepository managePaymentRepository;
	 */

	@Override
	public CrudManagePaymentResponse createPayment(PaymentEntity paymentEntity) {
		
		CrudManagePaymentResponse crudManagePaymentResponse = new CrudManagePaymentResponse();
		crudManagePaymentResponse.setPaymentReferenceNumber("10003");
		crudManagePaymentResponse.setResponseCode("0000");
		crudManagePaymentResponse.setResponseMessage("success");
		
		return crudManagePaymentResponse;
	}

}
