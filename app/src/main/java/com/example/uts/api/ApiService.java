package com.example.uts.api;

import com.example.uts.data.SearchUserResponse;
import com.example.uts.data.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<SearchUserResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);
}

