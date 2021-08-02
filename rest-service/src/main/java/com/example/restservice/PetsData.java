package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PetsData {
    //Didn't utilize a database for this project; hardcoded in the pets in a List
    private List<Pet> pets = new ArrayList<>(Arrays.asList(
            new Pet(1L, "A", "available"),
            new Pet(2L, "B", "available"),
            new Pet(3L, "C", "pending"),
            new Pet(4L, "D", "pending"),
            new Pet(5L, "E", "sold")
    ));

    //not a part of the spec; just for testing purposes
    public List<Pet> getAllPets() {
        return pets;
    }

    //gets the specific pet with the given id
    public Pet getPetByID(Long id) {
        return pets.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    //adds a new pet in the store
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    //updates a pet in the store
    public void updatePet(Long id, Pet pet) {
        for (int i = 0; i < pets.size(); i++) {
            Pet p = pets.get(i);
            if (p.getId().equals(id)) {
                pets.set(i, pet);
                return;
            }
        }
    }

    //deletes a pet in the store
    public void deletePet(Long id) {
        pets.removeIf(p -> p.getId().equals(id));
    }
}
