package dto;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.lang.reflect.Method;

public class PageInfo {

    public String city;
    public String state;
    public JSONObject forecast;
    public double latitude;
    public double longitude;

    public PageInfo(String city, String state)
    {
        this.city = city;
        this.state = state;
    }

    public PageInfo(String city, String state, double latitude, double longitude)
    {
        this.city = city;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
