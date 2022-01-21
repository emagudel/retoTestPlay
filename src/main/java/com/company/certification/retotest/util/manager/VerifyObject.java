package com.company.certification.retotest.util.manager;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerifyObject {

    private static final Logger LOGGER = LogManager.getLogger(VerifyObject.class.getName());

    public static boolean elementEnable(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isEnabled();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public static boolean elementVisible(Actor actor, Target target) {
        boolean result = false;
        Exception capturar;
        try {
            result = target.resolveFor(actor).isVisible();
        } catch (Exception e) {
            capturar = e;
        }
        return result;
    }

    public static boolean elementPresent(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isPresent();
        } catch (Exception e) {
            Exception capturar = e;
        }
        return result;

    }

}
