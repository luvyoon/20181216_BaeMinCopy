package kr.tjeit.a20181216_baemincopy.adapters;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

import kr.tjeit.a20181216_baemincopy.R;
import kr.tjeit.a20181216_baemincopy.datas.Restaurant;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {


    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf; //xml =>JAVA 에서 활용 가능하게 그려주는 역할 . 인플레이팅

    public RestaurantAdapter(Context mContext, List<Restaurant> mList) {

        super(mContext, R.layout.restaurant_list_item, mList);


        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        if (row == null) {

            row = inf.inflate(R.layout.restaurant_list_item, null);
        }

        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);
        ImageView logoImgView = row.findViewById(R.id.logoImgView);
        Button callBtn = row.findViewById(R.id.callBtn);

        Restaurant data = mList.get(position);

        nameTxt.setText(data.getName());
        addressTxt.setText(data.getAddress());
        openTimeTxt.setText(data.getOpenTime());
        Glide.with(mContext).load(data.getLogoUrl()).into(logoImgView);

//        버튼이 달려있다면 findViewById 로 연결해서  setonClick 작성

//        콜버튼 눌리면 할일!

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                전화를 바로걸기

                PermissionListener permissionListener = new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {

//                      전화 승인, 전화 걸어줌
                        Uri uri = Uri.parse("tel:01012345678");
                        Intent intent = new Intent(Intent.ACTION_CALL,uri);
                        mContext.startActivity(intent);
                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {

                        Toast.makeText(mContext, "전화 승인이 필요합니다", Toast.LENGTH_SHORT).show();

                    }
                };

                TedPermission.with(mContext).setPermissionListener(permissionListener)
                        .setPermissions(Manifest.permission.CALL_PHONE).check();



            }
        });

        return row;

    }
}
