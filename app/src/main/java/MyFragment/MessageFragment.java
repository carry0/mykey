package MyFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.workday.R;
import com.example.workday.adapter.HomeListviewAdapter;
import com.example.workday.adapter.MessageListviewAdapter;

public class MessageFragment extends Fragment {
    private MessageListviewAdapter messageListviewAdapter;
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
        View view =  inflater.inflate(R.layout.fragment_message,null);

        listView = view.findViewById(R.id.message_listview);
        int index = getArguments().getInt("index");

        messageListviewAdapter = new MessageListviewAdapter(getContext());
        listView.setAdapter(messageListviewAdapter);
        return view;

    }

}
