package com.billpay.billpaycrudservice.services;

import com.billpay.crud.billpaycrudmodel.entity.PaymentEntity;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudMakePaymentRequest;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudManagePaymentResponse;

public interface IPaymentService {

	CrudManagePaymentResponse createPayment(PaymentEntity paymentEntity);

}
