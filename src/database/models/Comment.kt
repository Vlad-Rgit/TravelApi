package com.travel.database.models

import com.travel.database.tables.Comments
import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Comment(
    id: EntityID<Int>,
): IntEntity(id) {
    companion object: IntEntityClass<Comment>(Comments)

    var commentType by CommentType referencedOn Comments.commentType
    var user by User referencedOn Comments.user
    var comment by Comments.comment
    var rating by Comments.rating
}