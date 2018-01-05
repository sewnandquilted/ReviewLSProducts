package application.model;

import java.math.BigDecimal;

public class EjLine {

	private String journalTxnDate;
	private String journalTxnTime;
	private BigDecimal journalTxnID;
	private BigDecimal journalTxnLineNumber;
	private BigDecimal journalTxnLineQuantity;
	private BigDecimal journalTxnLineCategory;
	private BigDecimal journalTxnLineAmount;
	private BigDecimal journalTxnLineDiscountPCT;
	private BigDecimal journalTxnLineDiscount;
	private String getJournalTxnDate() {
		return journalTxnDate;
	}
	private void setJournalTxnDate(String journalTxnDate) {
		this.journalTxnDate = journalTxnDate;
	}
	private String getJournalTxnTime() {
		return journalTxnTime;
	}
	private void setJournalTxnTime(String journalTxnTime) {
		this.journalTxnTime = journalTxnTime;
	}
	private BigDecimal getJournalTxnID() {
		return journalTxnID;
	}
	private void setJournalTxnID(BigDecimal journalTxnID) {
		this.journalTxnID = journalTxnID;
	}
	private BigDecimal getJournalTxnLineNumber() {
		return journalTxnLineNumber;
	}
	private void setJournalTxnLineNumber(BigDecimal journalTxnLineNumber) {
		this.journalTxnLineNumber = journalTxnLineNumber;
	}
	private BigDecimal getJournalTxnLineQuantity() {
		return journalTxnLineQuantity;
	}
	private void setJournalTxnLineQuantity(BigDecimal journalTxnLineQuantity) {
		this.journalTxnLineQuantity = journalTxnLineQuantity;
	}
	private BigDecimal getJournalTxnLineCategory() {
		return journalTxnLineCategory;
	}
	private void setJournalTxnLineCategory(BigDecimal journalTxnLineCategory) {
		this.journalTxnLineCategory = journalTxnLineCategory;
	}
	private BigDecimal getJournalTxnLineAmount() {
		return journalTxnLineAmount;
	}
	private void setJournalTxnLineAmount(BigDecimal journalTxnLineAmount) {
		this.journalTxnLineAmount = journalTxnLineAmount;
	}
	private BigDecimal getJournalTxnLineDiscountPCT() {
		return journalTxnLineDiscountPCT;
	}
	private void setJournalTxnLineDiscountPCT(BigDecimal journalTxnLineDiscountPCT) {
		this.journalTxnLineDiscountPCT = journalTxnLineDiscountPCT;
	}
	private BigDecimal getJournalTxnLineDiscount() {
		return journalTxnLineDiscount;
	}
	private void setJournalTxnLineDiscount(BigDecimal journalTxnLineDiscount) {
		this.journalTxnLineDiscount = journalTxnLineDiscount;
	}
	public EjLine(String journalTxnDate, String journalTxnTime, BigDecimal journalTxnID,
			BigDecimal journalTxnLineNumber, BigDecimal journalTxnLineQuantity, BigDecimal journalTxnLineCategory,
			BigDecimal journalTxnLineAmount, BigDecimal journalTxnLineDiscountPCT, BigDecimal journalTxnLineDiscount) {
		super();
		this.journalTxnDate = journalTxnDate;
		this.journalTxnTime = journalTxnTime;
		this.journalTxnID = journalTxnID;
		this.journalTxnLineNumber = journalTxnLineNumber;
		this.journalTxnLineQuantity = journalTxnLineQuantity;
		this.journalTxnLineCategory = journalTxnLineCategory;
		this.journalTxnLineAmount = journalTxnLineAmount;
		this.journalTxnLineDiscountPCT = journalTxnLineDiscountPCT;
		this.journalTxnLineDiscount = journalTxnLineDiscount;
	}

}
