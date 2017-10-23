package com.example.erza.bookingapp.main.fragments.authenticationFragment.authenticationFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.erza.bookingapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AuthenticationFragment  extends Fragment{
    @BindView(R.id.loginInputText) EditText login;
    @BindView(R.id.passwordInputText) EditText password;

    public AuthenticationPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.authentication_fragment, container, false);
        ButterKnife.bind(this, view);
        presenter = new AuthenticationPresenter();
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
