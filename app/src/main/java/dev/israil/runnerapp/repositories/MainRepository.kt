package dev.israil.runnerapp.repositories

import dev.israil.runnerapp.db.Run
import dev.israil.runnerapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(val runDao: RunDao) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByAverageSpeed() = runDao.getAllRunsSortedByAverageSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getTotalAvgSpeed() = runDao.getTotalAverageSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalCalories() = runDao.getTotalCalories()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()






}