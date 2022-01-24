package com.company.certification.retotest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.company.certification.retotest.model.DataTest.obtain;
import static com.company.certification.retotest.userinterface.Your_Next_Destination.PLANET_COLOR;
import static com.company.certification.retotest.util.constant.ConstantManager.PLANET_TAYABAMBA;

public class VerifyExpectedResultAlternate implements Question<Boolean> {

  public static VerifyExpectedResultAlternate inAplication() {
    return new VerifyExpectedResultAlternate();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
      boolean verifyExpectedResult = false;
      String expectedData = obtain("expectedResult");
      String expectedFront = PLANET_COLOR.of(PLANET_TAYABAMBA).resolveFor(actor).getText().trim();
      verifyExpectedResult = expectedFront.equals(expectedData);

      return verifyExpectedResult;
  }

}
