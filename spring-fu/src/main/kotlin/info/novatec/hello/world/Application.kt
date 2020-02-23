import org.springframework.boot.WebApplicationType
import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.webmvc.webMvc

val app = application(WebApplicationType.SERVLET) {

    webMvc {
        port = 8080
        router {
            GET("/hello") {
                ok().body("Hello World!")
            }
        }
    }
}

fun main() {
    app.run()
}
