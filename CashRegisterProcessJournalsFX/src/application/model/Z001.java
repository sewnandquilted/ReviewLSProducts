package application.model;

import java.math.BigDecimal;

public class Z001 {

	private String z01model;
	private String z01machine;
	private String z01report;
	private String z01file;
	private String z01mode;
	private int z01zcounter;
	private String z01date;
	private String z01time;
	private BigDecimal grossQuantity;
	private BigDecimal netQuantity;
	private BigDecimal cashindrawQuantity;
	private BigDecimal chidQuantity;
	private BigDecimal ckidQuantity;
	private BigDecimal crid1Quantity;
	private BigDecimal crid2Quantity;
	private BigDecimal crid3Quantity;
	private BigDecimal crid4Quantity;
	private BigDecimal caid2Quantity;
	private BigDecimal chid2Quantity;
	private BigDecimal ckid2Quantity;
	private BigDecimal crid21Quantity;
	private BigDecimal crid22Quantity;
	private BigDecimal crid23Quantity;
	private BigDecimal crid24Quantity;
	private BigDecimal rfQuantity;
	private BigDecimal custQuantity;
	private BigDecimal avrgQuantity;
	private BigDecimal c1Quantity;
	private BigDecimal c2Quantity;
	private BigDecimal ceca1Quantity;
	private BigDecimal ceck1Quantity;
	private BigDecimal ceca2Quantity;
	private BigDecimal ceck2Quantity;
	private BigDecimal dcQuantity;
	private BigDecimal couponQuantity;
	private BigDecimal refundQuantity;
	private BigDecimal round1Quantity;
	private BigDecimal round2Quantity;
	private BigDecimal cancelQuantity;
	private BigDecimal declaQuantity;
	private BigDecimal taxableamtQuantity;
	private BigDecimal gstincludedQuantity;
	private BigDecimal ta2Quantity;
	private BigDecimal tx2Quantity;
	private BigDecimal ta3Quantity;
	private BigDecimal tx3Quantity;
	private BigDecimal ta4Quantity;
	private BigDecimal tx4Quantity;
	private BigDecimal nontaxQuantity;
	private BigDecimal grossAmount;
	private BigDecimal netAmount;
	private BigDecimal cashindrawAmount;
	private BigDecimal chidAmount;
	private BigDecimal ckidAmount;
	private BigDecimal crid1Amount;
	private BigDecimal crid2Amount;
	private BigDecimal crid3Amount;
	private BigDecimal crid4Amount;
	private BigDecimal caid2Amount;
	private BigDecimal chid2Amount;
	private BigDecimal ckid2Amount;
	private BigDecimal crid21Amount;
	private BigDecimal crid22Amount;
	private BigDecimal crid23Amount;
	private BigDecimal crid24Amount;
	private BigDecimal rfAmount;
	private BigDecimal custAmount;
	private BigDecimal avrgAmount;
	private BigDecimal c1Amount;
	private BigDecimal c2Amount;
	private BigDecimal ceca1Amount;
	private BigDecimal ceck1Amount;
	private BigDecimal ceca2Amount;
	private BigDecimal ceck2Amount;
	private BigDecimal dcAmount;
	private BigDecimal couponAmount;
	private BigDecimal refundAmount;
	private BigDecimal round1Amount;
	private BigDecimal round2Amount;
	private BigDecimal cancelAmount;
	private BigDecimal declaAmount;
	private BigDecimal taxableamtAmount;
	private BigDecimal gstincludedAmount;
	private BigDecimal ta2Amount;
	private BigDecimal tx2Amount;
	private BigDecimal ta3Amount;
	private BigDecimal tx3Amount;
	private BigDecimal ta4Amount;
	private BigDecimal tx4Amount;
	private BigDecimal nontaxAmount;

