package bikeseoul.domain;

public class Rent {
	private int rentalnum;
	private int returnnum;
	
	public Rent() {}
	
	public Rent(int rentalnum, int returnnum) {
		super();

		this.rentalnum = rentalnum;
		this.returnnum = returnnum;
	}


	public int getRentalnum() {
		return rentalnum;
	}
	public void setRentalnum(int rentalnum) {
		this.rentalnum = rentalnum;
	}
	public int getReturnnum() {
		return returnnum;
	}
	public void setReturnnum(int returnnum) {
		this.returnnum = returnnum;
	}
	@Override
	public String toString() {
		return "�뿩 Ƚ��=" + rentalnum + ", �ݳ� Ƚ��=" + returnnum;
	}
	
	
}
