package geektime.spring.reactor.simple;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

@Slf4j
public class ReactorDemo {
    private static final Logger logger = Logger.getLogger(ReactorDemo.class.getName());
    public static void main(String[] args) {
        Flux<Integer> f = Flux.range(1, 10);
        f.bufferUntil(i -> i % 2 == 0).subscribe(System.out::println);
    }
}
