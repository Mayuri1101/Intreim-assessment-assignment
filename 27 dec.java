1.Grade Display
import java.util.Scanner;

public class GradesDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int grade = sc.nextInt();

		if (grade >= 90) {
			System.out.println("Grade is: A+");
		} else if (grade >= 80) {
			System.out.println("Grade is: A");
		} else if (grade >= 70) {
			System.out.println("Grade is: B+");
		} else if (grade >= 60) {
			System.out.println("Grade is: B");
		} else if (grade >= 50) {
			System.out.println("Grade is: C");
		} else if (grade >= 40) {
			System.out.println("Grade is: D");
		} else if (grade >= 30) {
			System.out.println("Grade is: F");
		}
	}
}

Output:
Enter grade: 
54
Grade is: C

2.Create Class Book with name, isbn and auther
public class Book {
	String name;
	String author;
	String isbn;

	public Book() {
		name = "Good Daddy Bad Daddy";
		author = "Robart";
		isbn = "963";
	}

	public Book(String name1, String author1, String ISBN) {
		name1 = name;
		author1 = author;
		ISBN = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void getBookInfo() {
		System.out.printf(name + "\n");
		System.out.printf(author + "\n");
		System.out.printf(isbn + "\n");

	}

	public static void main(String[] args) {
		Book test[] = new Book[13];
		test[1] = new Book();
		test[1].getBookInfo();
	}

}

Output:
Good Daddy Bad Daddy
Robart
963

3.BalancedBracket
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
	static boolean BalancedBrackets(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		String expr = "([{}])";

		if (BalancedBrackets(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}

Output:
Balanced

4.Coin
public class Coin {
	static int minCoins(int coins[], int m, int v) {
		if (v == 0)
			return 0;

		int res = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			if (coins[i] <= v) {
				int sub_res = minCoins(coins, m, v - coins[i]);

				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
					res = sub_res + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int coins[] = { 9, 6, 5, 1 };
		int m = coins.length;
		int v = 11;
		System.out.println("Min coins is: " + minCoins(coins, m, v));

	}

}

Output:
Min coins is: 2

5.Delete Alternate Node
public class DeleteAlternateNodes {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteAlt() {
		if (head == null)
			return;

		Node prev = head;
		Node now = head.next;

		while (prev != null && now != null) {
			prev.next = now.next;
			now = null;

			prev = prev.next;
			if (prev != null)
				now = prev.next;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		DeleteAlternateNodes Llist = new DeleteAlternateNodes();

		Llist.push(5);
		Llist.push(4);
		Llist.push(3);
		Llist.push(2);
		Llist.push(1);

		System.out.println("linked list before: ");
		Llist.printList();

		Llist.deleteAlt();

		System.out.println("Linked list after delete: ");
		Llist.printList();
	}

}

Output:
linked list before: 
1 
2 
3 
4 
5 

Linked list after delete: 
1 
3 
5 