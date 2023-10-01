package com.example.entree;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class KotlinJsonObject {
    JSONArray obj;
    public static void main(String[] args) {
        return;
    }
    public void returnJson(){
           String jsonString = "{\n" +
                   "    \"green beans\": {\n" +
                   "        \"name\": \"green beans\",\n" +
                   "        \"calories\": 34.8,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.3,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 1.9,\n" +
                   "        \"sodium_mg\": 0,\n" +
                   "        \"potassium_mg\": 29,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 7.7,\n" +
                   "        \"fiber_g\": 3.2,\n" +
                   "        \"sugar_g\": 3.6\n" +
                   "    },\n" +
                   "    \"popcorn\": {\n" +
                   "        \"name\": \"popcorn\",\n" +
                   "        \"calories\": 549.3,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 30.7,\n" +
                   "        \"fat_saturated_g\": 14.5,\n" +
                   "        \"protein_g\": 8.5,\n" +
                   "        \"sodium_mg\": 768,\n" +
                   "        \"potassium_mg\": 272,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 57.0,\n" +
                   "        \"fiber_g\": 9.8,\n" +
                   "        \"sugar_g\": 0.3\n" +
                   "    },\n" +
                   "    \"soft pretzel\": {\n" +
                   "        \"name\": \"soft pretzel\",\n" +
                   "        \"calories\": 332.9,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 3.1,\n" +
                   "        \"fat_saturated_g\": 0.7,\n" +
                   "        \"protein_g\": 8.2,\n" +
                   "        \"sodium_mg\": 555,\n" +
                   "        \"potassium_mg\": 79,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 70.4,\n" +
                   "        \"fiber_g\": 1.7,\n" +
                   "        \"sugar_g\": 0.3\n" +
                   "    },\n" +
                   "    \"spaghetti\": {\n" +
                   "        \"name\": \"spaghetti\",\n" +
                   "        \"calories\": 154.1,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.6,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 5.3,\n" +
                   "        \"sodium_mg\": 4,\n" +
                   "        \"potassium_mg\": 75,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 30.6,\n" +
                   "        \"fiber_g\": 1.3,\n" +
                   "        \"sugar_g\": 1.1\n" +
                   "    },\n" +
                   "    \"coffee\": {\n" +
                   "        \"name\": \"coffee\",\n" +
                   "        \"calories\": 1.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.0,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.1,\n" +
                   "        \"sodium_mg\": 1,\n" +
                   "        \"potassium_mg\": 2,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 0.0,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"tomato soup\": {\n" +
                   "        \"name\": \"tomato soup\",\n" +
                   "        \"calories\": 34.3,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.2,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.7,\n" +
                   "        \"sodium_mg\": 187,\n" +
                   "        \"potassium_mg\": 15,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 7.6,\n" +
                   "        \"fiber_g\": 0.5,\n" +
                   "        \"sugar_g\": 4.0\n" +
                   "    },\n" +
                   "    \"grits\": {\n" +
                   "        \"name\": \"grits\",\n" +
                   "        \"calories\": 64.8,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.4,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 1.2,\n" +
                   "        \"sodium_mg\": 2,\n" +
                   "        \"potassium_mg\": 14,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 13.8,\n" +
                   "        \"fiber_g\": 0.7,\n" +
                   "        \"sugar_g\": 0.1\n" +
                   "    },\n" +
                   "    \"candy\": {\n" +
                   "        \"name\": \"candy\",\n" +
                   "        \"calories\": 400.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.2,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.0,\n" +
                   "        \"sodium_mg\": 37,\n" +
                   "        \"potassium_mg\": 3,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 98.2,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 62.4\n" +
                   "    },\n" +
                   "    \"apple juice\": {\n" +
                   "        \"name\": \"apple juice\",\n" +
                   "        \"calories\": 46.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.1,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.1,\n" +
                   "        \"sodium_mg\": 3,\n" +
                   "        \"potassium_mg\": 6,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 11.2,\n" +
                   "        \"fiber_g\": 0.2,\n" +
                   "        \"sugar_g\": 9.6\n" +
                   "    },\n" +
                   "    \"strawberry milk\": {\n" +
                   "        \"name\": \"strawberry milk\",\n" +
                   "        \"calories\": 90.6,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 3.1,\n" +
                   "        \"fat_saturated_g\": 1.9,\n" +
                   "        \"protein_g\": 3.0,\n" +
                   "        \"sodium_mg\": 47,\n" +
                   "        \"potassium_mg\": 85,\n" +
                   "        \"cholesterol_mg\": 11,\n" +
                   "        \"carbohydrates_total_g\": 12.3,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"corn\": {\n" +
                   "        \"name\": \"corn\",\n" +
                   "        \"calories\": 93.9,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 1.5,\n" +
                   "        \"fat_saturated_g\": 0.2,\n" +
                   "        \"protein_g\": 3.4,\n" +
                   "        \"sodium_mg\": 1,\n" +
                   "        \"potassium_mg\": 75,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 21.0,\n" +
                   "        \"fiber_g\": 2.4,\n" +
                   "        \"sugar_g\": 4.6\n" +
                   "    },\n" +
                   "    \"grilled cheese\": {\n" +
                   "        \"name\": \"grilled cheese\",\n" +
                   "        \"calories\": 340.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 21.6,\n" +
                   "        \"fat_saturated_g\": 12.5,\n" +
                   "        \"protein_g\": 11.2,\n" +
                   "        \"sodium_mg\": 822,\n" +
                   "        \"potassium_mg\": 366,\n" +
                   "        \"cholesterol_mg\": 59,\n" +
                   "        \"carbohydrates_total_g\": 26.7,\n" +
                   "        \"fiber_g\": 1.3,\n" +
                   "        \"sugar_g\": 5.1\n" +
                   "    },\n" +
                   "    \"hot chocolate\": {\n" +
                   "        \"name\": \"hot chocolate\",\n" +
                   "        \"calories\": 54.2,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.5,\n" +
                   "        \"fat_saturated_g\": 0.3,\n" +
                   "        \"protein_g\": 0.9,\n" +
                   "        \"sodium_mg\": 72,\n" +
                   "        \"potassium_mg\": 42,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 11.4,\n" +
                   "        \"fiber_g\": 0.5,\n" +
                   "        \"sugar_g\": 9.0\n" +
                   "    },\n" +
                   "    \"cereal\": {\n" +
                   "        \"name\": \"cereal\",\n" +
                   "        \"calories\": 386.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 6.8,\n" +
                   "        \"fat_saturated_g\": 1.5,\n" +
                   "        \"protein_g\": 12.2,\n" +
                   "        \"sodium_mg\": 495,\n" +
                   "        \"potassium_mg\": 489,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 71.9,\n" +
                   "        \"fiber_g\": 9.2,\n" +
                   "        \"sugar_g\": 4.3\n" +
                   "    },\n" +
                   "    \"yogurt\": {\n" +
                   "        \"name\": \"yogurt\",\n" +
                   "        \"calories\": 64.2,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 1.6,\n" +
                   "        \"fat_saturated_g\": 1.0,\n" +
                   "        \"protein_g\": 5.3,\n" +
                   "        \"sodium_mg\": 69,\n" +
                   "        \"potassium_mg\": 145,\n" +
                   "        \"cholesterol_mg\": 5,\n" +
                   "        \"carbohydrates_total_g\": 7.2,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 7.1\n" +
                   "    },\n" +
                   "    \"tacos\": {\n" +
                   "        \"name\": \"tacos\",\n" +
                   "        \"calories\": 205.5,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 9.7,\n" +
                   "        \"fat_saturated_g\": 4.1,\n" +
                   "        \"protein_g\": 9.2,\n" +
                   "        \"sodium_mg\": 566,\n" +
                   "        \"potassium_mg\": 165,\n" +
                   "        \"cholesterol_mg\": 25,\n" +
                   "        \"carbohydrates_total_g\": 19.9,\n" +
                   "        \"fiber_g\": 2.9,\n" +
                   "        \"sugar_g\": 1.6\n" +
                   "    },\n" +
                   "    \"chocolate milk\": {\n" +
                   "        \"name\": \"chocolate milk\",\n" +
                   "        \"calories\": 81.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 3.4,\n" +
                   "        \"fat_saturated_g\": 2.1,\n" +
                   "        \"protein_g\": 3.2,\n" +
                   "        \"sodium_mg\": 60,\n" +
                   "        \"potassium_mg\": 102,\n" +
                   "        \"cholesterol_mg\": 11,\n" +
                   "        \"carbohydrates_total_g\": 10.5,\n" +
                   "        \"fiber_g\": 0.8,\n" +
                   "        \"sugar_g\": 9.5\n" +
                   "    },\n" +
                   "    \"steak\": {\n" +
                   "        \"name\": \"steak\",\n" +
                   "        \"calories\": 273.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 18.8,\n" +
                   "        \"fat_saturated_g\": 7.3,\n" +
                   "        \"protein_g\": 26.0,\n" +
                   "        \"sodium_mg\": 52,\n" +
                   "        \"potassium_mg\": 194,\n" +
                   "        \"cholesterol_mg\": 95,\n" +
                   "        \"carbohydrates_total_g\": 0.0,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"eggnog\": {\n" +
                   "        \"name\": \"eggnog\",\n" +
                   "        \"calories\": 88.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 4.2,\n" +
                   "        \"fat_saturated_g\": 2.6,\n" +
                   "        \"protein_g\": 4.6,\n" +
                   "        \"sodium_mg\": 55,\n" +
                   "        \"potassium_mg\": 107,\n" +
                   "        \"cholesterol_mg\": 60,\n" +
                   "        \"carbohydrates_total_g\": 8.1,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 8.0\n" +
                   "    },\n" +
                   "    \"mozzarella sticks\": {\n" +
                   "        \"name\": \"mozzarella sticks\",\n" +
                   "        \"calories\": 329.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 18.4,\n" +
                   "        \"fat_saturated_g\": 6.8,\n" +
                   "        \"protein_g\": 14.6,\n" +
                   "        \"sodium_mg\": 863,\n" +
                   "        \"potassium_mg\": 317,\n" +
                   "        \"cholesterol_mg\": 36,\n" +
                   "        \"carbohydrates_total_g\": 25.5,\n" +
                   "        \"fiber_g\": 2.0,\n" +
                   "        \"sugar_g\": 2.3\n" +
                   "    },\n" +
                   "    \"milk\": {\n" +
                   "        \"name\": \"milk\",\n" +
                   "        \"calories\": 51.3,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 1.9,\n" +
                   "        \"fat_saturated_g\": 1.2,\n" +
                   "        \"protein_g\": 3.5,\n" +
                   "        \"sodium_mg\": 52,\n" +
                   "        \"potassium_mg\": 100,\n" +
                   "        \"cholesterol_mg\": 8,\n" +
                   "        \"carbohydrates_total_g\": 4.9,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"burrito\": {\n" +
                   "        \"name\": \"burrito\",\n" +
                   "        \"calories\": 184.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 6.7,\n" +
                   "        \"fat_saturated_g\": 2.7,\n" +
                   "        \"protein_g\": 7.0,\n" +
                   "        \"sodium_mg\": 457,\n" +
                   "        \"potassium_mg\": 131,\n" +
                   "        \"cholesterol_mg\": 11,\n" +
                   "        \"carbohydrates_total_g\": 23.6,\n" +
                   "        \"fiber_g\": 3.6,\n" +
                   "        \"sugar_g\": 2.1\n" +
                   "    },\n" +
                   "    \"potato salad\": {\n" +
                   "        \"name\": \"potato salad\",\n" +
                   "        \"calories\": 142.9,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 8.1,\n" +
                   "        \"fat_saturated_g\": 1.4,\n" +
                   "        \"protein_g\": 2.7,\n" +
                   "        \"sodium_mg\": 539,\n" +
                   "        \"potassium_mg\": 52,\n" +
                   "        \"cholesterol_mg\": 67,\n" +
                   "        \"carbohydrates_total_g\": 11.3,\n" +
                   "        \"fiber_g\": 1.3,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"asparagus\": {\n" +
                   "        \"name\": \"asparagus\",\n" +
                   "        \"calories\": 21.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.2,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 2.4,\n" +
                   "        \"sodium_mg\": 14,\n" +
                   "        \"potassium_mg\": 54,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 4.2,\n" +
                   "        \"fiber_g\": 2.0,\n" +
                   "        \"sugar_g\": 1.3\n" +
                   "    },\n" +
                   "    \"potato chips\": {\n" +
                   "        \"name\": \"potato chips\",\n" +
                   "        \"calories\": 541.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 33.9,\n" +
                   "        \"fat_saturated_g\": 3.4,\n" +
                   "        \"protein_g\": 6.4,\n" +
                   "        \"sodium_mg\": 526,\n" +
                   "        \"potassium_mg\": 153,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 54.1,\n" +
                   "        \"fiber_g\": 3.2,\n" +
                   "        \"sugar_g\": 0.3\n" +
                   "    },\n" +
                   "    \"frozen yogurt\": {\n" +
                   "        \"name\": \"frozen yogurt\",\n" +
                   "        \"calories\": 130.6,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 3.7,\n" +
                   "        \"fat_saturated_g\": 2.3,\n" +
                   "        \"protein_g\": 3.0,\n" +
                   "        \"sodium_mg\": 61,\n" +
                   "        \"potassium_mg\": 90,\n" +
                   "        \"cholesterol_mg\": 12,\n" +
                   "        \"carbohydrates_total_g\": 21.6,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 19.8\n" +
                   "    },\n" +
                   "    \"fruit salad\": {\n" +
                   "        \"name\": \"fruit salad\",\n" +
                   "        \"calories\": 58.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.3,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.8,\n" +
                   "        \"sodium_mg\": 1,\n" +
                   "        \"potassium_mg\": 21,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 15.1,\n" +
                   "        \"fiber_g\": 2.0,\n" +
                   "        \"sugar_g\": 10.2\n" +
                   "    },\n" +
                   "    \"pancake\": {\n" +
                   "        \"name\": \"pancake\",\n" +
                   "        \"calories\": 226.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 9.5,\n" +
                   "        \"fat_saturated_g\": 2.1,\n" +
                   "        \"protein_g\": 6.5,\n" +
                   "        \"sodium_mg\": 435,\n" +
                   "        \"potassium_mg\": 156,\n" +
                   "        \"cholesterol_mg\": 59,\n" +
                   "        \"carbohydrates_total_g\": 28.5,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"brussels sprouts\": {\n" +
                   "        \"name\": \"brussels sprouts\",\n" +
                   "        \"calories\": 36.6,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.5,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 2.6,\n" +
                   "        \"sodium_mg\": 20,\n" +
                   "        \"potassium_mg\": 55,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 7.1,\n" +
                   "        \"fiber_g\": 2.6,\n" +
                   "        \"sugar_g\": 1.7\n" +
                   "    },\n" +
                   "    \"water\": {\n" +
                   "        \"name\": \"water\",\n" +
                   "        \"calories\": 0.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.0,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.0,\n" +
                   "        \"sodium_mg\": 4,\n" +
                   "        \"potassium_mg\": 0,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 0.0,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"smoothie\": {\n" +
                   "        \"name\": \"smoothie\",\n" +
                   "        \"calories\": 79.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.8,\n" +
                   "        \"fat_saturated_g\": 0.5,\n" +
                   "        \"protein_g\": 2.7,\n" +
                   "        \"sodium_mg\": 29,\n" +
                   "        \"potassium_mg\": 71,\n" +
                   "        \"cholesterol_mg\": 2,\n" +
                   "        \"carbohydrates_total_g\": 16.7,\n" +
                   "        \"fiber_g\": 1.4,\n" +
                   "        \"sugar_g\": 11.7\n" +
                   "    },\n" +
                   "    \"french toast\": {\n" +
                   "        \"name\": \"french toast\",\n" +
                   "        \"calories\": 226.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 10.8,\n" +
                   "        \"fat_saturated_g\": 2.7,\n" +
                   "        \"protein_g\": 7.6,\n" +
                   "        \"sodium_mg\": 481,\n" +
                   "        \"potassium_mg\": 117,\n" +
                   "        \"cholesterol_mg\": 116,\n" +
                   "        \"carbohydrates_total_g\": 25.2,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"french fries\": {\n" +
                   "        \"name\": \"french fries\",\n" +
                   "        \"calories\": 312.5,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 14.4,\n" +
                   "        \"fat_saturated_g\": 2.3,\n" +
                   "        \"protein_g\": 3.4,\n" +
                   "        \"sodium_mg\": 209,\n" +
                   "        \"potassium_mg\": 123,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 42.1,\n" +
                   "        \"fiber_g\": 3.8,\n" +
                   "        \"sugar_g\": 0.3\n" +
                   "    },\n" +
                   "    \"bacon\": {\n" +
                   "        \"name\": \"bacon\",\n" +
                   "        \"calories\": 466.4,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 34.9,\n" +
                   "        \"fat_saturated_g\": 12.0,\n" +
                   "        \"protein_g\": 34.0,\n" +
                   "        \"sodium_mg\": 1674,\n" +
                   "        \"potassium_mg\": 380,\n" +
                   "        \"cholesterol_mg\": 98,\n" +
                   "        \"carbohydrates_total_g\": 1.7,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"oatmeal\": {\n" +
                   "        \"name\": \"oatmeal\",\n" +
                   "        \"calories\": 69.6,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 1.5,\n" +
                   "        \"fat_saturated_g\": 0.3,\n" +
                   "        \"protein_g\": 2.5,\n" +
                   "        \"sodium_mg\": 4,\n" +
                   "        \"potassium_mg\": 78,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 11.8,\n" +
                   "        \"fiber_g\": 1.7,\n" +
                   "        \"sugar_g\": 0.3\n" +
                   "    },\n" +
                   "    \"pot roast\": {\n" +
                   "        \"name\": \"pot roast\",\n" +
                   "        \"calories\": 130.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 8.0,\n" +
                   "        \"fat_saturated_g\": 2.9,\n" +
                   "        \"protein_g\": 11.1,\n" +
                   "        \"sodium_mg\": 179,\n" +
                   "        \"potassium_mg\": 94,\n" +
                   "        \"cholesterol_mg\": 35,\n" +
                   "        \"carbohydrates_total_g\": 2.4,\n" +
                   "        \"fiber_g\": 0.6,\n" +
                   "        \"sugar_g\": 1.1\n" +
                   "    },\n" +
                   "    \"tea\": {\n" +
                   "        \"name\": \"tea\",\n" +
                   "        \"calories\": 1.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.0,\n" +
                   "        \"fat_saturated_g\": 0.0,\n" +
                   "        \"protein_g\": 0.0,\n" +
                   "        \"sodium_mg\": 0,\n" +
                   "        \"potassium_mg\": 1,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 0.3,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"burger\": {\n" +
                   "        \"name\": \"burger\",\n" +
                   "        \"calories\": 237.7,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 11.5,\n" +
                   "        \"fat_saturated_g\": 4.7,\n" +
                   "        \"protein_g\": 15.2,\n" +
                   "        \"sodium_mg\": 356,\n" +
                   "        \"potassium_mg\": 137,\n" +
                   "        \"cholesterol_mg\": 53,\n" +
                   "        \"carbohydrates_total_g\": 18.1,\n" +
                   "        \"fiber_g\": 0.0,\n" +
                   "        \"sugar_g\": 0.0\n" +
                   "    },\n" +
                   "    \"broccoli\": {\n" +
                   "        \"name\": \"broccoli\",\n" +
                   "        \"calories\": 35.0,\n" +
                   "        \"serving_size_g\": 100.0,\n" +
                   "        \"fat_total_g\": 0.4,\n" +
                   "        \"fat_saturated_g\": 0.1,\n" +
                   "        \"protein_g\": 2.4,\n" +
                   "        \"sodium_mg\": 41,\n" +
                   "        \"potassium_mg\": 65,\n" +
                   "        \"cholesterol_mg\": 0,\n" +
                   "        \"carbohydrates_total_g\": 7.3,\n" +
                   "        \"fiber_g\": 3.3,\n" +
                   "        \"sugar_g\": 1.4\n" +
                   "    }\n" +
                   "}";

           try {
               JSONObject obj = new JSONObject(jsonString);
               Iterator x = obj.keys();
               JSONArray arr = new JSONArray();

               while(x.hasNext()){
                   String key = (String) x.next();
                   arr.put(obj.get(key));
               }
               this.obj = arr;

           } catch (JSONException e){
               System.out.println(e);
           }
        }

}
