# GraalVM Example: Java code calling JavaScript code

This repository contains the code for the GraalVM demo at [https://www.graalvm.org/docs/examples/????].

## Prerequisite Installations
* [asdf](https://github.com/asdf-vm)
* GraalVM plugin for `asdf`

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
