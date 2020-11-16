package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object Comments: IntIdTable() {
    val commentType = reference("commentType", CommentTypes)
    val user = reference("user", Users)
    val comment = varchar("comment", 2000)
    val rating = byte("rating")
}