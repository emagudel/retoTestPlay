package com.company.certification.retotest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.company.certification.retotest.util.constant.ConstantManager.CLASE_INTERFAZ_USUARIO;

public class Your_Next_Destination {



    public static final Target LABEL_NEXT_DESTINATION = Target.the("launch").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[2]/h2"));
    public static final Target LOAD_MORE = Target.the("load more").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[6]/button"));
    public static final Target PLANET_COLOR = Target.the("planet color").locatedBy("//*[@class='theme__title___35Wsy'][text()='{0}']");


    private Your_Next_Destination() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}