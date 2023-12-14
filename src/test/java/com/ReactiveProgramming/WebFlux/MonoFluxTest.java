package com.ReactiveProgramming.WebFlux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void monoTest(){
        Mono<String> mono = Mono.just("vamsi").log();
        mono.subscribe(System.out::println);
    }
    @Test
    public void fluxTest(){
        Flux<String> flux = Flux.just("vamsi","chokkapu","sails").concatWithValues("visakha").log();
        flux.concatWithValues("vizag");
        flux.subscribe(System.out::println );
    }
}
