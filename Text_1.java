package com.meet.javam;

public class Text_1 {
	
	public static void main(String[] args) {
		democar();
		demomotocycle();
	}
	static void democar() {
		Car car = new Car();	
		car.setvehicle("車子");
		car.settire(4);
		car.setspeed(80);
        System.out.printf("%s,輪胎數%d，速度開%d公里\n",car.getvehicle(),car.gettire(),car.getspeed());
        System.out.println("與機車差異性有:");
        car.radio();
        System.out.print(" ");
        car.Air_conditioning();
        System.out.print("\n\n");

    }
	static void demomotocycle() {
		Motocycle motocycle = new Motocycle();
		motocycle.setvehicle("機車");
		motocycle.settire(2);
		motocycle.setspeed(50);
        System.out.printf("%s,輪胎數%d，速度開%d公里\n",motocycle.getvehicle(),motocycle.gettire(),motocycle.getspeed());
        System.out.println("與汽車差異性:");
        motocycle.helmet();
	}
 
}	
class Role {
	
	private int tire;
	private String vehicle; 
	private int speed;
	
	public int gettire() {
		return tire;
	}
	public void settire(int tire) {
		this.tire = tire;
	}
	public String getvehicle() {
		return vehicle;
	}
	public void setvehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
}
class Car extends Role{
	public void radio() {
		System.out.print("收音機");
	}
	public void Air_conditioning() {
		System.out.print("冷氣");
	}
}
class Motocycle extends Role {
	public void helmet() {
		System.out.print("安全帽");
	}
}



