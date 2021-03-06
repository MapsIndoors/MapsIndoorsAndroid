package com.mapsindoors.stdapp.ui.common.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mapsindoors.stdapp.R;

public class FloatButtonFragment extends BaseFragment
{
	@Nullable
	@Override
	public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
		if( mMainView == null ) {
			mMainView = inflater.inflate( R.layout.fragment_float_button_layout, container );
		}
		return mMainView;
	}


	@Override
	public boolean onBackPressed()
	{
		return false;
	}
	//endregion
}