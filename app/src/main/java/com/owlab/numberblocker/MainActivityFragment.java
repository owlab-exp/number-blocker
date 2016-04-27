package com.owlab.numberblocker;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    ArrayAdapter<String> blockedNumbersAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<String> blockedNumberList = new ArrayList<>(Arrays.asList(
                "000-000-0000"
                , "111-111-1111"
                , "222-222-2222"
                , "333-222-2222"
                , "444-222-2222"
                , "555-222-2222"
                , "666-222-2222"
                , "777-222-2222"
                , "888-222-2222"
                , "999-222-2222"
                ));
        blockedNumbersAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_number, R.id.list_item_number_textview, blockedNumberList);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView listView = (ListView) view.findViewById(R.id.list_item_number);
        listView.setAdapter(blockedNumbersAdapter);
    }

}
