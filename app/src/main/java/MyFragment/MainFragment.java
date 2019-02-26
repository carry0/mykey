package MyFragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.workday.R;
import com.example.workday.base.PagerBase;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;


public class MainFragment extends Fragment {

    private static final String TAG = "debug";
    //图片数组
    private int[] backgrounds = {R.drawable.bg1,R.drawable.bg2,
                                 R.drawable.bg3,R.drawable.bg4,R.drawable.bg5};
    private TextView textView;
    private ImageView imageView;
    private PagerBase pagerBase;
    private String id;
    private String url = "http://route.showapi.com/90-86?showapi_appid=83005&showapi_sign=96599a4cc65c429dbb2eaa4326e9f18f";

    /**
     * 创建视图
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
           View view =  inflater.inflate(R.layout.fragment_view,null);

           imageView = view.findViewById(R.id.fragment_img);
           int index = getArguments().getInt("index");
           Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(),
                    index<backgrounds.length ? backgrounds[index]:backgrounds[0]);
           imageView.setImageBitmap(bitmap);


           textView = view.findViewById(R.id.tv);
           String title = getArguments().getString("title");
           textView.setText(title);
           return view;
    }



}
