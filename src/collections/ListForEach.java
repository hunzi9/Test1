package collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListForEach {
    class myConsumer implements Consumer<Object>{


        @Override
        public void accept(Object o) {
            System.out.println("Processing...");
        }
    }

    public static void main(String[] args) {
        List<String> stocks = new ArrayList<>();
        stocks.add("Alibaba");
        stocks.add("Mi");
        stocks.add("Tecent");
        stocks.add("Maotai");

        Consumer<Object> consumer = new ListForEach().new myConsumer();

        stocks.forEach(consumer);
        stocks.forEach(x -> System.out.println(" processed " + x));
    }
}