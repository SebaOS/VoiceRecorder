package com.example.voicerecorder;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;

public class AudioListAdapter extends RecyclerView.Adapter<AudioListAdapter.AudioViewHolder> {

    private File[] allFiles;

    public AudioListAdapter(File[] allFiles) {
        this.allFiles = allFiles;
    }

    @NonNull
    @Override
    public AudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AudioViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return allFiles.length;
    }

    public class AudioViewHolder extends RecyclerView.ViewHolder{
        public AudioViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
