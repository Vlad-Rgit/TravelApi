package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Streets: IntIdTable() {
    val name = varchar("name", 100)
}