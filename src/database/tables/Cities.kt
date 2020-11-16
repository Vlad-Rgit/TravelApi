package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Cities: IntIdTable() {
    val name = varchar("name", 50)
    val country = reference("country", Countries)
}