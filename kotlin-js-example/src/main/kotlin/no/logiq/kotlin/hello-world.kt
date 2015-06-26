package no.logiq.kotlin

import no.logiq.common.CommonGreeter
import kotlin.browser.document


fun main(vararg args: String) {

    println("JavaScript generated through Kotlin");

    val commonGreeter = CommonGreeter()
    val specializedGreeter = SpecialisedGreeter("test");
    document.getElementById("insert-here")!!.textContent =
            "commonGreeter greets: ${commonGreeter}, specializedGreeter greets: ${specializedGreeter.greet()}";
}