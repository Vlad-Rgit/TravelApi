package com.travel

import com.apurebase.kgraphql.GraphQL
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.auth.*
import com.fasterxml.jackson.databind.*
import com.travel.dto.CountryDto
import com.travel.database.DatabaseFactory
import com.travel.database.models.Country
import com.travel.database.tables.Countries
import io.ktor.jackson.*
import io.ktor.features.*
import org.jetbrains.exposed.sql.transactions.transaction
import org.modelmapper.ModelMapper

fun main(args: Array<String>): Unit = io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    DatabaseFactory.init()

    install(Authentication) {

    }

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }


    install(GraphQL) {
        playground = true
        this.endpoint = "/ql"
        schema {
            query("countryQL") {
                resolver { filter: String? ->
                    transaction {
                        val mapper = ModelMapper()
                        Country.find {
                            Countries.name.like("%${filter ?: ""}%")
                        }.map { mapper.map(it, CountryDto::class.java) }
                    }
                }
            }
        }
    }

    routing {
        get("/") {

            val mapper = ModelMapper()

            val result = transaction {
               Country.all()
                    .map { mapper.map(it, CountryDto::class.java) }
            }

            call.respond(result)
        }

        get("/json/jackson") {
            call.respond(mapOf("hello" to "world"))
        }

        post("/") {

        }
    }
}

