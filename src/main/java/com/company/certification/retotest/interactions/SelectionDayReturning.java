package com.company.certification.retotest.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.company.certification.retotest.model.DataTest.obtain;
import static com.company.certification.retotest.userinterface.Space_Beyond_Page.BUTTON_OK;
import static com.company.certification.retotest.userinterface.Space_Beyond_Page.SELECTION_DAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionDayReturning implements Interaction {

    public static SelectionDayReturning inAplication() {
        return instrumented(SelectionDayReturning.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaValores = SELECTION_DAY.resolveAllFor(actor);
        for (int iterador = 0; iterador < listaValores.size(); iterador++) {
            String datoUI = listaValores.get(iterador).getText();
            String datoReturning = obtain("returning").substring(0,2).trim();
            boolean datoEnable = listaValores.get(iterador).isEnabled();
            if((datoUI.equals(datoReturning) && datoEnable)){
                SELECTION_DAY.resolveAllFor(actor).get(iterador).click();
                BUTTON_OK.resolveFor(actor).click();
                break;
            }
        }
    }
}
