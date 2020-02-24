package net.klymur.examples.java.javascriptembed;

import java.util.*;
import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

public class JavaScriptEmbedded {
    public static void main(String[] args) {
        try (Context jsContext = Context.newBuilder()
                                   .allowAllAccess(true)
                                   .build()) {
          String script = 
          "const miles = [];" + 
          "for (var i=0; i<driveCount; i++) {" +
          "  const nMiles = car.drive(city[i]);" +
          "  console.log(`Iteration ${i}, city: ${city[i]}, miles: ${nMiles}`);" +
          "  miles.push(nMiles);" +
          "}";

          Value bindings = jsContext.getBindings("js");
          bindings.putMember("driveCount", 3);
          bindings.putMember("car", new Car("Jeff"));
          String[] destinations = {"Yuma", "Tucson", "Flagstaff"};
          bindings.putMember("city", destinations);

          jsContext.eval("js", script);

          TypeLiteral<List<Integer>> list = new TypeLiteral<List<Integer>>() {};
          List<Integer> jsVariable = jsContext.getBindings("js").getMember("miles").as(list);
          for (int mile: jsVariable) {
            System.out.println("miles array item: " + mile);
          }
        }
    }
}
