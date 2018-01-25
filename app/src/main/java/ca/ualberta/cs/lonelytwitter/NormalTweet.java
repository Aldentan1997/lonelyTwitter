package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aet on 1/17/18.
 */

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public boolean isImportant(){
        return false;
    }

}
