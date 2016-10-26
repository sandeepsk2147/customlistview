package com.example.customlistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter{

	ArrayList<CountryModel> list;
    LayoutInflater inflater;
    ViewHolder holder;
	public CountryAdapter(Context c,ArrayList<CountryModel> list){
		this.list=list;
		inflater = ( LayoutInflater )c.
	            getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub

		View vi = convertView;
	 
	     
	    if(convertView==null){
	         
	        /****** Inflate list_row.xml file for each row ( Defined below ) *******/
	        vi = inflater.inflate(R.layout.list_row, null);
	         
	        /****** View Holder Object to contain list_row.xml file elements ******/

	        holder = new ViewHolder();
	        holder.image = (ImageView) vi.findViewById(R.id.img);
	        holder.countryname=(TextView)vi.findViewById(R.id.tv);
	        
	       /************  Set holder with LayoutInflater ************/
	        vi.setTag( holder );
	    }
	    else 
	        holder=(ViewHolder)vi.getTag();
	   CountryModel m = list.get(position);
	  holder.image.setImageResource(m.getImage());
	  holder.countryname.setText(m.getCountry());
		return vi;
	}

	public static class ViewHolder{
		 
	     public ImageView image;
	     public TextView countryname;
	  
	 }
}
