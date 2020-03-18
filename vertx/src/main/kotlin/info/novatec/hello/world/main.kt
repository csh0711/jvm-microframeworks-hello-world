package info.novatec.hello.world

import io.vertx.core.Vertx

fun main() {
  val vertx = Vertx.vertx()
  vertx.deployVerticle("info.novatec.hello.world.MainVerticle")
}
