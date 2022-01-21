        package com.company.certification.retotest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features={
                "src/test/resources/features"
        },
        glue = { "com.company.certification.retotest.stepdefinitions" },
        snippets = SnippetType.CAMELCASE)

public class GeneralTestRunner {}
