package com.meet.javam;

public class Text_1 {
	
	public static void main(String[] args) {
		democar();
		demomotocycle();
	}
	static void democar() {
		Car car = new Car();	
		car.setvehicle("���l");
		car.settire(4);
		car.setspeed(80);
        System.out.printf("%s,���L��%d�A�t�׶}%d����\n",car.getvehicle(),car.gettire(),car.getspeed());
        System.out.println("�P�����t���ʦ�:");
        car.radio();
        System.out.print(" ");
        car.Air_conditioning();
        System.out.print("\n\n");

    }
	static void demomotocycle() {
		Motocycle motocycle = new Motocycle();
		motocycle.setvehicle("����");
		motocycle.settire(2);
		motocycle.setspeed(50);
        System.out.printf("%s,���L��%d�A�t�׶}%d����\n",motocycle.getvehicle(),motocycle.gettire(),motocycle.getspeed());
        System.out.println("�P�T���t����:");
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
		System.out.print("������");
	}
	public void Air_conditioning() {
		System.out.print("�N��");
	}
}
class Motocycle extends Role {
	public void helmet() {
		System.out.print("�w���U");
	}
}



