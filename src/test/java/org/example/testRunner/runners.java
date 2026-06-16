package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {
                        "src/main/resources/features/F01_Register.feature",
                        "src/main/resources/features/F02_Login.feature",
                        "src/main/resources/features/F03_AddToCart.feature"
                },
                glue = "org.example.stepDefs",
                tags = "@regression",
                plugin = {
                        "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"

                }


        )

public class runners extends AbstractTestNGCucumberTests {
}
