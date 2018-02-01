/**
 * ImportantTweet
 *
 * Date: January 31, 2018
 *
 * Copyright 2018 Team X, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aet on 1/17/18.
 */


import java.security.KeyStore;
import java.util.Date;

/**
 * Represents an important tweet
 *
 * @author Alden Tan
 * @version 1.5
 * @see NormalTweet
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    ImportantTweet(String message){
        super(message);

    }

    ImportantTweet(String message, Date date){
        super(message, date);

    }

    /**
     * Checks whether tweet is important
     *
     * @return indication that the tweet is important
     */
    @Override
    public boolean isImportant(){
        return true;

    }

}
