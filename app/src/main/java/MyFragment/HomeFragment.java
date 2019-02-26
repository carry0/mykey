package MyFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.workday.R;
import com.example.workday.activity.MainActivity;
import com.example.workday.adapter.HomeListviewAdapter;


public class HomeFragment extends Fragment {
    private HomeListviewAdapter homeListviewAdapter;
    private ListView listView;

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
        View view =  inflater.inflate(R.layout.fragment_home,null);

        listView = view.findViewById(R.id.home_listview);
        int index = getArguments().getInt("index");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        homeListviewAdapter = new HomeListviewAdapter(getContext());
        listView.setAdapter(homeListviewAdapter);
        return view;

    }

}
