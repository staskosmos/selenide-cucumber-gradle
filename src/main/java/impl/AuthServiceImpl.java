package impl;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.var;
import models.api.User;
import services.AuthService;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

public class AuthServiceImpl implements AuthService {

    private final String SERVICE = "auth/";
    @Override
    public User createUser(User user) {
       String uri =URI + SERVICE+"create/";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .post(uri);
        if(response.statusCode()==200){
            return response.as(User.class);
        }
        return null;
    }

    @Override
    public User login(User user) {
        String url = URI + SERVICE + "login/";
        return getUser(url, user);
    }

    private User getUser(String url, User user) {
        Response r = given()
                .contentType(ContentType.JSON)
                .body(user)
                .post(url);

        if (r.statusCode() == 200) {
            var cookies = r.getCookies();
            put("cookies", cookies);
            put("user", r.as(User.class));
            return r.as(User.class);
        } else
            return null;
    }
}
