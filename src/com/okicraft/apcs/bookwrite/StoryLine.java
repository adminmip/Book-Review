package com.okicraft.apcs.bookwrite;

import java.util.List;

/**
 * Created by skitt on 5/10/2016.
 */
public class StoryLine {


    int num = 0;
    private String intro = "The year is 3000.  Famine and disease are rampant on Earth."; // The first line.  Will print every time you run the game.
   private String[] storyList = { "1.  A young man named Xerneas is looking for the man who killed his father. He goes on a journey to ________.",
                        "2. A fifty-five-year-old man, Michael, is fighting for his life, on the run from _____.",
                        "" };
    private String[][] storyLineChoiceSet1 = { /* The array structure is { "Choice", "number to go to IN STRING FORM", "Choice", "Other number" }*/
            {"The police station to file a report about the murder.", "2", "Get retribution for his father’s murder.", "3" , }, // Choice set 1
            {"Wallow in misery, never finding his father’s killer, until he finally dies. The End.", "-1", "Get over it and get on with his life. He starts a family and lives well into his seventies before dying. He never finds his father’s killer.  The End.", "-1"}, // Choice Set 2
            {"No one. He passes a young woman hitchhiking on the side of the road. She claims to have information he might want, but he doesn’t stop; his own journey is the priority.", "4" , "No one. He passes a young woman hitchhiking on the side of the road. She claims to have information he might want, but he doesn’t stop; his own journey is the priority.", "5"}, //  Choice Set 3
            {"Ignores the note, assuming it’s false information--why would he get help now? He searches on his own.", "6", "He goes to the location as a last resort; who knows what could be waiting there? But what does he have left to lose?", "7"},
            {"Does nothing. If she wants to talk, she’ll talk", "8", "Presses her for information. When she doesn’t talk, he threatens her", "8"},
            {"Dies having reached old age, with bitterness still burning in his soul.", "-1", "Contracts the deadly virus that’s been ravaging the world. He infects 63 people before he ultimately dies at the hands of his father’s killer.", "-1"},
            {"Resigns himself to his demise and dies regretting his wasted life.", "-1", "Rips his jacket open to reveal that he’s a suicide bomber. He takes the killer out with him.", "-1"},
            {"Decides that he can’t do this on his own. He goes to the authorities--surely they can help him find his father’s killer.", "2", "Searches for the girl to shamelessly beg her for information", "9"},
            {"Her high school English teacher. That guy once gave her an 89% on a paper--he deserves to die. So she helps kill him.", "-1", "Her father.", "10"},
            {"But Xerneas has to have his revenge.", "11", "And Xerneas realizes the importance of human life and the futility of trying to commit homicide. They ride off into the sunset in their somehow futuristic Prius, singing kumbaya.", "-1"},
            {"And Xerneas decides that to take his revenge, he’ll kill the daughter as well. ", "12", "But there’s no need to involve civilians into his ploy for revenge. He spares the daughter.", "13"},
            {"Xerneas finally gets his revenge.", "-1" , "Xerneas realizes that the violence was pointless and spares the man", "-1"},
            {"Is unprepared for a fight to the death. The brightly burning flame of his life is swiftly and brutally extinguished by the cruel hand of the man who killed his father.", "-1", "Delivers justice to the man who destroyed his life", "-1"}
    };

    // The index on this array is two behind the actual numbers within the story.
    // We're going to subtract two from the number in the above array to get the correct index.
    private String[] storyLineResponseSet1 = {"He files the report, and the police promise that they’ll do their best to find the killer, even though the murder was ten years ago. The man leaves the police station and goes to ______.",
            "Xerneas traverses the country, looking for clues as to the whereabouts of the killer. On his mission, he meets ",
            "For months he searches with little success, until he finally discovers a message with information about his father’s killer. Xerneas",
            "He goes to the location as a last resort; who knows what could be waiting there? But what does he have left to lose?",
            "Xerneas tells Celia about his father’s murder, and she seems sympathetic, as she’s missing her own father. But she also seems reticent… like she’s hiding something. Xerneas",
            "Without help or companionship, Xerneas continues searching in vain for the killer. Finally, he",
            "The information was genuine, but it’s a trap. He stands before his father’s killer. Knowing his fate, Xerneas",
            "Celia never says a word, even when he leaves her behind. Without the information she would have revealed, Xerneas struggles to find a trail that’s long cold. Finally, he",
            "Celia tells him she knows who his father’s killer is. It’s",
            "Celia begs Xerneas not to kill her father, the only person she has left in this world,",
            "She tries to stop him,",
            "With blood on his hands,",
            "After he leaves, Xerneas finds the killer and"};

