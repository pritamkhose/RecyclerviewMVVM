package com.pritam.mvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.pritam.mvvm.models.Recipe;
import com.pritam.mvvm.repositories.RecipeRepository;
import com.pritam.mvvm.util.Resource;


public class RecipeViewModel extends AndroidViewModel {

    private RecipeRepository recipeRepository;

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        recipeRepository = RecipeRepository.getInstance(application);
    }

    public LiveData<Resource<Recipe>> searchRecipeApi(String recipeId){
        return recipeRepository.searchRecipesApi(recipeId);
    }
}





















