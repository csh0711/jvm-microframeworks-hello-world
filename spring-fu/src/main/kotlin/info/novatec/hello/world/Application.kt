import org.springframework.fu.kofu.webApplication
import org.springframework.fu.kofu.webmvc.webMvc

val app = webApplication {
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
