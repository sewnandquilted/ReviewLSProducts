package application.model;

import java.math.BigDecimal;

public class EjTransaction {

	private String journalTxnDate;
	private String journalTxnTime;
	private String journalTxnID;
	private BigDecimal journalTxnPaymentTotal;
	private BigDecimal journalTxnPaymentCHARGE;
	private BigDecimal journalTxnPaymentCASH;
	private BigDecimal journalTxnPaymentCOUPON;
	private BigDecimal journalTxnPaymentDiscountPCT;
	private BigDecimal journalTxnPaymentDiscount;
	private BigDecimal journalTxnPaymentRounding;
	
	private String getJournalTxnDate2() {
		return journalTxnDate;
	}
	private void setJournalTxnDate2(String journalTxnDate2) {
		this.journalTxnDate = journalTxnDate2;
	}
	private String getJournalTxnTime2() {
		return journalTxnTime;
	}
	private void setJournalTxnTime2(String journalTxnTime2) {
		this.journalTxnTime = journalTxnTime2;
	}
	private String getJournalTxnID2() {
		return journalTxnID;
	}
	private void setJournalTxnID2(String journalTxnID2) {
		this.journalTxnID = journalTxnID2;
	}
	private BigDecimal getJournalTxnPaymentTotal2() {
		return journalTxnPaymentTotal;
	}
	private void setJournalTxnPaymentTotal2(BigDecimal journalTxnPaymentTotal2) {
		this.journalTxnPaymentTotal = journalTxnPaymentTotal2;
	}
	private BigDecimal getJournalTxnPaymentCHARGE2() {
		return journalTxnPaymentCHARGE;
	}
	private void setJournalTxnPaymentCHARGE2(BigDecimal journalTxnPaymentCHARGE2) {
		journalTxnPaymentCHARGE = journalTxnPaymentCHARGE2;
	}
	private BigDecimal getJournalTxnPaymentCASH2() {
		return journalTxnPaymentCASH;
	}
	private void setJournalTxnPaymentCASH2(BigDecimal journalTxnPaymentCASH2) {
		journalTxnPaymentCASH = journalTxnPaymentCASH2;
	}
	private BigDecimal getJournalTxnPaymentCOUPON2() {
		return journalTxnPaymentCOUPON;
	}
	private void setJournalTxnPaymentCOUPON2(BigDecimal journalTxnPaymentCOUPON2) {
		journalTxnPaymentCOUPON = journalTxnPaymentCOUPON2;
	}
	private BigDecimal getJournalTxnPaymentDiscountPCT2() {
		return journalTxnPaymentDiscountPCT;
	}
	private void setJournalTxnPaymentDiscountPCT2(BigDecimal journalTxnPaymentDiscountPCT2) {
		this.journalTxnPaymentDiscountPCT = journalTxnPaymentDiscountPCT2;
	}
	private BigDecimal getJournalTxnPaymentDiscount2() {
		return journalTxnPaymentDiscount;
	}
	private void setJournalTxnPaymentDiscount2(BigDecimal journalTxnPaymentDiscount2) {
		this.journalTxnPaymentDiscount = journalTxnPaymentDiscount2;
	}
	private BigDecimal getJournalTxnPaymentRounding2() {
		return journalTxnPaymentRounding;
	}
	private void setJournalTxnPaymentRounding2(BigDecimal journalTxnPaymentRounding2) {
		journalTxnPaymentRounding = journalTxnPaymentRounding2;
	}
	public EjTransaction(String journalTxnDate2, String journalTxnTime2, String journalTxnID2,
			BigDecimal journalTxnPaymentTotal2, BigDecimal journalTxnPaymentCHARGE2, BigDecimal journalTxnPaymentCASH2,
			BigDecimal journalTxnPaymentCOUPON2, BigDecimal journalTxnPaymentDiscountPCT2,
			BigDecimal journalTxnPaymentDiscount2, BigDecimal journalTxnPaymentRounding2) {
		super();
		this.journalTxnDate = journalTxnDate2;
		this.journalTxnTime = journalTxnTime2;
		this.journalTxnID = journalTxnID2;
		this.journalTxnPaymentTotal = journalTxnPaymentTotal2;
		journalTxnPaymentCHARGE = journalTxnPaymentCHARGE2;
		journalTxnPaymentCASH = journalTxnPaymentCASH2;
		journalTxnPaymentCOUPON = journalTxnPaymentCOUPON2;
		this.journalTxnPaymentDiscountPCT = journalTxnPaymentDiscountPCT2;
		this.journalTxnPaymentDiscount = journalTxnPaymentDiscount2;
		journalTxnPaymentRounding = journalTxnPaymentRounding2;
	}
}
