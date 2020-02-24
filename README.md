# GraalVM Example: Java code calling JavaScript code

This repository contains the code for the GraalVM demo at [https://www.graalvm.org/docs/examples/????].

## Prerequisite Installations
* [asdf](https://github.com/asdf-vm)
* GraalVM plugin for `asdf` (`asdf plugin add graalvm`)

## Preparation

* `Run `asdf install` to install the correct GraalVM (as well as, NodeJS and Java)
Download or clone this repository:
```
git clone git@github.com:potatopankakes/graalvm-java-javascript-example.git
cd graalvm-java-javascript-example
asdf install
```

## Java calling JavaScript
```
javac -d ./target/classes/ src/main/java/net/klymur/examples/java/javascriptembed/*.java
java -cp target/classes net.klymur.examples.java.javascriptembed.JavaScriptEmbedded
```

Key demonstrations in the code:
1. JavaScript variable `driveCount`:
   - Primitive value is injected by the Host language to the JavaScript execution context
2. JavaScript variable `city`:
   - Non-primitive Java Array is injected to the JavaScript execution context
3. JavaScript variable `car`:
   - Non-primitive or non-POJO Java object is injected to the JavaScript execution context
   - `.drive()` is a Java method, and it is being called by JavaScript (2 way communication)
4. JavaScript variable `miles`:
   - Non-primitive complex object retrieved by the Host language after the JavaScript execution
