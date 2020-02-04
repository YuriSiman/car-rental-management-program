package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;
	
	private Vehicle vihicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finish, Vehicle vihicle) {
		this.start = start;
		this.finish = finish;
		this.vihicle = vihicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVihicle() {
		return vihicle;
	}

	public void setVihicle(Vehicle vihicle) {
		this.vihicle = vihicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	
}
