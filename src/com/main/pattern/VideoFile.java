package com.main.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoFile implements MediaPlayer {

	private String fileType;  
	private String format;  
	private String fileName;
	
	public VideoFile( String format, String fileName) {
		this.fileType = "Video";
		this.format = format;
		this.fileName = fileName;
	}

	@Override
	public String getFileType() {
		// TODO Auto-generated method stub
		return fileType;
	}

	@Override
	public String getFormat() {
		// TODO Auto-generated method stub
		return format;
	}


	List<MediaPlayer> mediafiles = new ArrayList<MediaPlayer>();
	
	@Override
	public void addfile(MediaPlayer mediaPlayer) {
		mediafiles.add(mediaPlayer);

	}

	
	@Override
	public MediaPlayer getChild(int i) {
		// TODO Auto-generated method stub
		return mediafiles.get(i);
	}
	
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return fileName;
	}
	@Override
	public void print() {
		 System.out.println("==========================");  
		 System.out.println("FileName ="+getFileName());
	     System.out.println("FileType ="+getFileType());  
	     System.out.println("Format ="+getFormat());  
	     System.out.println("==========================");
	     Iterator<MediaPlayer> it = mediafiles.iterator();  
	     
	     while(it.hasNext())  {  
	    	 MediaPlayer file = it.next();  
	    	 file.print();  
	    }  
 
	}
	 
}
