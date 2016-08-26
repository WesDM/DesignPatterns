package com.wesdm.designpatterns.facade;

public class FacadeClient {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
}


/* Facade */

class ComputerFacade {
	private static final long BOOT_ADDRESS = 0;
	private static final long BOOT_SECTOR = 0;
	private static final int SECTOR_SIZE = 0;
	private CPU processor;
	private Memory ram;
	private HardDrive hd;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	}
}


/* Complex parts */

class CPU {
	public void freeze() {
	}

	public void jump(long position) {
	}

	public void execute() {
	}
}

class Memory {
	public void load(long position, byte[] data) {
	}
}

class HardDrive {
	public byte[] read(long lba, int size) {
		return new byte[size];
	}
}