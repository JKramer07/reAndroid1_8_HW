package com.geek.reandroid1_8_hw.UI.Activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.reandroid1_8_hw.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Model> list;
    private final int WITH_IMAGE = 0;
    private final int WITHOUT_IMAGE = 1;

    public void setList(ArrayList<Model> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        int i = 0;
        if (list.get(position).getType() == "img"){
            i = WITH_IMAGE;
        }else {
            i = WITHOUT_IMAGE;
        }return i;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == WITH_IMAGE){
            View image = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first_image_rv, parent, false);
            return new ViewHolderImg(image);
        }else {
            View nonImage = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first_nonimage_rv, parent, false);
            return new ViewHolder(nonImage);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == WITH_IMAGE){
            ((ViewHolderImg) holder).onBind(list.get(position));
        }else {
            ((ViewHolder) holder).onBind(list.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    private class ViewHolderImg extends ViewHolder {

        private TextView name, secName;
        private ImageView img;
        public ViewHolderImg(View image) {
            super(image);
            name = image.findViewById(R.id.firstNameTv);
            secName = image.findViewById(R.id.firstSecNameTv);
            img = image.findViewById(R.id.firstImageIv);
        }

        public void onBind(Model model) {
            name.setText(model.getName());
            secName.setText(model.getSecName());
            img.setImageResource(model.getImage());
        }
    }

    private class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameS, secNameS;
        public ViewHolder(View nonImage) {
            super(nonImage);
            nameS = nonImage.findViewById(R.id.firstNameSTv);
            secNameS = nonImage.findViewById(R.id.firstSecNameSTv);
        }

        public void onBind(Model model) {
            nameS.setText(model.getName());
            secNameS.setText(model.getSecName());
        }
    }
}
