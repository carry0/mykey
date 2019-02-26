package com.example.workday.behavior;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SlidingPaneLayout;
import android.util.AttributeSet;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyBehavior extends CoordinatorLayout.Behavior<CircleImageView> {
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull CircleImageView child, @NonNull View dependency) {
        return super.onDependentViewChanged(parent, child, dependency);
    }
}
