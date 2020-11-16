package com.travel.database.models

import com.travel.database.tables.CommentTypes
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class CommentType(
    id: EntityID<Int>
): IntEntity(id) {
    companion object: IntEntityClass<CommentType>(CommentTypes)

    var name by CommentTypes.name
}