	private String z001CreateTableString() {
		return "create table z001 ( " + "z01model varchar," + "z01machine varchar," + "z01report varchar,"
				+ "z01file varchar," + "z01mode varchar," + "z01zcounter integer," + "z01date varchar,"
				+ "z01time varchar," + "grossQuantity integer," + "netQuantity integer," + "cashindrawQuantity integer,"
				+ "chidQuantity integer," + "ckidQuantity integer," + "crid1Quantity integer,"
				+ "crid2Quantity integer," + "crid3Quantity integer," + "crid4Quantity integer,"
				+ "caid2Quantity integer," + "chid2Quantity integer," + "ckid2Quantity integer,"
				+ "crid21Quantity integer," + "crid22Quantity integer," + "crid23Quantity integer,"
				+ "crid24Quantity integer," + "rfQuantity integer," + "custQuantity integer," + "avrgQuantity integer,"
				+ "c1Quantity integer," + "c2Quantity integer," + "ceca1Quantity integer," + "ceck1Quantity integer,"
				+ "ceca2Quantity integer," + "ceck2Quantity integer," + "dcQuantity integer,"
				+ "couponQuantity integer," + "refundQuantity integer," + "roundQuantity integer,"
				+ "roundQuantity integer," + "cancelQuantity integer," + "declaQuantity integer,"
				+ "taxableamtQuantity integer," + "gstincludedQuantity integer," + "ta2Quantity integer,"
				+ "tx2Quantity integer," + "ta3Quantity integer," + "tx3Quantity integer," + "ta4Quantity integer,"
				+ "tx4Quantity integer," + "nontaxQuantity integer," + "grossAmount decimal(10,2),"
				+ "netAmount decimal(10,2)," + "cashindrawAmount decimal(10,2)," + "chidAmount decimal(10,2),"
				+ "ckidAmount decimal(10,2)," + "crid1Amount decimal(10,2)," + "crid2Amount decimal(10,2),"
				+ "crid3Amount decimal(10,2)," + "crid4Amount decimal(10,2)," + "caid2Amount decimal(10,2),"
				+ "chid2Amount decimal(10,2)," + "ckid2Amount decimal(10,2)," + "crid21Amount decimal(10,2),"
				+ "crid22Amount decimal(10,2)," + "crid23Amount decimal(10,2)," + "crid24Amount decimal(10,2),"
				+ "rfAmount decimal(10,2)," + "custAmount decimal(10,2)," + "avrgAmount decimal(10,2),"
				+ "c1Amount decimal(10,2)," + "c2Amount decimal(10,2)," + "ceca1Amount decimal(10,2),"
				+ "ceck1Amount decimal(10,2)," + "ceca2Amount decimal(10,2)," + "ceck2Amount decimal(10,2),"
				+ "dcAmount decimal(10,2)," + "couponAmount decimal(10,2)," + "refundAmount decimal(10,2),"
				+ "roundAmount decimal(10,2)," + "roundAmount decimal(10,2)," + "cancelAmount decimal(10,2),"
				+ "declaAmount decimal(10,2)," + "taxableamtAmount decimal(10,2)," + "gstincludedAmount decimal(10,2),"
				+ "ta2Amount decimal(10,2)," + "tx2Amount decimal(10,2)," + "ta3Amount decimal(10,2),"
				+ "tx3Amount decimal(10,2)," + "ta4Amount decimal(10,2)," + "tx4Amount decimal(10,2),"
				+ "nontaxAmount decimal(10,2)" + " );";

	}

	private String getZ01model() {
		return z01model;
	}

	private void setZ01model(String z01model) {
		this.z01model = z01model;
	}

	private String getZ01machine() {
		return z01machine;
	}

	private void setZ01machine(String z01machine) {
		this.z01machine = z01machine;
	}

	private String getZ01report() {
		return z01report;
	}

	private void setZ01report(String z01report) {
		this.z01report = z01report;
	}

	private String getZ01file() {
		return z01file;
	}

	private void setZ01file(String z01file) {
		this.z01file = z01file;
	}

	private String getZ01mode() {
		return z01mode;
	}

	private void setZ01mode(String z01mode) {
		this.z01mode = z01mode;
	}

	private int getZ01zcounter() {
		return z01zcounter;
	}

	private void setZ01zcounter(int z01zcounter) {
		this.z01zcounter = z01zcounter;
	}

	private String getZ01date() {
		return z01date;
	}

	private void setZ01date(String z01date) {
		this.z01date = z01date;
	}

