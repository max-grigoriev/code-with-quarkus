package org.acme

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-resteasy")
class GreetingResource(private val conf: SegmentsConfiguration) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "${conf.default}  ${conf.items.first().name}"
}