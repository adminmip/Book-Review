package com.okicraft.apcs.bookwrite;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by skitt on 5/10/2016.
 */
public class MainFrame extends JFrame  {


    private JButton option1;
    private JButton option2;


 public MainFrame()
 {

    ChoiceListener cl = new ChoiceListener();
    StoryLine sl = new StoryLine();

     // Create all the JFrames!
     JFrame frame = new JFrame();
     frame.setSize( 600, 600 );
     frame.setLayout( new GridLayout());

     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setVisible(true);

     // TextArea code, for the book to be typed into.
     JTextArea book = new JTextArea();
     frame.add( book );
     typeString( sl.getIntro(), book ); // Pass in the intro and the text area




     this.option1 = new JButton();
     this.option1.setText( "1. " + sl.getStoryLine(1) );

     this.option2 = new JButton();
     this.option2.setText("2. " + sl.getStoryLine(1));


 }

    // This method types out your book like it was actually being typed.
    public void typeString(String str, JTextArea book)
    {

        for( int x = 0; x < str.length(); x++ ) {
                 book.append(str.substring(x, x + 1));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.print(" \n ");
    }


}
