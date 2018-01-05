package application.model;

import java.math.BigDecimal;

public class Z002 {

	private String z02model;
	private String z02machine;
	private String z02report;
	private String z02file;
	private String z02mode;
	private int z02zcounter;
	private String z02date;
	private String z02time;
	private BigDecimal cashQuantity;
	private BigDecimal subtotalQuantity;
	private BigDecimal chargeQuantity;
	private BigDecimal checkQuantity;
	private BigDecimal helpQuantity;
	private BigDecimal taxpgmQuantity;
	private BigDecimal poQuantity;
	private BigDecimal raQuantity;
	private BigDecimal signoffQuantity;
	private BigDecimal clknoQuantity;
	private BigDecimal shiftnoQuantity;
	private BigDecimal dwnQuantity;
	private BigDecimal pctdiscountQuantity;
	private BigDecimal discountQuantity;
	private BigDecimal pluQuantity;
	private BigDecimal prcQuantity;
	private BigDecimal receiptQuantity;
	private BigDecimal corrQuantity;
	private BigDecimal rfQuantity;
	private BigDecimal openQuantity;
	private BigDecimal rctQuantity;
	private BigDecimal zeroQuantity;
	private BigDecimal dotQuantity;
	private BigDecimal vatQuantity;
	private BigDecimal nsQuantity;
	private BigDecimal couponQuantity;
	private BigDecimal upQuantity;
	private BigDecimal ceQuantity;
	private BigDecimal xQuantity;
	private BigDecimal hashQuantity;
	private BigDecimal nosaleQuantity;
	private BigDecimal voidQuantity;
	private BigDecimal cashAmount;
	private BigDecimal subtotalAmount;
	private BigDecimal chargeAmount;
	private BigDecimal checkAmount;
	private BigDecimal helpAmount;
	private BigDecimal taxpgmAmount;
	private BigDecimal poAmount;
	private BigDecimal raAmount;
	private BigDecimal signoffAmount;
	private BigDecimal clknoAmount;
	private BigDecimal shiftnoAmount;
	private BigDecimal dwnAmount;
	private BigDecimal pctdiscountAmount;
	private BigDecimal discountAmount;
	private BigDecimal pluAmount;
	private BigDecimal prcAmount;
	private BigDecimal receiptAmount;
	private BigDecimal corrAmount;
	private BigDecimal rfAmount;
	private BigDecimal openAmount;
	private BigDecimal rctAmount;
	private BigDecimal zeroAmount;
	private BigDecimal dotAmount;
	private BigDecimal vatAmount;
	private BigDecimal nsAmount;
	private BigDecimal couponAmount;
	private BigDecimal upAmount;
	private BigDecimal ceAmount;
	private BigDecimal xAmount;
	private BigDecimal hashAmount;
	private BigDecimal nosaleAmount;
	private BigDecimal voidAmount;

	private String z002CreateTableString() {
		return "create table z002 ( " + "z02model varchar," + "z02machine varchar," + "z02report varchar,"
				+ "z02file varchar," + "z02mode varchar," + "z02zcounter integer," + "z02date varchar,"
				+ "z02time varchar," + "cashQuantity integer," + "subtotalQuantity integer," + "chargeQuantity integer,"
				+ "checkQuantity integer," + "helpQuantity integer," + "taxpgmQuantity integer," + "poQuantity integer,"
				+ "raQuantity integer," + "signoffQuantity integer," + "clknoQuantity integer,"
				+ "shiftnoQuantity integer," + "dwnQuantity integer," + "pctdiscountQuantity integer,"
				+ "discountQuantity integer," + "pluQuantity integer," + "prcQuantity integer,"
				+ "receiptQuantity integer," + "corrQuantity integer," + "rfQuantity integer," + "openQuantity integer,"
				+ "rctQuantity integer," + "zeroQuantity integer," + "dotQuantity integer," + "vatQuantity integer,"
				+ "nsQuantity integer," + "couponQuantity integer," + "upQuantity integer," + "ceQuantity integer,"
				+ "xQuantity integer," + "hashQuantity integer," + "nosaleQuantity integer," + "voidQuantity integer,"
				+ "cashAmount decimal(10,2)," + "subtotalAmount decimal(10,2)," + "chargeAmount decimal(10,2),"
				+ "checkAmount decimal(10,2)," + "helpAmount decimal(10,2)," + "taxpgmAmount decimal(10,2),"
				+ "poAmount decimal(10,2)," + "raAmount decimal(10,2)," + "signoffAmount decimal(10,2),"
				+ "clknoAmount decimal(10,2)," + "shiftnoAmount decimal(10,2)," + "dwnAmount decimal(10,2),"
				+ "pctdiscountAmount decimal(10,2)," + "discountAmount decimal(10,2)," + "pluAmount decimal(10,2),"
				+ "prcAmount decimal(10,2)," + "receiptAmount decimal(10,2)," + "corrAmount decimal(10,2),"
				+ "rfAmount decimal(10,2)," + "openAmount decimal(10,2)," + "rctAmount decimal(10,2),"
				+ "zeroAmount decimal(10,2)," + "dotAmount decimal(10,2)," + "vatAmount decimal(10,2),"
				+ "nsAmount decimal(10,2)," + "couponAmount decimal(10,2)," + "upAmount decimal(10,2),"
				+ "ceAmount decimal(10,2)," + "xAmount decimal(10,2)," + "hashAmount decimal(10,2),"
				+ "nosaleAmount decimal(10,2)," + "voidAmount decimal(10,2)" + " );";
	}

