package com.travel.database.models

import com.travel.database.tables.Cities
import com.travel.database.tables.CityPhotos
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class CityPhoto(id: EntityID<Int>): IntEntity(id) {
    
    companion object: IntEntityClass<CityPhoto>(CityPhotos)

    var city by City referencedOn CityPhotos.city
    var photo by CityPhotos.photo
}