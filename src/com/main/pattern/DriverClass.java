package com.main.pattern;

public class DriverClass {

	public static void main(String[] args) {
		MediaPlayer videoFile = new VideoFile("avi" , "Tutorial1");
		MediaPlayer audioFile = new AudioFile("amr" , "Radio_recording_1");
		MediaPlayer mp3File1 = new Mp3file("Audio" , "Rock_song1");
		MediaPlayer flacFile1 = new Flacfile("Audio" , "Rock_song2");
		MediaPlayer mp4File1 = new Mp4file("Video" , "movie1");
		MediaPlayer mkvFile1 = new Mkvfile("Video" , "movie2");
		videoFile.addfile(mkvFile1);
		videoFile.addfile(mp4File1);
		audioFile.addfile(mp3File1);
		audioFile.addfile(flacFile1);
		videoFile.print();  
		audioFile.print();
	}
}
