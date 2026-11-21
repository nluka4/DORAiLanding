package dev.dorascanner.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.core.subcommands
import dev.dorascanner.AppInfo

class DoraScan : CliktCommand(name = "dorascan") {
    override fun help(context: Context) = "${AppInfo.NAME} command line"
    override fun run() = Unit
}

class Check : CliktCommand() {
    override fun help(context: Context) = "Run DORA checks (not implemented yet)"
    override fun run() = Unit
}

class Db : CliktCommand() {
    override fun help(context: Context) = "Database tasks (not implemented yet)"
    override fun run() = Unit
}

fun main(args: Array<String>) = DoraScan().subcommands(Check(), Db()).main(args)
