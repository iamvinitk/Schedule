package com.darvin.schedule;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by admin on 27-01-18.
 */

public class TimeLineAdapter extends RecyclerView.Adapter<TimeLineAdapter.TimeLineViewHolder> {
    private List<Object> contents;

    TimeLineAdapter(List<Object> contents) {
        this.contents = contents;

    }

    @Override
    public TimeLineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
        View view = mLayoutInflater.inflate(R.layout.list_item_card_small, parent, false);
        return new TimeLineViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(TimeLineViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    class TimeLineViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.rs_time_marker)
        TimelineView mTimelineView;

        TimeLineViewHolder(View itemView, int viewType) {
            super(itemView);


            ButterKnife.bind(this, itemView);
            mTimelineView.initLine(viewType);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());

    }
}
