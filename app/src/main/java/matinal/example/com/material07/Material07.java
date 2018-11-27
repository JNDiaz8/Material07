package matinal.example.com.material07;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Material07 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material07);

        final TabLayout  tabLayout = findViewById(R.id.tabLayout);

        final TabLayout.Tab PRIMERO = tabLayout.newTab();
        TabLayout.Tab SEGUNDO = tabLayout.newTab();
        TabLayout.Tab TERCERO = tabLayout.newTab();

        PRIMERO.setText("PRIMERO");
        PRIMERO.setIcon(R.drawable.icono_primero);
        tabLayout.addTab(PRIMERO);

        SEGUNDO.setText("SEGUNDO");
        SEGUNDO.setIcon(R.drawable.icono_segundo);
        tabLayout.addTab(SEGUNDO);

        TERCERO.setText("TERCERO");
        TERCERO.setIcon(R.drawable.icono_tercero);
        tabLayout.addTab(TERCERO);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragmento = null;
                switch (tab.getPosition()){

                    case 0:
                        fragmento = new Primero();
                        break;

                    case 1:
                        fragmento = new Segundo();
                        break ;

                    case 2:
                        fragmento = new Tercero();
                        break ;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
