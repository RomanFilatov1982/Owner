package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:local.properties",
        "classpath:${env}.properties"
})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browser_size")
    @DefaultValue("1440x900")
    String browserSize();

    @Key("browser_version")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();

}
