package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Person {
    @JsonProperty
    private final UUID id;
    @NonNull
    @JsonProperty
    private final String name;
}
