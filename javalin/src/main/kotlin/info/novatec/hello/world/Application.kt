package info.novatec.hello.world

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path

fun main() {
    val app = Javalin.create().start(8080)

    app.routes {
        path("/hello") {
            get("/") { ctx ->
                ctx.result("Hello World!")
            }
        }
    }
}
