package com.example.mykha.bakingmaster.api;

import com.example.mykha.bakingmaster.data.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RecipeService {
    @GET("baking.json")
    Call<List<Recipe>> getMyJson();
}
