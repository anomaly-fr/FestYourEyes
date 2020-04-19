package com.example.fest;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridSpacing extends RecyclerView.ItemDecoration {
    private int spanCount;
    private int spacing;
    private Boolean includeEdge;

    public GridSpacing(int spanCount, int spacing, Boolean includeEdge) {
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.includeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int column = position % spanCount;
        if(includeEdge) {
            outRect.left = spacing - column * spacing / spanCount;
            outRect.right = (column+1)*spacing/spanCount;
            if(position<spanCount){
                outRect.top = spacing;
            }
            outRect.bottom = spacing;

        }else{
            outRect.left = column*spacing/spanCount;
            outRect.right = spacing - (column+1)*spacing/spanCount;
            if(position>=spanCount){
                outRect.top = spacing;
            }

        }
    }
}
