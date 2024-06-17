package org.acme.greeting.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.Produce;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.pkg.builditem.ArtifactResultBuildItem;

class GreetingExtensionProcessor {

    private static final String FEATURE = "greeting-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    @Produce(ArtifactResultBuildItem.class)
    void doSomething(GreetingBuildTimeConfig config){
        System.out.println("config = " + config);
    }
}
