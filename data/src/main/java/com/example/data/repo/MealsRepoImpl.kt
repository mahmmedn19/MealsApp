package com.example.data.repo

import com.example.data.remote.MealsService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val mealsService:MealsService) : MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = mealsService.getMeals()

}
