package elevator;

public class Request {
	private int toFloor;
	private String move;
	private double time;
	public Request(int toFloor, String move, double time) {//�ȵ���
		super();
		this.time = time;
		this.toFloor = toFloor;
		this.move = move;
	}
	public Request(int toFloor, double time) {//��������
		super();
		this.time = time;
		this.toFloor = toFloor;
	}
	
}
