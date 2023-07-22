package HostelExceptions;

public class HostelNotFound extends RuntimeException{

	String massage;

	public HostelNotFound() {
		super();
	}

	public HostelNotFound(String massage) {
		super();
		this.massage = massage;
	}
}
