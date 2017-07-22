package com.app.softdrive.practica1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.softdrive.practica1.R;
import com.app.softdrive.practica1.Usuario;

import java.util.ArrayList;

/**
 * Created by Pedro Sosa on 15/07/2017.
 */

public class UsersAdapter  extends ArrayAdapter<Usuario>{
    public UsersAdapter(Context context, ArrayList<Usuario> objects) {
        super(context,0,objects);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        Usuario user=getItem(position);
        if(convertView==null) {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

       TextView Tvname=(TextView)convertView.findViewById(R.id.title);
        TextView TvAddress=(TextView)convertView.findViewById(R.id.sub);
        Tvname.setText(user.name);
        TvAddress.setText(user.address);
        return convertView;
    }
}