	private String getZ01time() {
		return z01time;
	}

	private void setZ01time(String z01time) {
		this.z01time = z01time;
	}

	private BigDecimal getGrossQuantity() {
		return grossQuantity;
	}

	private void setGrossQuantity(BigDecimal grossQuantity) {
		this.grossQuantity = grossQuantity;
	}

	private BigDecimal getNetQuantity() {
		return netQuantity;
	}

	private void setNetQuantity(BigDecimal netQuantity) {
		this.netQuantity = netQuantity;
	}

	private BigDecimal getCashindrawQuantity() {
		return cashindrawQuantity;
	}

	private void setCashindrawQuantity(BigDecimal cashindrawQuantity) {
		this.cashindrawQuantity = cashindrawQuantity;
	}

	private BigDecimal getChidQuantity() {
		return chidQuantity;
	}

	private void setChidQuantity(BigDecimal chidQuantity) {
		this.chidQuantity = chidQuantity;
	}

	private BigDecimal getCkidQuantity() {
		return ckidQuantity;
	}

	private void setCkidQuantity(BigDecimal ckidQuantity) {
		this.ckidQuantity = ckidQuantity;
	}

	private BigDecimal getCrid1Quantity() {
		return crid1Quantity;
	}

	private void setCrid1Quantity(BigDecimal crid1Quantity) {
		this.crid1Quantity = crid1Quantity;
	}

	private BigDecimal getCrid2Quantity() {
		return crid2Quantity;
	}

	private void setCrid2Quantity(BigDecimal crid2Quantity) {
		this.crid2Quantity = crid2Quantity;
	}

	private BigDecimal getCrid3Quantity() {
		return crid3Quantity;
	}

	private void setCrid3Quantity(BigDecimal crid3Quantity) {
		this.crid3Quantity = crid3Quantity;
	}

	private BigDecimal getCrid4Quantity() {
		return crid4Quantity;
	}

	private void setCrid4Quantity(BigDecimal crid4Quantity) {
		this.crid4Quantity = crid4Quantity;
	}

	private BigDecimal getCaid2Quantity() {
		return caid2Quantity;
	}

	private void setCaid2Quantity(BigDecimal caid2Quantity) {
		this.caid2Quantity = caid2Quantity;
	}

	private BigDecimal getChid2Quantity() {
		return chid2Quantity;
	}

	private void setChid2Quantity(BigDecimal chid2Quantity) {
		this.chid2Quantity = chid2Quantity;
	}

	private BigDecimal getCkid2Quantity() {
		return ckid2Quantity;
	}

	private void setCkid2Quantity(BigDecimal ckid2Quantity) {
		this.ckid2Quantity = ckid2Quantity;
	}

	private BigDecimal getCrid21Quantity() {
		return crid21Quantity;
	}

	private void setCrid21Quantity(BigDecimal crid21Quantity) {
		this.crid21Quantity = crid21Quantity;
	}

	private BigDecimal getCrid22Quantity() {
		return crid22Quantity;
	}

	private void setCrid22Quantity(BigDecimal crid22Quantity) {
		this.crid22Quantity = crid22Quantity;
	}

	private BigDecimal getCrid23Quantity() {
		return crid23Quantity;
	}

	private void setCrid23Quantity(BigDecimal crid23Quantity) {
		this.crid23Quantity = crid23Quantity;
	}

	private BigDecimal getCrid24Quantity() {
		return crid24Quantity;
	}

	private void setCrid24Quantity(BigDecimal crid24Quantity) {
		this.crid24Quantity = crid24Quantity;
	}

	private BigDecimal getRfQuantity() {
		return rfQuantity;
	}

	private void setRfQuantity(BigDecimal rfQuantity) {
		this.rfQuantity = rfQuantity;
	}

	private BigDecimal getCustQuantity() {
		return custQuantity;
	}

	private void setCustQuantity(BigDecimal custQuantity) {
		this.custQuantity = custQuantity;
	}

	private BigDecimal getAvrgQuantity() {
		return avrgQuantity;
	}

	private void setAvrgQuantity(BigDecimal avrgQuantity) {
		this.avrgQuantity = avrgQuantity;
	}

