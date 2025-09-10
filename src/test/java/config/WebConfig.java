package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"

})
public interface WebConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("browser")
    String browser();

    @Key("browser_size")
    String browserSize();

    @Key("browser_version")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();
}


