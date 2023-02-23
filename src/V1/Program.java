package V1;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        Repository<VideoContent> videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("New film1.wma"));
        videoStorage.add(new VideoContent("New film2.3gp"));

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

//        audioStorage.add(new VideoContent("blablabla.mp4"));
//        videoStorage.add(new AudioContent("track.wav"));

//        Repository<String> stringRepository = new Repository<>("stringRepository");
//        stringRepository.add("Crindg");
//        stringRepository.add("Krash");
//        stringRepository.add("Rofl");
//        stringRepository.add("Kripoviy");
//        stringRepository.add("Lichinus");
//        stringRepository.add("Sheymit");
//        for (int i = 0; i < stringRepository.count(); i++) {
//
//        }

    }
}
