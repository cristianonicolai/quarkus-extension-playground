package org.acme.greeting.extension.deployment;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "org.acme.greeting")
//@ConfigMapping(prefix = "quarkus.greeting") //works
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface GreetingBuildTimeConfig {

    /**
     * Define event type
     */
    @WithDefault("test")
    String event();

}
