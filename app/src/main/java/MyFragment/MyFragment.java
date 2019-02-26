package MyFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.workday.R;
import com.example.workday.myscrollview.HeadZoomScrollView;
import com.example.workday.adapter.DiscoverListviewAdapter;

public class MyFragment extends Fragment {
    private DiscoverListviewAdapter discoverListviewAdapter;
    private HeadZoomScrollView headZoomScrollView;
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
        View view =  inflater.inflate(R.layout.fragment_me,null);

        headZoomScrollView = view.findViewById(R.id.me_myScrollView);
        int index = getArguments().getInt("index");

        return view;

    }

}
