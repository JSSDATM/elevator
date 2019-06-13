package elevator;

public class Request {
	private int toFloor;
	private String move;
	private double time;
	public Request(int toFloor, String move, double time) {//等电梯
		super();
		this.time = time;
		this.toFloor = toFloor;
		this.move = move;
	}
	public Request(int toFloor, double time) {//电梯里面
		super();
		this.time = time;
		this.toFloor = toFloor;
	}
	
}