	private String getZ02model() {
		return z02model;
	}

	private void setZ02model(String z02model) {
		this.z02model = z02model;
	}

	private String getZ02machine() {
		return z02machine;
	}

	private void setZ02machine(String z02machine) {
		this.z02machine = z02machine;
	}

	private String getZ02report() {
		return z02report;
	}

	private void setZ02report(String z02report) {
		this.z02report = z02report;
	}

	private String getZ02file() {
		return z02file;
	}

	private void setZ02file(String z02file) {
		this.z02file = z02file;
	}

	private String getZ02mode() {
		return z02mode;
	}

	private void setZ02mode(String z02mode) {
		this.z02mode = z02mode;
	}

	private int getZ02zcounter() {
		return z02zcounter;
	}

	private void setZ02zcounter(int z02zcounter) {
		this.z02zcounter = z02zcounter;
	}

	private String getZ02date() {
		return z02date;
	}

	private void setZ02date(String z02date) {
		this.z02date = z02date;
	}

	private String getZ02time() {
		return z02time;
	}

	private void setZ02time(String z02time) {
		this.z02time = z02time;
	}

	private BigDecimal getCashQuantity() {
		return cashQuantity;
	}

	private void setCashQuantity(BigDecimal cashQuantity) {
		this.cashQuantity = cashQuantity;
	}

	private BigDecimal getSubtotalQuantity() {
		return subtotalQuantity;
	}

	private void setSubtotalQuantity(BigDecimal subtotalQuantity) {
		this.subtotalQuantity = subtotalQuantity;
	}

	private BigDecimal getChargeQuantity() {
		return chargeQuantity;
	}

	private void setChargeQuantity(BigDecimal chargeQuantity) {
		this.chargeQuantity = chargeQuantity;
	}

	private BigDecimal getCheckQuantity() {
		return checkQuantity;
	}

	private void setCheckQuantity(BigDecimal checkQuantity) {
		this.checkQuantity = checkQuantity;
	}

	private BigDecimal getHelpQuantity() {
		return helpQuantity;
	}

	private void setHelpQuantity(BigDecimal helpQuantity) {
		this.helpQuantity = helpQuantity;
	}

	private BigDecimal getTaxpgmQuantity() {
		return taxpgmQuantity;
	}

	private void setTaxpgmQuantity(BigDecimal taxpgmQuantity) {
		this.taxpgmQuantity = taxpgmQuantity;
	}

	private BigDecimal getPoQuantity() {
		return poQuantity;
	}

	private void setPoQuantity(BigDecimal poQuantity) {
		this.poQuantity = poQuantity;
	}

	private BigDecimal getRaQuantity() {
		return raQuantity;
	}

	private void setRaQuantity(BigDecimal raQuantity) {
		this.raQuantity = raQuantity;
	}

	private BigDecimal getSignoffQuantity() {
		return signoffQuantity;
	}

	private void setSignoffQuantity(BigDecimal signoffQuantity) {
		this.signoffQuantity = signoffQuantity;
	}

	private BigDecimal getClknoQuantity() {
		return clknoQuantity;
	}

	private void setClknoQuantity(BigDecimal clknoQuantity) {
		this.clknoQuantity = clknoQuantity;
	}

	private BigDecimal getShiftnoQuantity() {
		return shiftnoQuantity;
	}

	private void setShiftnoQuantity(BigDecimal shiftnoQuantity) {
		this.shiftnoQuantity = shiftnoQuantity;
	}

	private BigDecimal getDwnQuantity() {
		return dwnQuantity;
	}

	private void setDwnQuantity(BigDecimal dwnQuantity) {
		this.dwnQuantity = dwnQuantity;
	}

	private BigDecimal getPctdiscountQuantity() {
		return pctdiscountQuantity;
	}

