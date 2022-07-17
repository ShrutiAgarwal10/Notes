package com.shrutayyy.notes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(note:Note)

    @Delete
    abstract fun delete(note:Note)

    @Query("Select * from notes_table order by id ASC" )
    fun getAllNotes(): LiveData<List<Note>>

}