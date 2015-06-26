package no.logiq.kotlin

import no.logiq.common.CommonGreeter

public class SpecialisedGreeter(val specialGreet: String) : CommonGreeter() {

    override fun greet(): String {
        return specialGreet
    }
}