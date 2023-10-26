package com.progmovil.lab09_2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Stopwatch")
data class Stopwatch(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    @ColumnInfo(name = "title")
    val title : String,
    @ColumnInfo(name = "time")
    val time : Long
)
