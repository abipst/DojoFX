package com.test;
import com.intuit.karate.junit5.Karate;

public class UserTest extends BaseKarateTest {
    
    @Karate.Test
    Karate testUsers() {
        return super.runTest().tags("@users").relativeTo(getClass());
    }
}
