package com.devdeolho.hexagonal.architecture
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes

@AnalyzeClasses(packages = ["com.devdeolho.hexagonal"])
class NamingConventionTest {

    @ArchTest
    val `consumer reside only consumer package` = classes()
        .that()
        .haveNameMatching(".*Consumer")
        .should()
        .resideInAPackage("..adapters.input.consumer")
        .`as`("Consumer classes should reside inside consumer package in adapters.input package")

    @ArchTest
    val `response reside only response package` = classes()
        .that()
        .haveNameMatching(".*Response")
        .should()
        .resideInAnyPackage("..adapters.input.controller.response", "..adapters.output.client.response")
        .`as`("Response classes should reside inside response package in controller or client packages")

}