package org.acme

import io.quarkus.arc.config.ConfigProperties

@ConfigProperties(prefix = "segments")
class SegmentsConfiguration {
    lateinit var default: String
    lateinit var items: List<SegmentItem>
}

class SegmentItem {
    lateinit var name: String
    lateinit var keywords: List<String>
}
