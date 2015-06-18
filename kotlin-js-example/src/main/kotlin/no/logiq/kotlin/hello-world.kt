package no.logiq.kotlin

import kotlin.browser.document


public class HelloWorld {

}

fun main(vararg args: String) {

    println("JavaScript generated through Kotlin");

    document.getElementById("insert-here")!!.textContent = "I was here";
    //sayHelloViaDom()
    //sayHelloViaInlinedJavaScript()
}