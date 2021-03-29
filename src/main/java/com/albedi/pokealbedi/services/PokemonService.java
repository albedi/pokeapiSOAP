package com.albedi.pokealbedi.services;

import org.springframework.web.client.RestTemplate;

import mx.ersoluciones.soap.pokeapi.Pokemon;

public class PokemonService {
  private static String REST_URI = "https://pokeapi.co/api/v2/pokemon/";

  public static Pokemon getPokemon(String name) {
    RestTemplate rest = new RestTemplate();
    return rest.getForObject(REST_URI + name, Pokemon.class);
  }

}
