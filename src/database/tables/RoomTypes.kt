package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object RoomTypes: IntIdTable() {

    val name = varchar("name", 50)

}