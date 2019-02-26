package MyFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.workday.R;
import com.example.workday.adapter.DiscoverListviewAdapter;
import com.example.workday.adapter.MessageListviewAdapter;

public class DiscoverFragment extends Fragment implements SearchView.OnQueryTextListener {
    private DiscoverListviewAdapter discoverListviewAdapter;
    private ListView listView;
    private SearchView searchView;
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
        View view =  inflater.inflate(R.layout.fragment_discover,null);
        searchView = view.findViewById(R.id.sv);

        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(true);
        searchView.setQueryHint("查找");
        listView = view.findViewById(R.id.discover_listview);
        int index = getArguments().getInt("index");

        discoverListviewAdapter = new DiscoverListviewAdapter(getContext());
        listView.setAdapter(discoverListviewAdapter);
        return view;

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Toast.makeText(getContext(), "您的选择是："+query,Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)){
            listView.clearTextFilter();
        }else {
            listView.setFilterText(newText);
        }
        return false;
    }
}
