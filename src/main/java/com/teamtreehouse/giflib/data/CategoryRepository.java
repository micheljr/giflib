package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findByID(int id){
        for( Category c : ALL_CATEGORIES){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
