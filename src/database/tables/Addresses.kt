package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Addresses: IntIdTable() {
    val country = reference("country", Countries)
    val city = reference("city", Cities)
    val street = reference("street", Streets)
    val buildingNumber = integer("buildingNumber")
    val corpusNumber = integer("corpusNumber")
}