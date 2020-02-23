package info.novatec.hello.world

import org.http4k.core.Method.GET
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.Jetty
import org.http4k.server.asServer


fun main() {

    routes(
        "/hello" bind GET to {
            Response(OK).body("Hello World!")
        }
    ).asServer(Jetty(8080)).start()
}
