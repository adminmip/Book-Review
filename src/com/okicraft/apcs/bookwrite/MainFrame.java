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
    private static final int OPTION_1 = 1;
    private static final int OPTION_2 = 3;
    private JButton option1;
    private JButton option2;
    private JButton option3;
 public MainFrame() {

     // Create all the JFrames!
     JFrame frame = new JFrame();
     frame.setSize(600, 700);
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

    public void makeChoice( JButton btn, String choice )
    {

        typeString( choice, book );

        btn.setText( sl.getStoryChoice( storyLine, tier, OPTION_1 ));
        btn.setText( sl.getStoryChoice( storyLine, tier, OPTION_2 ));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        JButton clicked = (JButton) e.getComponent();
        boolean isStarted = false;
        int clickedNum = -1;
        int choiceOne = 1;
        int choiceTwo = 3;

        if( clicked.equals( option1 ) )
        {

            clickedNum = 1;
            if( isStarted == false ) {
                storyLine = 1;
                typeString(sl.getStoryLines(0), book);
                option1.setText(sl.getTier( storyLine, 0, choiceOne));
                option1.setText(sl.getTier( storyLine, 0, choiceTwo));
                isStarted = true;
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
                storyLine = 2;
                makeChoice( option1, sl.getTier( storyLine, tier, OPTION_1));
                makeChoice( option2, sl.getTier( storyLine, tier, OPTION_2));


            isStarted = true;

            }
            else
            {

                option1.setText(sl.getTier( storyLine, 3, OPTION_1 - 1));
                option2.setText(sl.getTier( storyLine, 3, OPTION_2 - 1));
            }

        }
        else if( clicked.equals( option3 ) ) {

            clickedNum = 3;
        if( isStarted == false ) {
            storyLine = 3;
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
        option1.updateUI();
        option2.updateUI();



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
