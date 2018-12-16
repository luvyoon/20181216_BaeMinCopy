package kr.tjeit.a20181216_baemincopy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japanesFoodBtn;

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

        //        한식 버튼이 눌렸을때 할일.
        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,RestaurantListActivity.class
                );
                startActivity(intent);

            }
        });

        bunsikBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        japanesFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

//        사실 읽을 필요가 전혀 없는 코드들.
//        따로 메쏘드를 만들어서 밑으로 치워버리자.
        koreanFoodBtn = findViewById(R.id.koreanFoodBtn);
        bunsikBtn = findViewById(R.id.bunsikBtn);
       japanesFoodBtn = findViewById(R.id.japanesFoodBtn);
    }
}
