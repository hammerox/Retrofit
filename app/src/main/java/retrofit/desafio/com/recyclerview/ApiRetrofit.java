package retrofit.desafio.com.recyclerview;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Thiago on 19/12/2016.
 */

public interface ApiRetrofit {

    @GET("data/2.5/history/city?id=2885679&type=hour")
    Call<RequestBody> leRetrofit();

    @GET("data/2.5/history/city")
    Call<RequestBody> getCity(@Query("id") String id, @Query("type") String type);
}
