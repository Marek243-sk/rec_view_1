package sk.tuke.rec_view_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DbRecycleViewAdapter extends RecyclerView.Adapter<DbRecycleViewAdapter.MyViewHolder> {
    private final RecycleViewInterface recycleViewInterface;

    Context context;
    ArrayList<DbModel> dbModels;

    public DbRecycleViewAdapter(Context context, ArrayList<DbModel> dbModels, RecycleViewInterface recycleViewInterface) {
        this.context = context;
        this.dbModels = dbModels;
        this.recycleViewInterface =recycleViewInterface;
    }
    @NonNull
    @Override
    public DbRecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_viwe_row, parent, false);
        return new DbRecycleViewAdapter.MyViewHolder(view, recycleViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull DbRecycleViewAdapter.MyViewHolder holder, int position) {
        holder.tvName.setText(dbModels.get(position).getIconName());
        holder.tv3Letter.setText(dbModels.get(position).getIconName3());
        holder.tv1Letter.setText(dbModels.get(position).getIconName1());
        holder.imageView.setImageResource(dbModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dbModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tv3Letter, tv1Letter;
        public MyViewHolder(@NonNull View itemView, RecycleViewInterface recycleViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tv3Letter = itemView.findViewById(R.id.textView2);
            tv1Letter = itemView.findViewById(R.id.textView3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recycleViewInterface != null) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            recycleViewInterface.onItemClick(pos);
                        }
                    }
                }
            });

        }
    }
}
