package com.example.mobileinfopariwista_vannesyanuarta;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.List;

public class PariwisataAdapter extends RecyclerView.Adapter<PariwisataAdapter.PariwisataViewHolder> implements Filterable {
    private List<PariwisataModel> pariwisataList;
    private List<PariwisataModel> pariwisataListFull;

    public PariwisataAdapter(List<PariwisataModel> pariwisataList) {
        this.pariwisataList = pariwisataList;
        this.pariwisataListFull = new ArrayList<>(pariwisataList);
    }

    @NonNull
    @Override
    public PariwisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pariwisata, parent, false);
        return new PariwisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PariwisataViewHolder holder, int position) {
        PariwisataModel currentItem = pariwisataList.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.titleTextView.setText(currentItem.getTitle());
        holder.locationTextView.setText(currentItem.getLocation());
        holder.descriptionTextView.setText(currentItem.getDescription());

        // OnClickListener untuk item
        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("imageRes", currentItem.getImage());
            intent.putExtra("title", currentItem.getTitle());
            intent.putExtra("location", currentItem.getLocation());
            intent.putExtra("description", currentItem.getDescription());
            intent.putExtra("openingHours", currentItem.getOpeningHours()); // Tambahkan info jam buka
            intent.putExtra("openingDays", currentItem.getOpeningDays());   // Tambahkan info hari buka
            intent.putExtra("additionalText", currentItem.getAdditionalText()); // Tambahkan teks tambahan
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return pariwisataList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<PariwisataModel> filteredList = new ArrayList<>();
                if (constraint == null || constraint.length() == 0) {
                    filteredList.addAll(pariwisataListFull);
                } else {
                    String filterPattern = constraint.toString().toLowerCase().trim();
                    for (PariwisataModel item : pariwisataListFull) {
                        if (item.getTitle().toLowerCase().contains(filterPattern) ||
                                item.getLocation().toLowerCase().contains(filterPattern)) {
                            filteredList.add(item);
                        }
                    }
                }

                FilterResults results = new FilterResults();
                results.values = filteredList;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                pariwisataList.clear();
                pariwisataList.addAll((List) results.values);
                notifyDataSetChanged();
            }
        };
    }

    public static class PariwisataViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;
        TextView locationTextView;
        TextView descriptionTextView;

        public PariwisataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}
