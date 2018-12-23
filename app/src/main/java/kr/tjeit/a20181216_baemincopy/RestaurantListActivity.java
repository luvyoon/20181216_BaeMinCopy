package kr.tjeit.a20181216_baemincopy;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.tjeit.a20181216_baemincopy.datas.Restaurant;

public class RestaurantListActivity extends BaseActivity{

    List<Restaurant> restaurants = new ArrayList<Restaurant>();

    String foodKind;
    private android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        bindViews();
        setupEvent();
        setValues();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {

        foodKind = getIntent().getStringExtra("음식종류");

        setTitle(String.format("%s 배달 가능 식당 목록",foodKind));

        fillRestaurants();

    }

    private void fillRestaurants() {

        restaurants.clear();
        restaurants.add(new Restaurant("도미노피자","광진구","09:00 ~ 22:00"));
        restaurants.add(new Restaurant("미스터피자","관악구","10:00 ~ 21:00"));
        restaurants.add(new Restaurant("파파존스","강동구","13:00 ~ 22:00"));
        restaurants.add(new Restaurant("피자헛","성북구","15:00 ~ 24:00"));

    }

    @Override
    public void bindViews() {

        this.listView = (ListView) findViewById(R.id.listView);


    }
}
