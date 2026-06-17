package core;

import com.sun.tools.javac.Main;

import player.*;
import world.*;

public class Management {
    public static String deferredAction = "";
    public static void request(String args, boolean expectation) {
        if (deferredAction.isEmpty()){
            player.movement(deferredAction);
            deferredAction = "";
        }
        if (expectation){
            player.movement(args);
        }else {
            deferredAction = args;
        }
    }
}
