package data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService{

    String BASE_URL = "http://jft.web.id/fishapi/api/";
    @GET("ponds")
    Call<List<DataModel>>getFish();
}