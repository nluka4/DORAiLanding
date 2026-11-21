package dev.dorascanner.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver

object DatabaseFactory {
    fun create(url: String = JdbcSqliteDriver.IN_MEMORY): DoraDatabase {
        val driver: SqlDriver = JdbcSqliteDriver(url)
        DoraDatabase.Schema.create(driver)
        return DoraDatabase(driver)
    }
}
