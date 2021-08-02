package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetsData petdata;

    //not part of spec; for testing purposes
    @RequestMapping("/pet/getAllPets")
    public List<Pet> getAllPets() {
        return petdata.getAllPets();
    }

    //gets the specific pet with given id
    @RequestMapping("/pet/{petId}")
    public Pet getPetByID(@PathVariable("petId") Long id) {
        return petdata.getPetByID(id);
    }

    //add a pet to the store
    @RequestMapping(method=RequestMethod.POST, value="/pet")
    public void addPet(@RequestBody Pet pet) {
        petdata.addPet(pet);
    }

    //update a pet in the store
    @RequestMapping(method=RequestMethod.PUT, value="/pet/{id}")
    public void updatePet(@RequestBody Pet pet, @PathVariable Long id) {
        petdata.updatePet(id, pet);
    }

    //deletes a pet in the store
    @RequestMapping(method=RequestMethod.DELETE, value="/pet/{petId}")
    public void deletePet(@PathVariable("petId") Long id) {
        petdata.deletePet(id);
    }
}
