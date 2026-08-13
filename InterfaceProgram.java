interface playable{
    void play();
    void stop();
}

class AudioFile implements playable{

    public void play(){
        System.out.println("Audio starts playing");
    }

    public void stop(){
        System.out.println("Audio stops playing");
    }

}
class VideoFile implements playable{
    public void play(){
        System.out.println("video starts playing");
    }

    public void stop(){
        System.out.println("Video stops playing");
    }
}

public class InterfaceProgram {
    public static void main(String[] args){
        playable[] plays = {
                new AudioFile(),
                new VideoFile()
        };

        for (playable q : plays){
            q.play();
            q.stop();
        }
    }
}
