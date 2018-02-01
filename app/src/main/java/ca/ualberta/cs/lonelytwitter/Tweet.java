/**
 * Tweet
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

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Alden Tan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    Tweet(){

    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object with date
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets date of tweet
     *
     * @return date of tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Gets message of tweet
     *
     * @return message of tweet
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException thrown if the tweet exceeds 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 160){
            //Throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets the date
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Checks whether a tweet is important or not
     *
     * @return indication whether a tweet is important
     */
    public abstract boolean isImportant();

    /**
     * Converts tweet to string
     *
     * @return tweet message as string
     */
    @Override
    public String toString(){
        return message;

    }
}
