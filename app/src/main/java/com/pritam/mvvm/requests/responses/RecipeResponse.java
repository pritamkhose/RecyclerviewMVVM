package com.pritam.mvvm.requests.responses;

import androidx.annotation.Nullable;

import com.pritam.mvvm.models.Recipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeResponse {

    @SerializedName("recipe")
    @Expose()
    private Recipe recipe;

    @SerializedName("error")
    @Expose()
    private String error;

    public String getError() {
        return error;
    }

    @Nullable
    public Recipe getRecipe(){
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeResponse{" +
                "recipe=" + recipe +
                ", error='" + error + '\'' +
                '}';
    }
}
