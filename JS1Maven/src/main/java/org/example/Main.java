package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Person person = new Person("Anna", "Skazka", 30);

        String json = gson.toJson(person);
        System.out.printf("Сериализованный json: " + json + "\n");

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.printf("Десериализованный объект: " + deserializedPerson);

    }
}