	private void setPctdiscountQuantity(BigDecimal pctdiscountQuantity) {
		this.pctdiscountQuantity = pctdiscountQuantity;
	}

	private BigDecimal getDiscountQuantity() {
		return discountQuantity;
	}

	private void setDiscountQuantity(BigDecimal discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	private BigDecimal getPluQuantity() {
		return pluQuantity;
	}

	private void setPluQuantity(BigDecimal pluQuantity) {
		this.pluQuantity = pluQuantity;
	}

	private BigDecimal getPrcQuantity() {
		return prcQuantity;
	}

	private void setPrcQuantity(BigDecimal prcQuantity) {
		this.prcQuantity = prcQuantity;
	}

	private BigDecimal getReceiptQuantity() {
		return receiptQuantity;
	}

	private void setReceiptQuantity(BigDecimal receiptQuantity) {
		this.receiptQuantity = receiptQuantity;
	}

	private BigDecimal getCorrQuantity() {
		return corrQuantity;
	}

	private void setCorrQuantity(BigDecimal corrQuantity) {
		this.corrQuantity = corrQuantity;
	}

	private BigDecimal getRfQuantity() {
		return rfQuantity;
	}

	private void setRfQuantity(BigDecimal rfQuantity) {
		this.rfQuantity = rfQuantity;
	}

	private BigDecimal getOpenQuantity() {
		return openQuantity;
	}

	private void setOpenQuantity(BigDecimal openQuantity) {
		this.openQuantity = openQuantity;
	}

	private BigDecimal getRctQuantity() {
		return rctQuantity;
	}

	private void setRctQuantity(BigDecimal rctQuantity) {
		this.rctQuantity = rctQuantity;
	}

	private BigDecimal getZeroQuantity() {
		return zeroQuantity;
	}

	private void setZeroQuantity(BigDecimal zeroQuantity) {
		this.zeroQuantity = zeroQuantity;
	}

	private BigDecimal getDotQuantity() {
		return dotQuantity;
	}

	private void setDotQuantity(BigDecimal dotQuantity) {
		this.dotQuantity = dotQuantity;
	}

	private BigDecimal getVatQuantity() {
		return vatQuantity;
	}

	private void setVatQuantity(BigDecimal vatQuantity) {
		this.vatQuantity = vatQuantity;
	}

	private BigDecimal getNsQuantity() {
		return nsQuantity;
	}

	private void setNsQuantity(BigDecimal nsQuantity) {
		this.nsQuantity = nsQuantity;
	}

	private BigDecimal getCouponQuantity() {
		return couponQuantity;
	}

	private void setCouponQuantity(BigDecimal couponQuantity) {
		this.couponQuantity = couponQuantity;
	}

	private BigDecimal getUpQuantity() {
		return upQuantity;
	}

	private void setUpQuantity(BigDecimal upQuantity) {
		this.upQuantity = upQuantity;
	}

	private BigDecimal getCeQuantity() {
		return ceQuantity;
	}

	private void setCeQuantity(BigDecimal ceQuantity) {
		this.ceQuantity = ceQuantity;
	}

	private BigDecimal getxQuantity() {
		return xQuantity;
	}

	private void setxQuantity(BigDecimal xQuantity) {
		this.xQuantity = xQuantity;
	}

	private BigDecimal getHashQuantity() {
		return hashQuantity;
	}

	private void setHashQuantity(BigDecimal hashQuantity) {
		this.hashQuantity = hashQuantity;
	}

	private BigDecimal getNosaleQuantity() {
		return nosaleQuantity;
	}

	private void setNosaleQuantity(BigDecimal nosaleQuantity) {
		this.nosaleQuantity = nosaleQuantity;
	}

	private BigDecimal getVoidQuantity() {
		return voidQuantity;
	}

	private void setVoidQuantity(BigDecimal voidQuantity) {
		this.voidQuantity = voidQuantity;
	}

	private BigDecimal getCashAmount() {
		return cashAmount;
	}

	private void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	private BigDecimal getSubtotalAmount() {
		return subtotalAmount;
	}

	private void setSubtotalAmount(BigDecimal subtotalAmount) {
		this.subtotalAmount = subtotalAmount;
	}

	private BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	private void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	private BigDecimal getCheckAmount() {
		return checkAmount;
	}

	private void setCheckAmount(BigDecimal checkAmount) {
		this.checkAmount = checkAmount;
	}

	private BigDecimal getHelpAmount() {
		return helpAmount;
	}

	private void setHelpAmount(BigDecimal helpAmount) {
		this.helpAmount = helpAmount;
	}

	private BigDecimal getTaxpgmAmount() {
		return taxpgmAmount;
	}

	private void setTaxpgmAmount(BigDecimal taxpgmAmount) {
		this.taxpgmAmount = taxpgmAmount;
	}

	private BigDecimal getPoAmount() {
		return poAmount;
	}

	private void setPoAmount(BigDecimal poAmount) {
		this.poAmount = poAmount;
	}

	private BigDecimal getRaAmount() {
		return raAmount;
	}

	private void setRaAmount(BigDecimal raAmount) {
		this.raAmount = raAmount;
	}

	private BigDecimal getSignoffAmount() {
		return signoffAmount;
	}

	private void setSignoffAmount(BigDecimal signoffAmount) {
		this.signoffAmount = signoffAmount;
	}

	private BigDecimal getClknoAmount() {
		return clknoAmount;
	}

	private void setClknoAmount(BigDecimal clknoAmount) {
		this.clknoAmount = clknoAmount;
	}

	private BigDecimal getShiftnoAmount() {
		return shiftnoAmount;
	}

	private void setShiftnoAmount(BigDecimal shiftnoAmount) {
		this.shiftnoAmount = shiftnoAmount;
	}

	private BigDecimal getDwnAmount() {
		return dwnAmount;
	}

	private void setDwnAmount(BigDecimal dwnAmount) {
		this.dwnAmount = dwnAmount;
	}

	private BigDecimal getPctdiscountAmount() {
		return pctdiscountAmount;
	}

	private void setPctdiscountAmount(BigDecimal pctdiscountAmount) {
		this.pctdiscountAmount = pctdiscountAmount;
	}

	private BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	private void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	private BigDecimal getPluAmount() {
		return pluAmount;
	}

	private void setPluAmount(BigDecimal pluAmount) {
		this.pluAmount = pluAmount;
	}

	private BigDecimal getPrcAmount() {
		return prcAmount;
	}

	private void setPrcAmount(BigDecimal prcAmount) {
		this.prcAmount = prcAmount;
	}

	private BigDecimal getReceiptAmount() {
		return receiptAmount;
	}

	private void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	private BigDecimal getCorrAmount() {
		return corrAmount;
	}

	private void setCorrAmount(BigDecimal corrAmount) {
		this.corrAmount = corrAmount;
	}

	private BigDecimal getRfAmount() {
		return rfAmount;
	}

	private void setRfAmount(BigDecimal rfAmount) {
		this.rfAmount = rfAmount;
	}

	private BigDecimal getOpenAmount() {
		return openAmount;
	}

	private void setOpenAmount(BigDecimal openAmount) {
		this.openAmount = openAmount;
	}

	private BigDecimal getRctAmount() {
		return rctAmount;
	}

	private void setRctAmount(BigDecimal rctAmount) {
		this.rctAmount = rctAmount;
	}

	private BigDecimal getZeroAmount() {
		return zeroAmount;
	}

	private void setZeroAmount(BigDecimal zeroAmount) {
		this.zeroAmount = zeroAmount;
	}

	private BigDecimal getDotAmount() {
		return dotAmount;
	}

	private void setDotAmount(BigDecimal dotAmount) {
		this.dotAmount = dotAmount;
	}

	private BigDecimal getVatAmount() {
		return vatAmount;
	}

	private void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}

