package dev.dorascanner

import kotlin.test.Test
import kotlin.test.assertEquals

class AppInfoTest {
    @Test
    fun appNameIsDoraScanner() {
        assertEquals("DORA Scanner", AppInfo.NAME)
    }
}
