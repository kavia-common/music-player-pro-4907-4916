package org.example.app;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DiscoveryCompatibilityTest {
    // PUBLIC_INTERFACE
    @Test
    public void ensuresDiscoveryViaJUnit4() {
        /** Minimal JUnit4-compatible test to ensure Gradle test discovery succeeds in CI. */
        assertTrue(true);
    }
}
