package week3vezhbi;

public class Car {
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	Car(){
		tupe="";
		no_seats=0;
		fuel="";
		body_color="";
	}
	Car (String type, int seats, String fuel, String body_color){
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=bodu_color;
	}
	public string getType() {
		return type;
	}
	public void setType (String type) {
		this.type=type;
	}
}
