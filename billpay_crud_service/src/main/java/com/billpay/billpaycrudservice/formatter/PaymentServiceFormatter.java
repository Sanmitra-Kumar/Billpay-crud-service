package com.billpay.billpaycrudservice.formatter;

import java.util.ArrayList;
import java.util.List;

import com.billpay.crud.billpaycrudmodel.entity.PaymentEntity;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudBillPaymentInfoItem;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudMakePaymentRequest;
import com.billpay.crud.billpaycrudmodel.managepayment.model.CrudManagePaymentResponse;


public class PaymentServiceFormatter implements IPaymentServiceFormatter {

	public PaymentEntity formatCreatePaymentRequestToEntity(CrudMakePaymentRequest createPaymentRequest) {
		PaymentEntity paymentEntity = new PaymentEntity();
		List<CrudBillPaymentInfoItem> payments = new ArrayList<>();
		payments = createPaymentRequest.getPayments();
		for(CrudBillPaymentInfoItem paymentInfo : payments) {
			if(createPaymentRequest.getPaymentType().equals("1")) {
				paymentEntity.setPaymentDate(paymentInfo.getPaymentDate()!=null? paymentInfo.getPaymentDate():null);
				paymentEntity.setPaymentReferenceNumber(paymentInfo.getPaymentReferenceNumber());
			}
			else {
				paymentEntity.setNextPaymentDate(paymentInfo.getNextPaymentDate()!=null? paymentInfo.getNextPaymentDate():null);
				paymentEntity.setPaymentFrequency(paymentInfo.getPaymentFrequency());
				paymentEntity.setRecurringLimitType(paymentInfo.getRecurringLimitType());
				paymentEntity.setRecurringReferenceNumber(paymentInfo.getRecurringReferenceNumber());
				paymentEntity.setTotalPaymentCount(paymentInfo.getTotalPaymentCount());
				paymentEntity.setTotalTransactionAmount(paymentInfo.getTotalTransactionAmount());
			}
			paymentEntity.setPayeeNickname(paymentInfo.getPayeeNickname());
			paymentEntity.setPaymentMethod(paymentInfo.getPaymentMethod());
			paymentEntity.setTransactionAmount(paymentInfo.getTransactionAmount());
			
		}
		
		paymentEntity.setPaymentType(createPaymentRequest.getPaymentType());
		
		//crudMakePaymentRequest.setPaymentActionType("1");
		
		System.out.println("Formatted Payment Entity : " + paymentEntity.toString());

		return paymentEntity;
	}

	public CrudManagePaymentResponse formatManagePaymentResponse(CrudManagePaymentResponse crudManagePaymentResponse) {
		
		return null;
	}

}
