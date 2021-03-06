package com.dk.mp.core.ui;


import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dk.mp.core.util.CoreSharedPreferencesHelper;
import com.dk.mp.core.util.SnackBarUtil;
import com.google.gson.Gson;

/**
 * 作者：janabo on 2017/1/4 14:27
 */
public abstract class BaseFragment extends BaseLazyFragment {
    protected View mRootView;
    private Gson gson;
    private CoreSharedPreferencesHelper preference;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate ( getLayoutId ( ), null );
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize (view);
    }

    protected void initialize (View view) {}

    //布局ID
    protected abstract
    @LayoutRes
    int getLayoutId ( );

    @Override
    public void onFirstUserVisible ( ) {
        super.onFirstUserVisible ( );
    }

    @Override
    public void onUserVisible ( ) {
        super.onUserVisible ( );
    }

    public Gson getGson() {
        if (gson == null){
            gson = new Gson();
        }
        return gson;
    }

    public void showErrorMsg(View v,String msg){
        SnackBarUtil.showShort(v,msg);
    }

    public CoreSharedPreferencesHelper getSharedPreferences() {
        if (preference == null){
            preference = new CoreSharedPreferencesHelper(this.getContext());
        }
        return preference;
    }

    /**
     * 获取string
     * @param string R.string.x
     * @return  ""
     */
    public String getReString(int string) {
        return getResources().getString(string);
    }

}
