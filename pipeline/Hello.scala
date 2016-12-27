//#!/usr/bin/env anduril

import anduril.builtin._
import anduril.tools._
import org.anduril.runtime._

object HelloWorld {
    val input: INPUT = INPUT(path = "files/data.tsv")
    val qualityOK = CSVFilter(input, regexp = "QualityOK=1")
    val gene2 = CSVFilter(input, regexp = "Gene=gene02")
    val joined = CSVJoin(qualityOK, gene2, intersection = false)
}