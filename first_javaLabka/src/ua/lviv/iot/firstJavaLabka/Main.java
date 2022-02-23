	package ua.lviv.iot.firstJavaLabka;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("Alfred", 3, 172.1, 2019, "Biotechnologies", true);
		Student st2 = new Student("Nestor", 44, 187.8);
		Student st3 = new Student();
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}

}
