package org.example.zaurTregulov.lesson5.computer;

public class Computer {
    CPU cpu;
    SSD ssd;
    VideoCard videoCard;
    Ram ram;

    public Computer(CPU cpu, SSD ssd, VideoCard videoCard, Ram ram) {
        this.cpu = cpu;
        this.ssd = ssd;
        this.videoCard = videoCard;
        this.ram = ram;
    }
}
