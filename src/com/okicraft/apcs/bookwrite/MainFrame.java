package com.okicraft.apcs.bookwrite;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by skitt on 5/10/2016.
 */
public class MainFrame extends JFrame  {

    private StoryLine sl = new StoryLine();
    SoundPlayer sp = new SoundPlayer();
    ChoiceListener cl = new ChoiceListener();
    private JButton option1;
    private JButton option2;
    private JButton option3;

 public MainFrame() {

     // Create all the JFrames!
     JFrame frame = new JFrame();
     frame.setSize(550, 600);
     frame.setLayout(new GridLayout());

     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setResizable(false);

     // TextArea code, for the book to be typed into.
     JTextArea book = new JTextArea();
     book.setLineWrap(true);
     book.setSize(550, 50);


     frame.add(book);

     // Size the buttons.
     // Instantiate all of the buttons, with the storyline options on them.
     option1 = new JButton();
     option2 = new JButton();
     option3 = new JButton();

     // Add the EMPTY option buttons to the form itself.
     frame.add(option1);
     frame.add(option2);
     frame.add(option3);


     option1.setSize(500, 50);
     option2.setSize(500, 50);
     option3.setSize(500, 50);

     option1.setHorizontalAlignment(frame.getWidth() / 2);
     option2.setHorizontalAlignment(frame.getWidth() / 2);
     option3.setHorizontalAlignment(frame.getWidth() / 2);

     option1.setVerticalAlignment();
     option2.setVerticalAlignment();
     option3.setVerticalAlignment();

     typeString(sl.getIntro(), book); // Pass in the intro and the text area

 }
    // This method types out your book like it was actually being typed.
    public void typeString(String str, JTextArea book)
    {
            int charNum = 0; // Char count before new line break.
        for( int x = 0; x < str.length(); x++ ) {
            book.append(str.substring(x, x + 1));
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void setupButtons( JFrame frame ) {
        // Instantiate all of the buttons, with the storyline options on them.
        this.option1 = new JButton();
        this.option2 = new JButton();
        this.option3 = new JButton();

        this.option1.setSize(50, 600);
        this.option2.setSize(50, 600);
        this.option3.setSize(50, 600);

        this.option1.setHorizontalAlignment( frame.getWidth() / 2 );
        this.option2.setHorizontalAlignment( frame.getWidth() / 2 );
        this.option3.setHorizontalAlignment( frame.getWidth() / 2 );

        this.option1.setVerticalAlignment( frame.getHeight() - option1.getHeight() );
        this.option2.setVerticalAlignment( frame.getHeight() - option2.getHeight() );
        this.option3.setVerticalAlignment( frame.getHeight() - option3.getHeight() );

        // Add the EMPTY option buttons to the form itself.
        frame.add( option1 );
        frame.add( option2 );
        frame.add( option3 );

    }

    private void setButtonText( JButton b, String s)
    {

    }

}
