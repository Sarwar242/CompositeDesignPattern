package com.main.pattern;

public interface MediaPlayer {
   public String getFileName(); 
   public String getFileType();  
   public String getFormat(); 
   public void print();  

   public MediaPlayer getChild(int i);
   public void addfile(MediaPlayer mediaPlayer);  
}
