package com.example.newsoap;

import generate.GetUsersRequest;
import generate.GetUsersResponse;
import generate.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    public static final String NAMESPACE_URI = "http://www.javaspringclub.com/movies-ws";

    private UserEntityService service;

    public UserEndpoint() {

    }

    @Autowired
    public UserEndpoint(UserEntityService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUsersRequest")
    @ResponsePayload
    public GetUsersResponse getUserIin(@RequestPayload GetUsersRequest request) {
        GetUsersResponse response = new GetUsersResponse();
        UserEntity movieEntity = service.getEntityByIin(request.getIin());
            User user = new User();
            BeanUtils.copyProperties(movieEntity, user);
            response.setUser(user);
            return response;
            
    }
}
