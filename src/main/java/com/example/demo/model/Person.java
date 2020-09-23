package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Person {
    @JsonProperty
    private final UUID id;
    @NotBlank
    @JsonProperty
    private final String name;
}
