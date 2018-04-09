import javax.sound.midi.*;

public class MiniMusicApp {
    public static void main(String[] args) {

        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
        System.out.println("this is the end of main");
    }

    private void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
//            System.out.println("\nit did");
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

//            ShortMessage first = new ShortMessage();
//            first.setMessage(192, 1, 102, 0);
//            MidiEvent change = new MidiEvent(first, 1);
//            track.add(change);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 6, 44, 125);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 6, 44, 125);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
//            player.close(); /*This doesnt work! But I know why...*/

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("it gets here");
    }
}
