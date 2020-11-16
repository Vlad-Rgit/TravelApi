package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object CommentTypes: IntIdTable() {
    val name = varchar("name", 50)
}