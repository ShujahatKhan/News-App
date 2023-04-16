package uk.ac.tees.c2427922.newsapp.db

import androidx.room.TypeConverter
import uk.ac.tees.c2427922.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.Name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}