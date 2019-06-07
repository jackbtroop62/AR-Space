package com.csc309.arspace;

import com.csc309.arspace.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ProductsContent {

    /**
     * An array of sample (dummy) items.
     */
    protected static final List<Product> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    protected static final Map<String, Product> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 25;

    public static void addItem(Product item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getTitle(), item);
    }

    public static void removeAll() {
        ITEMS.clear();
        ITEM_MAP.clear();
    }

    public static void addAll(ArrayList<Product> items) {
        for(Product prod: items) {
            addItem(prod);
        }

    }


}