	private BigDecimal getC1Quantity() {
		return c1Quantity;
	}

	private void setC1Quantity(BigDecimal c1Quantity) {
		this.c1Quantity = c1Quantity;
	}

	private BigDecimal getC2Quantity() {
		return c2Quantity;
	}

	private void setC2Quantity(BigDecimal c2Quantity) {
		this.c2Quantity = c2Quantity;
	}

	private BigDecimal getCeca1Quantity() {
		return ceca1Quantity;
	}

	private void setCeca1Quantity(BigDecimal ceca1Quantity) {
		this.ceca1Quantity = ceca1Quantity;
	}

	private BigDecimal getCeck1Quantity() {
		return ceck1Quantity;
	}

	private void setCeck1Quantity(BigDecimal ceck1Quantity) {
		this.ceck1Quantity = ceck1Quantity;
	}

	private BigDecimal getCeca2Quantity() {
		return ceca2Quantity;
	}

	private void setCeca2Quantity(BigDecimal ceca2Quantity) {
		this.ceca2Quantity = ceca2Quantity;
	}

	private BigDecimal getCeck2Quantity() {
		return ceck2Quantity;
	}

	private void setCeck2Quantity(BigDecimal ceck2Quantity) {
		this.ceck2Quantity = ceck2Quantity;
	}

	private BigDecimal getDcQuantity() {
		return dcQuantity;
	}

	private void setDcQuantity(BigDecimal dcQuantity) {
		this.dcQuantity = dcQuantity;
	}

	private BigDecimal getCouponQuantity() {
		return couponQuantity;
	}

	private void setCouponQuantity(BigDecimal couponQuantity) {
		this.couponQuantity = couponQuantity;
	}

	private BigDecimal getRefundQuantity() {
		return refundQuantity;
	}

	private void setRefundQuantity(BigDecimal refundQuantity) {
		this.refundQuantity = refundQuantity;
	}

	private BigDecimal getRound1Quantity() {
		return round1Quantity;
	}

	private void setRound1Quantity(BigDecimal round1Quantity) {
		this.round1Quantity = round1Quantity;
	}

	private BigDecimal getRound2Quantity() {
		return round2Quantity;
	}

	private void setRound2Quantity(BigDecimal round2Quantity) {
		this.round2Quantity = round2Quantity;
	}

	private BigDecimal getCancelQuantity() {
		return cancelQuantity;
	}

	private void setCancelQuantity(BigDecimal cancelQuantity) {
		this.cancelQuantity = cancelQuantity;
	}

	private BigDecimal getDeclaQuantity() {
		return declaQuantity;
	}

	private void setDeclaQuantity(BigDecimal declaQuantity) {
		this.declaQuantity = declaQuantity;
	}

	private BigDecimal getTaxableamtQuantity() {
		return taxableamtQuantity;
	}

	private void setTaxableamtQuantity(BigDecimal taxableamtQuantity) {
		this.taxableamtQuantity = taxableamtQuantity;
	}

	private BigDecimal getGstincludedQuantity() {
		return gstincludedQuantity;
	}

	private void setGstincludedQuantity(BigDecimal gstincludedQuantity) {
		this.gstincludedQuantity = gstincludedQuantity;
	}

	private BigDecimal getTa2Quantity() {
		return ta2Quantity;
	}

	private void setTa2Quantity(BigDecimal ta2Quantity) {
		this.ta2Quantity = ta2Quantity;
	}

	private BigDecimal getTx2Quantity() {
		return tx2Quantity;
	}

	private void setTx2Quantity(BigDecimal tx2Quantity) {
		this.tx2Quantity = tx2Quantity;
	}

	private BigDecimal getTa3Quantity() {
		return ta3Quantity;
	}

	private void setTa3Quantity(BigDecimal ta3Quantity) {
		this.ta3Quantity = ta3Quantity;
	}

	private BigDecimal getTx3Quantity() {
		return tx3Quantity;
	}

	private void setTx3Quantity(BigDecimal tx3Quantity) {
		this.tx3Quantity = tx3Quantity;
	}

	private BigDecimal getTa4Quantity() {
		return ta4Quantity;
	}

