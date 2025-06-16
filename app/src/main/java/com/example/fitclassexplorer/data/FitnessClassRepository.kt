package com.example.fitclassexplorer.data

import kotlinx.coroutines.delay
import javax.inject.Inject

class FitnessClassRepository @Inject constructor() {

    suspend fun getClassDetailById(id: String): FitnessClassDetail {
        delay(1000)
        return FitnessClassDetail(
            id = id,
            title = "Power Yoga",
            description = "A dynamic class focused on strength and flexibility.",
            instructor = "Alex Morgan",
            time = "Mon & Wed - 7:00 AM",
            location = "Urban sports studio, Berlin"
        )
    }


    suspend fun getAllClasses(): List<FitnessClass> {
        delay(1000)
        return listOf(
            FitnessClass("1", "Power Yoga", "Yoga", "Mon & Wed - 7:00 AM"),
            FitnessClass("2", "Hiit Blast", "Cardio", "Tue & Thu - 6:00 PM"),
            FitnessClass("3", "Pilates Core", "Pilates", "Friday - 8:00 AM")
        )
    }
}