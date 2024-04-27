package dev.tests;

import dev.regeorged.UserSteps;
import dev.regeorged.concurrent.ObjectRegistry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcurrentRegistryTests {

    @Test(invocationCount = 68,threadPoolSize = 12)
    void getUniqueUser(){
        var newRandUser = ObjectRegistry.pullRandomOrThrow(UserSteps::getUniqueUser);
        Assert.assertNotNull(newRandUser,"User is null!");
    }
}
