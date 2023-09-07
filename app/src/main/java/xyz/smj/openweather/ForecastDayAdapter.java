package xyz.smj.openweather;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.LocalDate;
import java.util.ArrayList;

import xyz.smj.openweather.entities.Forecastday;

public class ForecastDayAdapter extends ArrayAdapter<Forecastday> {
    ArrayList<Forecastday> data;

    TextView dayTV;
    TextView dateTV;
    TextView dayHighTempTV;
    TextView dayLowTempTV;

    public ForecastDayAdapter(ArrayList<Forecastday> data, Context context) {
        super(context, R.layout.daily_forecast_item, data);
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Forecastday forecastday = getItem(position);


        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.daily_forecast_item, parent, false);

            dayTV = convertView.findViewById(R.id.dayTV);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                dayTV.setText(LocalDate.parse(forecastday.getDate()).getDayOfWeek().toString());
            }

            dateTV = convertView.findViewById(R.id.dateTV);
            dateTV.setText(forecastday.getDate());


            dayHighTempTV = convertView.findViewById(R.id.dayHighTempTV);
            dayHighTempTV.setText(forecastday.getDay().getMaxtempC().toString()+" C");
            dayLowTempTV = convertView.findViewById(R.id.dayLowTempTV);
            dayLowTempTV.setText(forecastday.getDay().getMintempC().toString()+" C");
        }
        return convertView;
    }
}
