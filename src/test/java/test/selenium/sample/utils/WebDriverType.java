package test.selenium.sample.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum WebDriverType {

    FIREFOX("webdriver.gecko.driver", "geckodriver.exe"),
    CHROME("webdriver.chrome.driver", "chromedriver.exe");

    private String systemProperty;
    private String pathToDriver;

}
