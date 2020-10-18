package com.billpay.billpaycrudservice.formatter;

import com.billpay.crud.billpaycrudmodel.entity.PaymentEntity;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudMakePaymentRequest;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudManagePaymentResponse;

public interface IPaymentServiceFormatter {
	
	public PaymentEntity formatCreatePaymentRequestToEntity(CrudMakePaymentRequest createPaymentRequest);

	public CrudManagePaymentResponse formatManagePaymentResponse(CrudManagePaymentResponse createPaymentResponse);
}
