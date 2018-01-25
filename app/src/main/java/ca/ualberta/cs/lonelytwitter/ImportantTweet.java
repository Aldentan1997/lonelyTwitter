package ca.ualberta.cs.lonelytwitter;

/**
 * Created by aet on 1/17/18.
 */


import java.security.KeyStore;
import java.util.Date;

public class ImportantTweet extends Tweet {

    ImportantTweet(String message){
        super(message);

    }

    ImportantTweet(String message, Date date){
        super(message, date);

    }



    @Override
    public boolean isImportant(){
        return true;

    }

}
