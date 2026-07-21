/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act.voting_system_v1;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author mnisi
 */
public class playsong {
    public static void playSound(String song) {
        try {
            File soundFile = new File("C:\\Users\\mnisi\\OneDrive\\Desktop\\Java projects\\mavenproject\\" + song);
            
            if (soundFile.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start(); // Plays the song
                
                // Keep the program running long enough for the song to play
                Thread.sleep(clip.getMicrosecondLength() / 10000);
            } else {
                System.out.println("File not found at: " + soundFile.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

