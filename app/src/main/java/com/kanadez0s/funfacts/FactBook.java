package com.kanadez0s.funfacts;

import java.util.Random;

/**
 * Created by Demetre on 2017-11-03.
 */

public class FactBook {
    //Fields or Member Variables - Properties about the object
    private String[] facts = {"Luck is what happens when preparation meets opportunity.",
            "All cruelty springs from weakness.",
            "Religion is regarded by the common people as true, by the wise as false, and by rulers as useful.",
            "Difficulties strengthen the mind, as labor does the body.",
            "There is no easy way from the earth to the stars",
            "As is a tale, so is life: not how long it is, but how good it is, is what matters.",
            "Hang on to your youthful enthusiasms -- you’ll be able to use them better when you’re older.",
            "It is the power of the mind to be unconquerable.",
            "You act like mortals in all that you fear, and like immortals in all that you desire",
            "If a man knows not to which port he sails, no wind is favorable.",
            "We suffer more often in imagination than in reality",
            "Begin at once to live, and count each separate day as a separate life.",
            "It is not the man who has too little, but the man who craves more, that is poor.",
            "They lose the day in expectation of the night, and the night in fear of the dawn.",
            "He suffers more than necessary, who suffers before it is necessary.",
            "Only time can heal what reason cannot.",
            "Ignorance is the cause of fear.",
            "Most powerful is he who has himself in his own power.",
            "Life is like a play: it's not the length, but the excellence of the acting that matters."};


    //Methods - Actions the Object takes
    public String getFact(){

        //The button was clicked, so update the fact TextView with a new fact
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    };
}
