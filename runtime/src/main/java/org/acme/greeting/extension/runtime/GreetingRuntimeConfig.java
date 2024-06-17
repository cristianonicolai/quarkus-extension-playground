package org.acme.greeting.extension.runtime;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "org.acme.greeting")
//@ConfigMapping(prefix = "quarkus.greeting") //works
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface GreetingRuntimeConfig {
}
