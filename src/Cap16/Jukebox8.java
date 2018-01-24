package Cap16;

import java.io.*;
import java.util.*;

/*
 * 使用Hashset代替ArryList去掉重复值
 * 
 */

public class Jukebox8 {

	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jukebox8().go();
	}
	
	class ArtistCompare implements Comparator<Song>{
		public int compare(Song one, Song two) {
			return one.getArtislt().compareTo(two.getArtislt());
		}
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList); //Colections has sort();
		System.out.println(songList);
		
		TreeSet<Song> songSet = new TreeSet();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
	
	void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				addSong(line);
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
	
	class Song implements Comparable<Song>{
		String title;
		String artist;
		String rating;
		String bpm;
		
		
		//重写equals和hashCode方法
		public boolean equals(Object aSong) {
			Song s = (Song)aSong;
			return title.equals(s.title);
		}
		
		public int hashCode() {
			return title.hashCode();
		}
		
		public int compareTo(Song s) {
			return title.compareTo(s.getTitle());
		}
		
		Song(String t, String a, String r, String b){
			title = t;
			artist = a;
			rating = r;
			bpm = b;
		}
		
		public String getTitle() {
			return title;
		}
		public String getArtislt() {
			return artist;
		}
		public String getRating() {
			return rating;
		}
		public String getBpm() {
			return bpm;
		}
		
		@Override
		public String toString() { //重写了toString方法
			return title;
		}
		
	}

}


















