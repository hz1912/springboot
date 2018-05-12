package com.hz.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.HashMap;

@Data
public class Response {

    public static final int OK = 200;

    private int code;
    private String message;
    private Object data = new HashMap<>();
    private boolean lastPage = false;


    public static String ok() {
        try {
            Response response = new Response();
            response.setData(new HashMap());
            response.setCode(Response.OK);
            response.setMessage("ok");

            return new ObjectMapper().writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String withDataok(Object data) {
        try {
            Response response = new Response();
            if (StringUtils.isEmpty(data)) {
                response.setData(new HashMap<>());
            }
            response.setData(data);
            response.setCode(Response.OK);
            response.setMessage("ok");
            return new ObjectMapper().writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) {
        System.out.println(Response.ok());
    }
}
