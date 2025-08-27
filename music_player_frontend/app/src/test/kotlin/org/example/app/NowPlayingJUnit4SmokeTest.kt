package org.example.app

import org.junit.Test
import org.junit.Assert.assertEquals

class NowPlayingJUnit4SmokeTest {
    // PUBLIC_INTERFACE
    @Test
    fun smokeTest() {
        /** Minimal JUnit4 smoke test to ensure test discovery succeeds. */
        assertEquals(2, 1 + 1)
    }
}
