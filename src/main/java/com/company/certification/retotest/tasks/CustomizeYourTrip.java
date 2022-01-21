package com.company.certification.retotest.tasks;


import com.company.certification.retotest.interactions.SelectionDayDeparting;
import com.company.certification.retotest.interactions.SelectionDayReturning;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.company.certification.retotest.model.DataTest.obtain;
import static com.company.certification.retotest.userinterface.Space_Beyond_Page.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CustomizeYourTrip implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Integer adults = Integer.valueOf(obtain("adults")) + 1;
        Integer children = Integer.valueOf(obtain("children")) + 1;
        actor.attemptsTo(
                WaitUntil.the(DEPARTING, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(DEPARTING)
        );
        actor.attemptsTo(SelectionDayDeparting.inAplication());
        actor.attemptsTo(
                Click.on(RETURNING)
        );
        actor.attemptsTo(SelectionDayReturning.inAplication());
        actor.attemptsTo(
                Click.on(ADULTS),
                Click.on(ADULTS_LIST.of((adults.toString()))),
                Click.on(CHILDREN),
                Click.on(CHILDREN_LIST.of((children.toString()))),
                Click.on(SELECT_DESTINATION)
        );
    }

    public static CustomizeYourTrip inTheAplication() {
        return instrumented(CustomizeYourTrip.class);
    }
}
