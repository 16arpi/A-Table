package com.pigeoff.menu.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RecipeDAO {
    @Query("SELECT * FROM RecipeEntity WHERE cookbook != 0 ORDER BY id DESC")
    LiveData<List<RecipeEntity>> select();

    @Query("SELECT * FROM RecipeEntity WHERE cookbook != 0 ORDER BY id DESC")
    List<RecipeEntity> selectStatic();


    @Query("SELECT * FROM RecipeEntity WHERE id = :id")
    LiveData<RecipeEntity> select(long id);

    @Update
    void update(RecipeEntity recipe);

    @Insert
    long insert(RecipeEntity recipe);

    @Delete
    void delete(RecipeEntity recipe);
}
