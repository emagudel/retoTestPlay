package com.company.certification.retotest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Locale;

import static com.company.certification.retotest.model.DataTest.obtain;
import static com.company.certification.retotest.userinterface.Your_Next_Destination.PLANET_COLOR;
import static com.company.certification.retotest.util.constant.ConstantManager.PLANET_TAYABAMBA;


public class VerifyExpectedResult implements Question<Boolean> {

    public static VerifyExpectedResult inAplication() {
        return new VerifyExpectedResult();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean verifyExpectedResult = false;
        String expectedData = PLANET_TAYABAMBA;
        String expectedFront = PLANET_COLOR.of(obtain("expectedResult")).resolveFor(actor).getText().trim();
        verifyExpectedResult = expectedFront.equals(expectedData);

        return verifyExpectedResult;
    }

}
