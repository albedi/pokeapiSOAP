package com.albedi.pokealbedi.soap;

import javax.servlet.http.HttpServletRequest;

import com.albedi.pokealbedi.model.CallService;
import com.albedi.pokealbedi.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import mx.ersoluciones.soap.pokeapi.GetAbilitiesRequest;
import mx.ersoluciones.soap.pokeapi.GetAbilitiesResponse;
import mx.ersoluciones.soap.pokeapi.GetBaseExperienceRequest;
import mx.ersoluciones.soap.pokeapi.GetBaseExperienceResponse;
import mx.ersoluciones.soap.pokeapi.GetHeldItemsRequest;
import mx.ersoluciones.soap.pokeapi.GetHeldItemsResponse;
import mx.ersoluciones.soap.pokeapi.GetIdRequest;
import mx.ersoluciones.soap.pokeapi.GetIdResponse;
import mx.ersoluciones.soap.pokeapi.GetLocationAreaEncountersRequest;
import mx.ersoluciones.soap.pokeapi.GetLocationAreaEncountersResponse;
import mx.ersoluciones.soap.pokeapi.GetNameRequest;
import mx.ersoluciones.soap.pokeapi.GetNameResponse;
import mx.ersoluciones.soap.pokeapi.Pokemon;

@Endpoint
public class PokeEndpoint {
  private static final String NAMESPACE = "http://ersoluciones.mx/soap/pokeapi";

  @Autowired
  private CallService srv;

  @Autowired
  private HttpServletRequest request;

  @PayloadRoot(namespace = NAMESPACE, localPart = "getAbilitiesRequest")
  @ResponsePayload
  public GetAbilitiesResponse getAbilities(@RequestPayload GetAbilitiesRequest req) {
    srv.setCall(request, "getAbilitiesRequest");
    GetAbilitiesResponse res = new GetAbilitiesResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.getAbilities().addAll(pokemon.getAbilities());
    return res;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getBaseExperienceRequest")
  @ResponsePayload
  public GetBaseExperienceResponse getBaseExperience(@RequestPayload GetBaseExperienceRequest req) {
    srv.setCall(request, "getBaseExperienceRequest");
    GetBaseExperienceResponse res = new GetBaseExperienceResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.setBaseExperience(pokemon.getBaseExperience());
    return res;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getHeldItemsRequest")
  @ResponsePayload
  public GetHeldItemsResponse getHeldItems(@RequestPayload GetHeldItemsRequest req) {
    srv.setCall(request, "getHeldItemsRequest");
    GetHeldItemsResponse res = new GetHeldItemsResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.getHeldItems().addAll(pokemon.getHeldItems());
    return res;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getIdRequest")
  @ResponsePayload
  public GetIdResponse getId(@RequestPayload GetIdRequest req) {
    srv.setCall(request, "getIdRequest");
    GetIdResponse res = new GetIdResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.setId(pokemon.getId());
    return res;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getNameRequest")
  @ResponsePayload
  public GetNameResponse getName(@RequestPayload GetNameRequest req) {
    srv.setCall(request, "getNameRequest");
    GetNameResponse res = new GetNameResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.setName(pokemon.getName());
    return res;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getLocationAreaEncountersRequest")
  @ResponsePayload
  public GetLocationAreaEncountersResponse getLocationAreaEncounters(
      @RequestPayload GetLocationAreaEncountersRequest req) {
    srv.setCall(request, "getLocationAreaEncountersRequest");
    GetLocationAreaEncountersResponse res = new GetLocationAreaEncountersResponse();
    Pokemon pokemon = PokemonService.getPokemon(req.getName());
    res.setLocationAreaEncounters(pokemon.getLocationAreaEncounters());
    return res;
  }

}
