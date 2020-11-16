package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object ActivityPhotos: IntIdTable() {
    val photo = binary("photo")
    val activity = reference("activity", Activities)
}