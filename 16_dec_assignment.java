1)package Assignment_17_12_21;

class room {
	private int roomNo;
	private String roomType, roomArea;
	private boolean acMachine;

	room() {
		// TODO Auto-generated constructor stub
	}

	room(int roomNo, String roomType, String roomArea, boolean acMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public boolean isAcMachine() {
		return acMachine;
	}

	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}

	void displayData() {
		System.out.println("The room is: " + getRoomNo());
		System.out.println("The type is: " + getRoomType());
		System.out.println("The area is: " + getRoomArea());

		String s = (acMachine) ? "yes" : "No";
		System.out.println("the ac machine is: " + s);

	}

	public static void main(String[] args) {
		room r1 = new room();
		r1.setRoomNo(1);
		r1.setRoomType("large");
		r1.setRoomArea("double type");
		r1.setAcMachine(true);

		r1.displayData();
	}

}
output
The room is: 1
The type is: large
The area is: double type
the ac machine is: yes

2)package Assignment_17_12_21;

public class RefrenceTest {
int a,b;
RefrenceTest(int i, int j)
{
	a=i;
	b=j;
}
/*pass an object*/
void main(RefrenceTest o)
{
	o.a=o.a*2;
	o.b=o.b/2;
}
}
package Assignment_17_12_21;

public class ClassByRefrence
{
	public static void main(String[]srgs)
	{
		RefrenceTest obj = new RefrenceTest(150, 200);
int a =150,b=200;
System.out.println("The value of obj.a and obj.b before call :");
System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);

obj.main(obj);

System.out.println("\nThe value of obj.a and obj.b after call : ");
System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);

}
}

The value of obj.a and obj.b before call :
obj.a = 150	 obj.b = 200

The value of obj.a and obj.b after call : 
obj.a = 300	 obj.b = 100

3)package Assignment_17_12_21;

public class ClassByValue {
int data = 48;
	void change(ClassByValue op) {
		op.data = op.data+100;
		//changes will be instance variable
	}
public static void main(String[]args) {
	ClassByValue op = new ClassByValue();
	System.out.println("before change"+op.data);
	op.change(op);
	//passing object
	System.out.println("after change"+op.data);
}

}

output
before change48
after change148

4)package Assignment_17_12_21;

public class SimpleObject {
	SimpleObject() {
		System.out.println("No argument Constructor");
	}

	SimpleObject(int a) {
		System.out.println("One argument Constructor");
	}

	public static void main(String[] args) {
		new SimpleObject();
		new SimpleObject(200);
	}
}

output
No argument Constructor
One argument Constructor

5)package Assignment_17_12_21;

public class ThisOperator {
	int rollno;  
	String name;  
	float fee;  
	ThisOperator(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
		} 
	  
	  
	  
	public static void main(String args[]){  
		ThisOperator s1=new ThisOperator(212,"akshu",8000f);  
		ThisOperator s2=new ThisOperator(111,"maddy",9000f);  
	s1.display();  
	s2.display();  
	}
	}

output
212 akshu 8000.0
111 maddy 9000.0

