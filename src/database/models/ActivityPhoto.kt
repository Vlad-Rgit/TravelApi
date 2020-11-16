package com.travel.database.models

import com.travel.database.tables.ActivityPhotos
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ActivityPhoto(id: EntityID<Int>): IntEntity(id) {

    companion object: IntEntityClass<ActivityPhoto>(ActivityPhotos)

    var photo by ActivityPhotos.photo
    var activity by Activity referencedOn ActivityPhotos.activity
}