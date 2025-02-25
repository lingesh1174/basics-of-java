import java.util.Scanner;
interface MediaPlayer{
	void play();
	void pause();
	void stop();
}
class AudioPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Your audio is played");
	}
	public void pause(){
		System.out.println("Your audio is paused");
	}
	public void stop(){
		System.out.println("Your audioplayer is stopped");
	}
}
class VideoPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Your video is played");
	}
	public void pause(){
		System.out.println("Your video is paused");
	}
	public void stop(){
		System.out.println("Your videoplayer is stopped");
	}
}
class StreamingPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Your online streaming is played");
	}
	public void pause(){
		System.out.println("Your online streaming is paused");
	}
	public void stop(){
		System.out.println("Your StreamingPlayer is stopped");
	}
}
public class MediaPlayer_Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("1 for Audio player\n2 for Video Player\n3 for Streaming Player");
		int n=sc.nextInt();
		switch(n){
		case 1:
			loop(1);
			break;
		case 2:
			loop(2);
			break;
		case 3:
			loop(3);
			break;
		default:
			System.out.println("Something went wrong!!!");
		}
	}
	public static void loop(int a){
	    MediaPlayer o;
		if(a==1)
			o=new AudioPlayer();
		else if(a==2)
			o=new VideoPlayer();
		else
			o=new StreamingPlayer();
		System.out.println("1 for play\n2 for pause\n3 for stop");
		while(true){
				int b=sc.nextInt();
				switch(b){
				case 1:
					o.play();
					break;
				case 2:
					o.pause();
					break;
				case 3:
					o.stop();
					System.exit(0);
				default:
					System.out.println("Something went wrong!!!");
					System.exit(0);
				}
			}
	}
}