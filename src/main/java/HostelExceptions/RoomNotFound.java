package HostelExceptions;

public class RoomNotFound extends RuntimeException{

	String massage;

	public RoomNotFound() {
		super();
	}

	public RoomNotFound(String massage) {
		super();
		this.massage = massage;
	}
}
