package icehs.science.chapter10.mobile;

public class IPhone extends Mobile{
	private String color;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void charge(int time) {
		System.out.println(super.getProduction() + " : " + time + "분 충전했더니 Full!!");
	}
}
