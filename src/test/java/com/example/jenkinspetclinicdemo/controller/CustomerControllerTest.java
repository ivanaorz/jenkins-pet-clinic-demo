package com.example.jenkinspetclinicdemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerControllerTest {
    @Test
    void saveCustomer() {

        String name = "Pet";

        Assertions.assertEquals("Pet", name);
    }

}