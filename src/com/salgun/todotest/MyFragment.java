package com.salgun.todotest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment{
	
	public static final String ARG_SECTION_NUMBER = "section_number";
	
	public MyFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		// Create a new TextView and set its text to the fragment's section
//		// number argument value.
//		TextView textView = new TextView(getActivity());
//		textView.setGravity(Gravity.CENTER);
//		textView.setText(Integer.toString(getArguments().getInt(
//				ARG_SECTION_NUMBER)));
//		return textView;
		
		View myView = inflater.inflate(R.layout.activity_main, container, false);
		
		
		return myView;
		
	}

}
