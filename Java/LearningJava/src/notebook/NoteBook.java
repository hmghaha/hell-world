package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<>();
	
	public void add(String s) {
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
	}
	
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		String[] a = new String[notes.size()];
		notes.toArray(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] a = new String[2];
//		a
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third", 1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
	}

}
