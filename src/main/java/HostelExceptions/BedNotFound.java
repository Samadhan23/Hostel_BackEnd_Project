package HostelExceptions;

public class BedNotFound extends RuntimeException{

	String massage;

	public BedNotFound() {
		super();
	}

	public BedNotFound(String massage) {
		super();
		this.massage = massage;
	}
}

