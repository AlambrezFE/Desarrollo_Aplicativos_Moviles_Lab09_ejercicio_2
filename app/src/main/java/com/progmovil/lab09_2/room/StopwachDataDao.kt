package com.progmovil.lab09_2.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.progmovil.lab09_2.model.Stopwatch
import kotlinx.coroutines.flow.Flow

@Dao
interface StopwachDataDao {
    @Query("SELECT * FROM stopwatch")
    fun getStopwatch(): Flow<List<Stopwatch>>
    @Query("SELECT * FROM stopwatch WHERE id = :id")
    fun getStopwatchById(id: Long):Flow<Stopwatch>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insert(stopwatch: Stopwatch)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(stopwatch: Stopwatch)

    @Delete
    suspend fun delete(stopwatch: Stopwatch)
}