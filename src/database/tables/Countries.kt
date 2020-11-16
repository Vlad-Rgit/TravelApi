package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Countries: IntIdTable() {
    val name = varchar("country_name", 50)
}