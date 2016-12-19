package retrofit.desafio.com.recyclerview;

import retrofit2.Retrofit;

/**
 * Created by Thiago on 19/12/2016.
 */

public class RetrofitExample {

    static final String BASE_URL = "http://history.openweathermap.org/data/2.5/history/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}


