package com.travel.database.tables

import com.travel.database.models.User
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.ResultRow

object Users: IntIdTable() {

    val email = varchar("email", 254)
    val passwordHash = varchar("passwordHash", 60)
    val firstName = varchar("firstName", 50)
    val lastName = varchar("lastName", 50)

}