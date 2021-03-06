package com.youthfireit.ponnobd;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.youthfireit.ponnobd.databinding.ActivityMainBinding;
import com.youthfireit.ponnobd.fragments.HomeFragment;
import com.youthfireit.ponnobd.fragments.LoginFragment;
import com.youthfireit.ponnobd.fragments.RegisterFragment;
import com.youthfireit.ponnobd.fragments.SingleProductFragment;
import com.youthfireit.ponnobd.utills.NavRoutes;


public class MainActivity extends AppCompatActivity implements NavRoutes.HomeFragmentEvents {

    private final static int ID_HOME = 1;
    private final static int ORDERS = 2;
    private final static int CART = 3;
    private final static int ACCOUNT = 4;

    private final HomeFragment HOME = new HomeFragment(this);
    private final LoginFragment LOGIN = new LoginFragment();
    private final RegisterFragment REGISTER = new RegisterFragment();
    //private final SingleProductFragment SINGLE = new SingleProductFragment();
    private Fragment activeFragment, previousFragment;
    //private final HomeFragment HOME = new HomeFragment();

    ActivityMainBinding binding;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);


        activeFragment = HOME;
        previousFragment = HOME;
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        /*fragmentTransaction.add(R.id.fragment_container, HOME,"HOME").hide(HOME).commit();
                fragmentTransaction.add(R.id.fragment_container,LOGIN,"LOGIN").hide(LOGIN).commit();
                fragmentTransaction.add(R.id.fragment_container,REGISTER,"REGISTER").hide(REGISTER).commit();*/


        binding.bottomNav.add(new MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_round_home_24));
        binding.bottomNav.add(new MeowBottomNavigation.Model(ORDERS, R.drawable.ic_round_text_snippet_24));
        binding.bottomNav.add(new MeowBottomNavigation.Model(CART, R.drawable.ic_round_shopping_cart));
        binding.bottomNav.add(new MeowBottomNavigation.Model(ACCOUNT, R.drawable.round_person));


        binding.bottomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

                switch (item.getId()) {
                    case ID_HOME:
                        Toast.makeText(MainActivity.this, "Chumuluku_Home", Toast.LENGTH_SHORT).show();
                        previousFragment = activeFragment;
                        activeFragment = HOME;
                        break;
                    case ORDERS:
                        Toast.makeText(MainActivity.this, "Chumuluku_wishList", Toast.LENGTH_SHORT).show();
                        break;
                    case ACCOUNT:
                        Toast.makeText(MainActivity.this, "Chumuluku_account", Toast.LENGTH_SHORT).show();
                        break;
                    case CART:
                        Toast.makeText(MainActivity.this, "Chumuluku_cart", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        binding.bottomNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                // your codes


            }

        });
        binding.bottomNav.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                // your codes
                switch (item.getId()) {
                    case ID_HOME:
                        Toast.makeText(MainActivity.this, "Home_again", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
        binding.bottomNav.show(ID_HOME, true);

        /*getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,new HomeFragment())
                .commit();*/
        loadFragment();
    }

    void loadFragment() {
        /*fragmentTransaction.replace(R.id.fragment_container, activeFragment).commit();*/
         getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,activeFragment)
                .commit();
    }



    @Override
    public void loadSingleProduct(int id) {
        activeFragment = new SingleProductFragment(id);
        loadFragment();
    }




}