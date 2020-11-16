package com.travel.database

import com.travel.database.models.City
import com.travel.database.models.CityPhoto
import com.travel.database.models.Country
import com.travel.database.models.User
import com.travel.database.tables.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.deleteWhere
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.FileInputStream

object DatabaseFactory {
    fun init() {

        Database.connect(
            "jdbc:postgresql://database:5432/ktor",
            driver = "org.postgresql.Driver",
            user = "username",
            password = "secret"
        )


        transaction {
            
            SchemaUtils.create (
                Activities,
                ActivityPhotos,
                Addresses,
                Cities,
                Comments,
                CommentTypes,
                Countries,
                HotelFacilities,
                HotelFacilitiesInHotel,
                HotelPhotos,
                Hotels,
                RoomTypes,
                RoomTypesInHotel,
                Streets,
                Users,
            )


            if(Country.all().count() == 0L) {
                Country.new {
                    name = "Russia"
                }

                Country.new {
                    name = "Germany"
                }

                Country.new {
                    name = "USA"
                }
            }
        }

        val city: City? = transaction {
            if(City.count() == 0L) {
                return@transaction City.new {
                    name = "Venice"
                    country = Country.findById(3)!!
                }
            }
            null
        }

        val cityPhoto: CityPhoto? = transaction {
            if(CityPhoto.count() == 0L) {
                val stream = FileInputStream("/res/venice.jpg").buffered()
                val cp = CityPhoto.new {
                    this.city = city!!
                    photo = stream.readAllBytes()
                }
                stream.close()
                return@transaction cp
            }
            null
        }

    }
}