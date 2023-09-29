package org.example.lesson5.computer;

public class ComputerTest {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", 8, 16);
        SSD ssd = new SSD("Samsung", 256.0);
        VideoCard videoCard = new VideoCard("AMD", 2048.0);
        Ram ram = new Ram("Kingston", 16048.0);
        Computer computer = new Computer(cpu,ssd,videoCard,ram);
        System.out.println();
    }
}
