package com.example.baseactivitydemo;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 初始化布局
		setContentView();

		// 初始化头部
		initTitle();

		// 初始化界面
		initView();

		// 初始化数据
		initData();
	}

	abstract protected void initData();

	abstract protected void initView();

	abstract protected void initTitle();

	abstract protected void setContentView();
}
