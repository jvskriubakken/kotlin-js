package no.logiq.kotlin

import no.logiq.common.CommonGreeter
import kotlin.browser.document


public class HelloWorld {

}

fun main(vararg args: String) {

    println("JavaScript generated through Kotlin");

    val common = CommonGreeter()
    val task = SpecialisedGreeter("test");
    document.getElementById("insert-here")!!.textContent =
            "I was here: common: ${common}, task: ${task}";

    //sayHelloViaDom()
    //sayHelloViaInlinedJavaScript()
}