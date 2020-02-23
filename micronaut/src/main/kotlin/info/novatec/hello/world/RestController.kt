package info.novatec.hello.world

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class RestController {

    @Get("/")
    fun helloWorld(): HttpResponse<String> {
        return HttpResponse.ok("Hello World!")
    }
}
