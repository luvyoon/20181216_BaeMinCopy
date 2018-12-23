package kr.tjeit.a20181216_baemincopy;

import android.content.Intent;
import android.icu.util.ChineseCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japanesFoodBtn;
    private LinearLayout chickenBtn;
    private LinearLayout pizzaBtn;
    private LinearLayout chineseBtn;
    private LinearLayout pigBtn;
    private LinearLayout yasikBtn;
    private LinearLayout stewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvent();
        setValues();


    }


    @Override
    public void setupEvent() {

//        //        한식 버튼이 눌렸을때 할일.
//        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(mContext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
//
////                한식이 눌렸다는 사실을 레스토랑 리스트 액티비티에 공지(알리고 싶음)
//
//                Intent intent = new Intent(mContext, RestaurantListActivity.class
//                );
//                intent.putExtra("음식종류", "한식");
//                startActivity(intent);
//
//            }
//        });




        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



// 첫번쨰 방법 예시
//                if (v.getId() == R.id.chickenBtn){
//                    Toast.makeText(mContext, "치킨 눌림", Toast.LENGTH_SHORT).show();
//                } else if (v.getId() == R.id.pizzaBtn){
//
//                    Toast.makeText(mContext, "피자 눌림", Toast.LENGTH_SHORT).show();
//                }

//                두번쨰 방법,xml에 태그 단거 이용하기

                Toast.makeText(mContext, v.getTag().toString(), Toast.LENGTH_SHORT).show();




            }
        };


        koreanFoodBtn.setOnClickListener(foodKindClickListener);
        bunsikBtn.setOnClickListener(foodKindClickListener);
        japanesFoodBtn.setOnClickListener(foodKindClickListener);
        chickenBtn.setOnClickListener(foodKindClickListener);
        pigBtn.setOnClickListener(foodKindClickListener);
        yasikBtn.setOnClickListener(foodKindClickListener);
        stewBtn.setOnClickListener(foodKindClickListener);
        pizzaBtn.setOnClickListener(foodKindClickListener);
        chineseBtn.setOnClickListener(foodKindClickListener);


    }




    @Override

    public void setValues() {

    }

    @Override
    public void bindViews() {

//        사실 읽을 필요가 전혀 없는 코드들.
//        따로 메쏘드를 만들어서 밑으로 치워버리자.
        this.stewBtn = (LinearLayout) findViewById(R.id.stewBtn);
        this.yasikBtn = (LinearLayout) findViewById(R.id.yasikBtn);
        this.pigBtn = (LinearLayout) findViewById(R.id.pigBtn);
        this.chineseBtn = (LinearLayout) findViewById(R.id.chineseBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.chickenBtn = (LinearLayout) findViewById(R.id.chickenBtn);
        this.japanesFoodBtn = (LinearLayout) findViewById(R.id.japanesFoodBtn);
        this.bunsikBtn = (LinearLayout) findViewById(R.id.bunsikBtn);
        this.koreanFoodBtn = (LinearLayout) findViewById(R.id.koreanFoodBtn);
    }
}
