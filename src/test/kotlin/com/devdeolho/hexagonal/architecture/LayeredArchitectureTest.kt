package com.devdeolho.hexagonal.architecture

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.library.Architectures.layeredArchitecture

@AnalyzeClasses(packages = ["com.devdeolho.hexagonal"])
class LayeredArchitectureTest {

    @ArchTest
    val `layered architecture test` = layeredArchitecture()
        .consideringAllDependencies()
        .layer("AdaptersInput").definedBy("..adapters.input..")
        .layer("AdaptersOutput").definedBy("..adapters.output..")
        .layer("UseCase").definedBy("..application.core.usecase..")
        .layer("PortsInput").definedBy("..application.ports.input..")
        .layer("PortsOutput").definedBy("..application.ports.output..")
        .layer("Config").definedBy("..config..")
        .whereLayer("AdaptersInput").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("AdaptersOutput").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("UseCase").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("PortsInput").mayOnlyBeAccessedByLayers("UseCase", "AdaptersInput")
        .whereLayer("PortsOutput").mayOnlyBeAccessedByLayers("UseCase", "AdaptersOutput")
        .whereLayer("Config").mayNotBeAccessedByAnyLayer()
}