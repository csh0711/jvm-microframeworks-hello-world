package info.novatec.hello.world

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("info.novatec.hello.world")
                .mainClass(Application.javaClass)
                .start()
    }
}