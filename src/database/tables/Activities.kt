package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Activities: IntIdTable() {
    val city = reference("city", Cities)
    val name = varchar("name", 50)
    val pricePerPax = decimal("pricePerPax", 10, 2)
    val description = varchar("description", 2000)
}