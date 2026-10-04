package com.eazybites.backend.Controller;

import com.eazybites.backend.dto.UserDto;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/dummy/users")
public class UserController {
    @GetMapping({"/{userId}/posts/{postId}", "/{userId}"})
    public ResponseEntity<String> searchUserPostWithMultiPathVariables(@PathVariable Long userId,
                                                                       @PathVariable(required = false) Long postId) {
        String response;
        if (postId == null) {
            response = "Fetched user with id: " + userId;
        } else {
            response = "Fetched user with id: " + userId + " and post id: " + postId;
        }
        // return response;
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{userId}/order/{orderId}")
    public String searchUserOrderWithMultiPathVariables(@PathVariable(name = "userId") Long customerId, @PathVariable Long orderId) {
        return "Fetched user with id : " + customerId + " and Order id : " + orderId;
    }

    @GetMapping("/{userId}/address/{orderId}")
    public String searchUserAddressWithMultiPathVariables(@PathVariable Map<String, String> path) {
        return "Fetched user with id : " + path.get("userId") + " and Address id : " + path.get("orderId");
    }

    @GetMapping("/search")
    public String searchWithRequestParam(@RequestParam String name, @RequestParam(required = false, defaultValue = "Male") String gender) {
        return "Fetched user with name : " + name + " and gender : " + gender;
    }

    @GetMapping("/search/map")
    public String searchWithMapRequestParam(@RequestParam Map<String, String> map) {
        return "Fetched user with name : " + map.get("name") + " and gender : " + map.get("gender");
    }

    @GetMapping("/headers")
    public String searchWithHeaderRequestParam(@RequestHeader("User-Agent") String userAgent, @RequestHeader("User-Location") String userLocation) {
        return "Fetched header : " + userAgent + " and : " + userLocation;
    }


    @GetMapping("/headers/map")
    public String searchWithHeaderMapRequestParam(@RequestHeader Map<String, String> req) {
        return "Fetched header : " + req.get("User-Agent") + " and : " + req.get("User-Location");
    }
//    @GetMapping("/headers/map")
//    public String searchWithHeaderMapRequestParam(@RequestHeader HttpHeaders reqHeaders) {
//        return "Fetched header : "+reqHeaders.get("User-Agent")+" and : "+reqHeaders.get("User-Location");
//    }


    @PostMapping
    public String createUser(@RequestBody UserDto userdto) {
        return "Received : " + userdto.toString();
    }

    @PostMapping("request-entity")
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserDto> requestEntity) {
        HttpHeaders httpHeaders = requestEntity.getHeaders();
        UserDto userDto = requestEntity.getBody();
        String queryParam = requestEntity.getUrl().getQuery();
        String pathVariables = requestEntity.getUrl().getPath();
        // return "Created User with the data: " + userDto.toString();
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Custom-Header", "ExampleValue")
                .body("Created User with the data: " + userDto.toString());
    }

}
