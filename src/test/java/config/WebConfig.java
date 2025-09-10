package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:local.properties",
        "classpath:${env}.properties"
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
