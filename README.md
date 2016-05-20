# Book-Review
APCS Final Project
# Book-Review
# APCS Final Project - Incomplete :(

This is my AP Computer Science final project for the 2015-2016 school year.


The concept was simple:  Write your own adventure, get reviewed on it.
It turned out to be more complex in practice than that.

The team I was in consisted of:
- Sarah Henderson ( the main writer, including reviews)
- Kaitlyn Stephens (I have to be honest here, she didn't do much that I can tell)
    - Looks like she spent most of her time doing graphics work for something never used, or just something random.
- Keona Lee (The other writer, also including reviews)


This project was pretty ambitious for the time we had, but I at least was able to get runnable app...

The class structure is as follows:

BookWrite.java - the main class, has main method and instantiates MainFrame.
MainFrame.java - Most of my time was spent here figuring out the JButton word wrap and 
                 that kind of bunch of little things.
StoryLine.java - All options, responses, and "go-to" statements are kept here.  
  - The choices were kept in 2D arrays.  The structure was this:
    public String[][] genericChoices = {
    { "Option One", [goto this number statement], "Option 2", [go to this statement] },
    { repeat }
    };
    
    There are two largely unused and deprecated classes; they are SoundPlayer and ChoiceListener.
    - I didn't have time for implementing SoundPlayer. 
    - ChoiceListener was an unneccesary iteration of development, just wasn't deleted.
    
    I had fun working on this project, even though it was incomplete...
    Thank you!
    
    Eric Postel
    
    
    
    
