package application.model;

import java.math.BigDecimal;

public class Z020 {

	private String z20model;
	private String z20machine;
	private String z20file;
	private String z20mode;
	private String z20zcounter;
	private int z20date;
	private String z20time;
	private BigDecimal GrantTotal;
	private BigDecimal PrevGrandTotal;

	private String z005CreateTableString() {
		return "create table z020 ( " + "z20model varchar," + "z20machine varchar," + "z20file varchar,"
				+ "z20mode varchar," + "z20zcounter varchar," + "z20date integer," + "z20time varchar,"
				+ "GrantTotal varchar," + "PrevGrandTotal integer" + ");";
	}

	private String getZ20model() {
		return z20model;
	}

	private void setZ20model(String z20model) {
		this.z20model = z20model;
	}

	private String getZ20machine() {
		return z20machine;
	}

	private void setZ20machine(String z20machine) {
		this.z20machine = z20machine;
	}

	private String getZ20file() {
		return z20file;
	}

	private void setZ20file(String z20file) {
		this.z20file = z20file;
	}

	private String getZ20mode() {
		return z20mode;
	}

	private void setZ20mode(String z20mode) {
		this.z20mode = z20mode;
	}

	private String getZ20zcounter() {
		return z20zcounter;
	}

	private void setZ20zcounter(String z20zcounter) {
		this.z20zcounter = z20zcounter;
	}

	private int getZ20date() {
		return z20date;
	}

	private void setZ20date(int z20date) {
		this.z20date = z20date;
	}

	private String getZ20time() {
		return z20time;
	}

	private void setZ20time(String z20time) {
		this.z20time = z20time;
	}

	private BigDecimal getGrantTotal() {
		return GrantTotal;
	}

	private void setGrantTotal(BigDecimal grantTotal) {
		GrantTotal = grantTotal;
	}

	private BigDecimal getPrevGrandTotal() {
		return PrevGrandTotal;
	}

	private void setPrevGrandTotal(BigDecimal prevGrandTotal) {
		PrevGrandTotal = prevGrandTotal;
	}
}
