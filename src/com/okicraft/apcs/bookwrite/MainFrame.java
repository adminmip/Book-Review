package com.okicraft.apcs.bookwrite;

import com.sun.javafx.image.BytePixelSetter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by skitt on 5/10/2016.
 */
public class MainFrame extends JFrame implements MouseListener {

    JTextArea book;
    StoryLine sl = new StoryLine();
    private int storyLine = 0;
    private int tier = 0;
    private JButton option1;
    private JButton option2;
    private JButton option3;
 public MainFrame() {

     // Create all the JFrames!
     JFrame frame = new JFrame();
     frame.setSize(550, 600);
     frame.setLayout(new GridLayout(4, 1));

     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setResizable(false);

     // TextArea code, for the book to be typed into.
     book = new JTextArea();
     book.setLineWrap(true);

     frame.add(book);

     // Size the buttons.
     // Instantiate all of the buttons, with the storyline options on them.
     option1 = new JButton();
     option1.addMouseListener( this );

     option2 = new JButton();
     option2.addMouseListener( this );


     option3 = new JButton();
     option3.addMouseListener( this );

     option1.setText( sl.getStoryLine( 1 ));
     option2.setText( sl.getStoryLine( 2 ));
     option3.setText( sl.getStoryLine( 3 ));

     // Add the EMPTY option
     // buttons to the form itself.
     frame.add(option1);
     frame.add(option2);
     frame.add(option3);

     frame.setVisible( true );
     typeString(sl.getIntro(), book); // Pass in the intro and the text area

 }
    // This method types out your book like it was actually being typed.
    public void typeString(String str, JTextArea book)
    {

        option1.setEnabled( false );
        option2.setEnabled( false );
        option3.setEnabled( false );

            int charNum = 0; // Char count before new line break.
        for( int x = 0; x < str.length(); x++ ) {
            book.append(str.substring(x, x + 1));
                try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        option1.setEnabled( true );
        option2.setEnabled( true );
        option3.setEnabled( true );


    }

    private void setButtonText( JButton b, String s)
    {

    }


    public void makeChoice( JButton b, String choice )
    {

        typeString( choice, book );


    }

    @Override
    public void mouseClicked(MouseEvent e) {

        JButton clicked = (JButton) e.getComponent();
        boolean isStarted = false;
        int clickedNum = -1;

        if( clicked.equals( option1 ) )
        {

            clickedNum = 1;
            if( isStarted == false ) {
                storyLine = 0;
                typeString(sl.getStoryLines(0), book);
                option1.setText(sl.getStoryChoice(0, 1, 1));
                option2.setText(sl.getStoryChoice(0, 1, 3));

            }
            else
            {
                option1.setText(sl.getTier( storyLine, 3, 1));
                option2.setText(sl.getTier( storyLine, 3, 3));
                typeString( sl.getTier( storyLine, tier, clickedNum), book);
            }


        }
        else if( clicked.equals( option2 ) ) {

            clickedNum = 2;
            if ( isStarted == false )
            {
                storyLine = 1;
                typeString(sl.getStoryLines(1), book);
            option1.setText(sl.getStoryChoice(0, 2, 1));
            option2.setText(sl.getStoryChoice(0, 2, 3));
            }
            else
            {

                option1.setText(sl.getTier( storyLine, 3, 1));
                option2.setText(sl.getTier( storyLine, 3, 3));

            }

        }
        else if( clicked.equals( option3 ) ) {

            clickedNum = 3;
        if( isStarted == false ) {
            storyLine = 2;
            typeString(sl.getStoryLines(2), book);
            option1.setText(sl.getStoryChoice(0, 3, 1));
            option2.setText(sl.getStoryChoice(0, 3, 3));
        }
            else
        {

            option1.setText(sl.getTier( storyLine, 3, 1));
            option2.setText(sl.getTier( storyLine, 3, 3));

        }


        }




    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }



}