    private String[][] storyLineChoiceSet2 = {
            {"A young man from his past.", "2", "an unknown threat.", "3"},
            {"but Michael has no idea why Xerneas is trying to kill him.", "4", "and Michael feels immensely guilty about killing the boy’s father.", "5"},
            {"missing.", "6", "right by his side; no one would help them.", "7"},
            {"set up a trap for him.", "7", "give up, because what's the point of living anyway?", "-1"},
            {"but the contronation ends in death.", "8", "suddenly reasonable, Xerneas decides to spare Michael.  The two reconcile their differences and part as the best of friends.", "-1"},
            {"she's dead.", "9", "she ran away.", "10"},
            {"doesn't take the bait.", "11", "takes the bait.", "12"},
            {"Xerneas.", "-1", "Michael.", "-1"},
            {"finds his daughter miracuously alive.", "13", "makes a discovery", "14"},
            {"finds her covered in blood.", "15", "finds her completely uninjured", "16"},
            {"the resort to cannibalism", "17", "they go mad.", "17"},
            {"it ends in violence", "8", "he becomes suddenly reasonable, and the two men reconcile their differences and part as best of friends.", "-1"},
            {"he felt like it.", "18", "the man was infected with the Bloody X virus.", "19"},
            {"kills him, never knowing who he was or why he chased them.", "-1", "realizes that human life is too precious to waste, and abandons his mission", "-1"},
            {"she died of Bloody X, and Michael is now infected.  He dies after holing himself in an attempt to save the rest of humanty from the virus.", "-1", "he knows it was their pursuer.", "14"},
            {"human life is too precious to be wasted.  He live in peace as a monk for the rest of his life.", "-1", "he never liked his daughter anyways.  He kills her.", "-1"},
            {"celia, made by Michael", "-1", "michael, made by Celia", "-1"},
            {"kill him.  He dies in agony.", "-1", "run away and never return.  Michael lives in isolation for the rest of his pitiful life.", "-1"},
            {"decides to turn over a new leaf", "-1", "refuses to listen and kills Michael for his revenge.", ""}
    };



    private String[] storyLineResponseSet2 = {
            "The young man, Xerneas, is one he knows from ten years ago--the night he killed a man with the virus, Bloody X. This is the man’s child that was left behind",
            "Michael sent his daughter, Celia, out to find help, and now she’s",
            "When Xerneas becomes a serious threat to their lives, Michael and Celia decide to",
            "With regret in his heart, Michael calls Xerneas out to explain his actions to the man.",
            "It’s been a few days now, and Michael worries that",
            "The wily duo set up a devious trap for Xerneas, who",
            "The man on the ground, drawing in his final, gasping breaths, is",
            "Michael knows he can’t risk looking for her; she’s certainly dead. So he plots revenge. Eventually, he",
            "Michael goes to search for her; he has to hope she’s alive. After several days, he",
            "Abandoning their trap, Michael and Celia hide out for months until",
            "When Xerneas falls for the trap, ",
            "Celia tells her story, and Michael realizes that the man she met up with, Xerneas, was the child whose father Michael killed ten years ago because",
            "Michael finds the location of their pursuer, and",
            "Celia's dead.  And",
            "It's a miracle his daughter is alive, and it makes him realize that",
            "\"Dinner was lovely,\" the person singsongs.  It was a nice, roast",
            "Michael laughs maniacally and reveals that he has the Bloody X virus.  Celia is forced to",
            "Michael tries to reason with Xerneas and explain what happened.  Xerneas",
            };



    private String[][] storyLineChoiceSet3 = {
            {"MIA. She has to find him.", "2", "Dead.  She has no hope left for the future.", "3"},
            {"tells her to get lost after rambling on about his life, even after she lies about having useful information.", "4", "agrees to help her and tells her of his own search for his father's killer.", "5"},
            {"Kill herself. Life isn't worth living without her father.", "-1", "Make a new life for herself.  She goes to work for the CDC, like her father had before her.  She spends the rest of her life exterminating", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},
            {"", "", "", ""},




    };
    private List<String> yourStory;




    public StoryLine( int num )
    {

        this.num = num;
        if(num == 1)
        {

        }

    }
    public StoryLine()
    {



    }

    public String getIntro()
    {

        return intro;

    }
    /* This will return the SELECTED CHOICE for a plot. */
    public String getStoryLine( int x )
    {

        return storyList[ x - 1 ];  // The passed integer is NOT zero-based, so we need to
                                // "convert" it to be zero-based for the array.

    }


    /* This will return the STARTING LIST of choices for a plot. */
    public String[] getStoryList()
    {


        return storyList;


    }

    public void addToStory(String strToAdd)
    {

        yourStory.add(" " + strToAdd);

    }


}
