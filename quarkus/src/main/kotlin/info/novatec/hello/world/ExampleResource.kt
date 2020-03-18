package info.novatec.hello.world

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class RestController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello World from Quarkus"
}