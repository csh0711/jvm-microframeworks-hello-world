package info.novatec.ratpack;

import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

public class Main {
    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> server
                .serverConfig(ServerConfig.embedded().port(8080))
                .handlers(chain -> chain
                        .get("hello",
                                ctx -> ctx.render("Hello World!")
                        )
                )
        );
    }
}
