package org.phone;

public class InternalStorage extends ExternalStorage{
private void processorname() {
System.out.println("Snapdragon");
}
private void ram() {
System.out.println("8GB");
}
public static void main(String[] args) {
	InternalStorage i = new InternalStorage();
	i.processorname();
	i.ram();
	i.size();
	
}
}
