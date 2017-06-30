package com.example.admin.itdepartment.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.admin.itdepartment.R;

import butterknife.ButterKnife;



public class ResourcesActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        ButterKnife.bind(this);
    }

    public void ibutton1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afshan.kaleem"));
        startActivity(browserIntent);
    }
    public void ibutton2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=alefiah.mubeen"));
        startActivity(browserIntent);
    }
    public void ibutton3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arifhussain"));
        startActivity(browserIntent);
    }
    public void ibutton4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asia.sultana"));
        startActivity(browserIntent);
    }
    public void ibutton5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asrar.ahmed"));
        startActivity(browserIntent);
    }
    public void ibutton6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=farha"));
        startActivity(browserIntent);
    }
    public void ibutton7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=g.vani"));
        startActivity(browserIntent);
    }
    public void ibutton8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=himayat.sharief"));
        startActivity(browserIntent);
    }
    public void ibutton9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=k.ramu"));
        startActivity(browserIntent);
    }
    public void ibutton10 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=marasheed"));
        startActivity(browserIntent);
    }

    public void ibutton11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=venkata.prasad"));
        startActivity(browserIntent);
    }

    public void ibutton12 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manizahijab"));
        startActivity(browserIntent);
    }

    public void ibutton13 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdibrahim"));
        startActivity(browserIntent);
    }

    public void ibutton14 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdulwajid"));
        startActivity(browserIntent);
    }
    public void ibutton15 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdafroze"));
        startActivity(browserIntent);
    }

    public void ibutton16 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdpasha"));
        startActivity(browserIntent);
    }
    public void ibutton17 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=riyaz"));
        startActivity(browserIntent);
    }
    public void ibutton18 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sarfaraz.ahmed"));
        startActivity(browserIntent);
    }
    public void ibutton19 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=tahaseen"));
        startActivity(browserIntent);
    }
    public void ibutton20 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jubairbasha"));
        startActivity(browserIntent);
    }
    public void ibutton21 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hajera"));
        startActivity(browserIntent);
    }
    public void ibutton22 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shaikrasool"));
        startActivity(browserIntent);
    }
    public void ibutton23 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syedazarali"));
        startActivity(browserIntent);
    }

    public void ibutton24 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=fouzia"));
        startActivity(browserIntent);
    }
    public void ibutton25 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=uma.dulhare"));
        startActivity(browserIntent);
    }
}
