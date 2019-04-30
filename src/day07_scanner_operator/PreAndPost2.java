package day07_scanner_operator;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++;//11
		++messages;//12
		System.out.println("Messages: " + messages);
		
		
		int readMessages = --messages;
		System.out.println("read messages: " +readMessages );
		System.out.println("Messages " + messages);
		
		int unreadMessages = readMessages--;
		System.out.println("unread messages: " + unreadMessages);
		System.out.println("read messages: " +readMessages);
		
		int total = unreadMessages++ - readMessages--;
		System.out.println("unread messages: " + unreadMessages);//12
		System.out.println("read messages: " +readMessages);//9
		System.out.println("total: " + total);//1
		
		int count=20;
		int count2 = 10;
		
		int totalCount = ++count + --count2;
		System.out.println("count: " + count);
		System.out.println("count2: "+ count2);
		System.out.println("total count: " + totalCount);
		
		int myCount = count++ + ++count;
		System.out.println("my count: " + myCount);
	}

}
