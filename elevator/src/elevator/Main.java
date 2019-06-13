package elevator;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		RequestQueue theQueue=new RequestQueue();
		try {
			while(true) {
				String s=scan.nextLine();
				if(s.equals("RUN")) break;
				char[] ss=s.toCharArray();
				Request t=null;
				int toFloor=0,time=0;
				String move;
				if(ss[1]=='E') {
					Stack<Character> num=new Stack();
					if(ss[5]=='0') {
						toFloor=10;
						for(int i=7;ss[i]!=')';i++) {
							time*=10;
							time+=ss[i]-'0';
						}
						//new Request(10,time);
					}else {
						toFloor=ss[4]-'0';
						for(int i=6;ss[i]!=')';i++) {
							time*=10;
							time+=ss[i]-'0';
						}
					}
					t=new Request(toFloor,time);
				}else if(ss[1]=='F') {
					Stack<Character> num=new Stack();
					if(ss[5]=='0') {
						toFloor=10;
						int index=10;
						if(ss[7]=='D') {
							move="DOWN";
							index+=2;
						}else move="UP";
						for(int i=index;ss[i]!=')';i++) {
							time*=10;
							time+=ss[i]-'0';
						}
						//new Request(10,time);
					}else {
						toFloor=ss[4]-'0';
						int index=9;
						if(ss[6]=='D') {
							move="DOWN";
							index+=2;
						}else move="UP";
						for(int i=index;ss[i]!=')';i++) {
							time*=10;
							time+=ss[i]-'0';
						}
					}
					t=new Request(toFloor,move,time);
				}
				theQueue.add(t);
			}
		}catch(Exception e) {
			
		}
	}
}
