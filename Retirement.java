package pkgCore;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;

	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI) {
		super();
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}

	public double MonthlySavings() {
<<<<<<< HEAD
		
		double AmountToSave = pmt;

		// Calculate AmountToSave
		return Math.abs(Math.round(PMT(this.dAnnualReturnWorking / 12, this.iYearsToWork * 12, 0, TotalAmountToSave(), false) * 100.0)) / 100.0; 
	
=======

		//TODO: Calculate AmountToSave
		double pmt = 0; // <-- this should be fixed to calculate the real pmt
		return pmt;
>>>>>>> 3f60a31774454ab9ebdf357ce49fa24d4f096ceb
	}

	public double TotalAmountToSave() {
		
		//TODO: Calculate the Total Amount Requried to save
<<<<<<< HEAD
	
		double pv = 0;
		return Math.abs(Math.round(PV(this.dAnnualReturnRetired / 12, this.iYearsRetired * 12, this.dRequiredIncome - this.dMonthlySSI, 0, false) * 100.0)) / 100.0;
	
	}

	public static double PMT(double r, double n, double p, double f, boolean t) {
		//	r = Rate
		//	n = number of payments
		//	p = present value
		//	f = future value
		//	t = boolean... when interest is calculated... we're going to use FALSE

		return FinanceLib.pmt(r, n, p, f, t);
	}

	public static double PV(double r, double n, double y, double f, boolean t) {
		//	r = Rate.  7% would be expressed as...  0.07 / 12
		//	n = Number of payments.  Five years would be expressed as...  5 * 12...  or 60
		//	y = PMT amount
		//	f = Future value
		//	t = boolean... when interest is calculated... we're going to use FALSE
		double r = .07/12;
		double n = 60;
		double y = 1200;
		double f = 14000;
		boolean t = false;
				
		return FinanceLib.pv(r, n, y, f, t);
=======
		double pv = 0;
		//	Hint: Here's how to round a number: pv = Math.round(pv * 100.0) / 100.0;
		return pv;
>>>>>>> 3f60a31774454ab9ebdf357ce49fa24d4f096ceb
	}

	public static double PMT(double r, double n, double p, double f, boolean t) {
		//	r = Rate
		//	n = number of payments
		//	p = present value
		//	f = future value
		//	t = boolean... when interest is calculated... we're going to use FALSE
		return FinanceLib.pmt(r, n, p, f, t);
	}

	public static double PV(double r, double n, double y, double f, boolean t) {
		//	r = Rate.  7% would be expressed as...  0.07 / 12
		//	n = Number of payments.  Five years would be expressed as...  5 * 12...  or 60
		//	y = PMT amount
		//	f = Future value
		//	t = boolean... when interest is calculated... we're going to use FALSE
		return FinanceLib.pv(r, n, y, f, t);
	}

	public int getiYearsToWork() {
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() {
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() {
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}

	public double getdMonthlySSI() {
		return dMonthlySSI;
	}

	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}
}
