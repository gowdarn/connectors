package io.syndesis.connector.jms.springboot;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Generated("org.apache.camel.maven.connector.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "activemq-publish-bytes")
public class ActiveMQPublishBytesConnectorConfiguration
        extends
            ActiveMQPublishBytesConnectorConfigurationCommon {

    /**
     * Define additional configuration definitions
     */
    private Map<String, ActiveMQPublishBytesConnectorConfigurationCommon> configurations = new HashMap<>();

    public Map<String, ActiveMQPublishBytesConnectorConfigurationCommon> getConfigurations() {
        return configurations;
    }
}