	private BigDecimal getNsAmount() {
		return nsAmount;
	}

	private void setNsAmount(BigDecimal nsAmount) {
		this.nsAmount = nsAmount;
	}

	private BigDecimal getCouponAmount() {
		return couponAmount;
	}

	private void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	private BigDecimal getUpAmount() {
		return upAmount;
	}

	private void setUpAmount(BigDecimal upAmount) {
		this.upAmount = upAmount;
	}

	private BigDecimal getCeAmount() {
		return ceAmount;
	}

	private void setCeAmount(BigDecimal ceAmount) {
		this.ceAmount = ceAmount;
	}

	private BigDecimal getxAmount() {
		return xAmount;
	}

	private void setxAmount(BigDecimal xAmount) {
		this.xAmount = xAmount;
	}

	private BigDecimal getHashAmount() {
		return hashAmount;
	}

	private void setHashAmount(BigDecimal hashAmount) {
		this.hashAmount = hashAmount;
	}

	private BigDecimal getNosaleAmount() {
		return nosaleAmount;
	}

	private void setNosaleAmount(BigDecimal nosaleAmount) {
		this.nosaleAmount = nosaleAmount;
	}

	private BigDecimal getVoidAmount() {
		return voidAmount;
	}

	private void setVoidAmount(BigDecimal voidAmount) {
		this.voidAmount = voidAmount;
	}
}
