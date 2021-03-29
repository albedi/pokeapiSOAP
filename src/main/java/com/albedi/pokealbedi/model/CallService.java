package com.albedi.pokealbedi.model;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {

  @Autowired
  private CallRepo repo;

  public List<Call> getCalls() {
    return repo.findAll();
  }

  public void setCall(Call call) {
    repo.save(call);
  }

  public void setCall(String requestIp, String method) {
    Call call = new Call();
    call.setRequestIp(requestIp);
    call.setMethod(method);
    setCall(call);
  }

  public void setCall(HttpServletRequest req, String method) {
    setCall(req.getRemoteAddr(), method);
  }

}
