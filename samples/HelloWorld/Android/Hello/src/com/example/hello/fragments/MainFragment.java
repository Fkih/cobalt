package com.example.hello.fragments;

import com.example.hello.R;

import fr.cobaltians.cobalt.fragments.HTMLPullToRefreshFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends HTMLPullToRefreshFragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = super.onCreateView(inflater, container, savedInstanceState);
		//Getting the first web page fromm assets
		this.ressourcePath = "www/";
		if(!webviewContentHasBeenLoaded)
		{
			loadFileContentFromAssets(this.ressourcePath, (this.pageName != null) ? this.pageName : "index.html");
		}
		
		return view;
	}
	
	@Override
	protected int getLayoutToInflate()
	{
		return R.layout.activity_main;
	}
	
	@Override
	public void onStart() {
		super.onStart();
		//Enabling pull to refresh on start
		if (getArguments() == null) {
			enablePullToRefresh();
		}
	}
	
	

	
}
