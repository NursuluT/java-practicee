package day49_inheritance02;

public class AudioBook extends Book {
    
	private int length;
	private String narrator;
	
	
	public void listen() {
		//Listening to java book by savitch
		System.out.println("Listening "+getTitle()+" by "+getAuthor() +" and narrated by "+getNarrator());
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
}
