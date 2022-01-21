package com.company.certification.retotest.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.retotest.model.DataTest.obtain;
import static com.company.certification.retotest.userinterface.Space_Beyond_Page.SELECT_DESTINATION;
import static com.company.certification.retotest.userinterface.Your_Next_Destination.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DestinationNext implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_NEXT_DESTINATION, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(LOAD_MORE),
                Click.on(LOAD_MORE),
                Scroll.to(LABEL_NEXT_DESTINATION),
                Scroll.to(PLANET_COLOR.of((obtain("expectedResult"))))
        );
    }

    public static DestinationNext inTheAplication() {
        return instrumented(DestinationNext.class);
    }
}
