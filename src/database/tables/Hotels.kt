package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Hotels: IntIdTable() {
    val name = varchar("name", 50)
    val city = reference("city", Cities)
    val street = varchar("street", 200)
    val description = varchar("description", 2000)
}