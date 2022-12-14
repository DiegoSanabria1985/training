package com.saucedemo.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Interaction {

    private String url;
    protected  OpenBrowser(String url){this.url = url;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static OpenBrowser on (String url){
        return new OpenBrowser(url);
    }
}
