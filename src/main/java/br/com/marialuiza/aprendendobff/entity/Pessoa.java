package br.com.marialuiza.aprendendobff.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pessoa {

    private long id;
    @JsonProperty("name")
    private String nome;
    private String email;
    @JsonProperty("username")
    private String usuario;
}