	private void setTa4Quantity(BigDecimal ta4Quantity) {
		this.ta4Quantity = ta4Quantity;
	}

	private BigDecimal getTx4Quantity() {
		return tx4Quantity;
	}

	private void setTx4Quantity(BigDecimal tx4Quantity) {
		this.tx4Quantity = tx4Quantity;
	}

	private BigDecimal getNontaxQuantity() {
		return nontaxQuantity;
	}

	private void setNontaxQuantity(BigDecimal nontaxQuantity) {
		this.nontaxQuantity = nontaxQuantity;
	}

	private BigDecimal getGrossAmount() {
		return grossAmount;
	}

	private void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
	}

	private BigDecimal getNetAmount() {
		return netAmount;
	}

	private void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	private BigDecimal getCashindrawAmount() {
		return cashindrawAmount;
	}

	private void setCashindrawAmount(BigDecimal cashindrawAmount) {
		this.cashindrawAmount = cashindrawAmount;
	}

	private BigDecimal getChidAmount() {
		return chidAmount;
	}

	private void setChidAmount(BigDecimal chidAmount) {
		this.chidAmount = chidAmount;
	}

	private BigDecimal getCkidAmount() {
		return ckidAmount;
	}

	private void setCkidAmount(BigDecimal ckidAmount) {
		this.ckidAmount = ckidAmount;
	}

	private BigDecimal getCrid1Amount() {
		return crid1Amount;
	}

	private void setCrid1Amount(BigDecimal crid1Amount) {
		this.crid1Amount = crid1Amount;
	}

	private BigDecimal getCrid2Amount() {
		return crid2Amount;
	}

	private void setCrid2Amount(BigDecimal crid2Amount) {
		this.crid2Amount = crid2Amount;
	}

	private BigDecimal getCrid3Amount() {
		return crid3Amount;
	}

	private void setCrid3Amount(BigDecimal crid3Amount) {
		this.crid3Amount = crid3Amount;
	}

	private BigDecimal getCrid4Amount() {
		return crid4Amount;
	}

	private void setCrid4Amount(BigDecimal crid4Amount) {
		this.crid4Amount = crid4Amount;
	}

	private BigDecimal getCaid2Amount() {
		return caid2Amount;
	}

	private void setCaid2Amount(BigDecimal caid2Amount) {
		this.caid2Amount = caid2Amount;
	}

	private BigDecimal getChid2Amount() {
		return chid2Amount;
	}

	private void setChid2Amount(BigDecimal chid2Amount) {
		this.chid2Amount = chid2Amount;
	}

	private BigDecimal getCkid2Amount() {
		return ckid2Amount;
	}

	private void setCkid2Amount(BigDecimal ckid2Amount) {
		this.ckid2Amount = ckid2Amount;
	}

	private BigDecimal getCrid21Amount() {
		return crid21Amount;
	}

	private void setCrid21Amount(BigDecimal crid21Amount) {
		this.crid21Amount = crid21Amount;
	}

	private BigDecimal getCrid22Amount() {
		return crid22Amount;
	}

	private void setCrid22Amount(BigDecimal crid22Amount) {
		this.crid22Amount = crid22Amount;
	}

	private BigDecimal getCrid23Amount() {
		return crid23Amount;
	}

	private void setCrid23Amount(BigDecimal crid23Amount) {
		this.crid23Amount = crid23Amount;
	}

	private BigDecimal getCrid24Amount() {
		return crid24Amount;
	}

	private void setCrid24Amount(BigDecimal crid24Amount) {
		this.crid24Amount = crid24Amount;
	}

	private BigDecimal getRfAmount() {
		return rfAmount;
	}

	private void setRfAmount(BigDecimal rfAmount) {
		this.rfAmount = rfAmount;
	}

	private BigDecimal getCustAmount() {
		return custAmount;
	}

	private void setCustAmount(BigDecimal custAmount) {
		this.custAmount = custAmount;
	}

	private BigDecimal getAvrgAmount() {
		return avrgAmount;
	}

	private void setAvrgAmount(BigDecimal avrgAmount) {
		this.avrgAmount = avrgAmount;
	}

	private BigDecimal getC1Amount() {
		return c1Amount;
	}

	private void setC1Amount(BigDecimal c1Amount) {
		this.c1Amount = c1Amount;
	}

	private BigDecimal getC2Amount() {
		return c2Amount;
	}

	private void setC2Amount(BigDecimal c2Amount) {
		this.c2Amount = c2Amount;
	}

	private BigDecimal getCeca1Amount() {
		return ceca1Amount;
	}

	private void setCeca1Amount(BigDecimal ceca1Amount) {
		this.ceca1Amount = ceca1Amount;
	}

	private BigDecimal getCeck1Amount() {
		return ceck1Amount;
	}

	private void setCeck1Amount(BigDecimal ceck1Amount) {
		this.ceck1Amount = ceck1Amount;
	}

	private BigDecimal getCeca2Amount() {
		return ceca2Amount;
	}

	private void setCeca2Amount(BigDecimal ceca2Amount) {
		this.ceca2Amount = ceca2Amount;
	}

	private BigDecimal getCeck2Amount() {
		return ceck2Amount;
	}

	private void setCeck2Amount(BigDecimal ceck2Amount) {
		this.ceck2Amount = ceck2Amount;
	}

	private BigDecimal getDcAmount() {
		return dcAmount;
	}

	private void setDcAmount(BigDecimal dcAmount) {
		this.dcAmount = dcAmount;
	}

	private BigDecimal getCouponAmount() {
		return couponAmount;
	}

	private void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}

	private BigDecimal getRefundAmount() {
		return refundAmount;
	}

	private void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	private BigDecimal getRound1Amount() {
		return round1Amount;
	}

	private void setRound1Amount(BigDecimal round1Amount) {
		this.round1Amount = round1Amount;
	}

	private BigDecimal getRound2Amount() {
		return round2Amount;
	}

	private void setRound2Amount(BigDecimal round2Amount) {
		this.round2Amount = round2Amount;
	}

	private BigDecimal getCancelAmount() {
		return cancelAmount;
	}

	private void setCancelAmount(BigDecimal cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	private BigDecimal getDeclaAmount() {
		return declaAmount;
	}

	private void setDeclaAmount(BigDecimal declaAmount) {
		this.declaAmount = declaAmount;
	}

	private BigDecimal getTaxableamtAmount() {
		return taxableamtAmount;
	}

	private void setTaxableamtAmount(BigDecimal taxableamtAmount) {
		this.taxableamtAmount = taxableamtAmount;
	}

	private BigDecimal getGstincludedAmount() {
		return gstincludedAmount;
	}

	private void setGstincludedAmount(BigDecimal gstincludedAmount) {
		this.gstincludedAmount = gstincludedAmount;
	}

	private BigDecimal getTa2Amount() {
		return ta2Amount;
	}

	private void setTa2Amount(BigDecimal ta2Amount) {
		this.ta2Amount = ta2Amount;
	}

	private BigDecimal getTx2Amount() {
		return tx2Amount;
	}

	private void setTx2Amount(BigDecimal tx2Amount) {
		this.tx2Amount = tx2Amount;
	}

	private BigDecimal getTa3Amount() {
		return ta3Amount;
	}

	private void setTa3Amount(BigDecimal ta3Amount) {
		this.ta3Amount = ta3Amount;
	}

	private BigDecimal getTx3Amount() {
		return tx3Amount;
	}

	private void setTx3Amount(BigDecimal tx3Amount) {
		this.tx3Amount = tx3Amount;
	}

	private BigDecimal getTa4Amount() {
		return ta4Amount;
	}

	private void setTa4Amount(BigDecimal ta4Amount) {
		this.ta4Amount = ta4Amount;
	}

	private BigDecimal getTx4Amount() {
		return tx4Amount;
	}

	private void setTx4Amount(BigDecimal tx4Amount) {
		this.tx4Amount = tx4Amount;
	}

	private BigDecimal getNontaxAmount() {
		return nontaxAmount;
	}

	private void setNontaxAmount(BigDecimal nontaxAmount) {
		this.nontaxAmount = nontaxAmount;
	}
}
