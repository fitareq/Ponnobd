package com.youthfireit.ponnobd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.youthfireit.ponnobd.databinding.ActivityMainBinding;
import com.youthfireit.ponnobd.fragments.HomeFragment;
import com.youthfireit.ponnobd.fragments.LoginFragment;
import com.youthfireit.ponnobd.fragments.RegisterFragment;
import com.youthfireit.ponnobd.models.ProductImages;
import com.youthfireit.ponnobd.models.Products;
import com.youthfireit.ponnobd.network.APIInstance;
import com.youthfireit.ponnobd.network.PonnobdAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private final static int ID_HOME = 1;
    private final static int WISH_LIST = 2;
    private final static int CART = 3;
    private final static int ACCOUNT = 4;

    private final HomeFragment HOME = new HomeFragment();
    private final LoginFragment LOGIN = new LoginFragment();
    private final RegisterFragment REGISTER = new RegisterFragment();
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

        binding.bottomNav.add(new MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_outline_home));
        binding.bottomNav.add(new MeowBottomNavigation.Model(WISH_LIST, R.drawable.ic_outline_favorite));
        binding.bottomNav.add(new MeowBottomNavigation.Model(ACCOUNT, R.drawable.ic_outline_account_circle));
        binding.bottomNav.add(new MeowBottomNavigation.Model(CART,R.drawable.ic_outline_shopping_cart));

        binding.bottomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

                switch (item.getId()){
                    case ID_HOME:
                        Toast.makeText(MainActivity.this, "Chumuluku_Home", Toast.LENGTH_SHORT).show();
                        previousFragment = activeFragment;
                        activeFragment = HOME;
                        break;
                    case WISH_LIST:
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

    void loadFragment()
    {
        fragmentTransaction.replace(R.id.fragment_container,activeFragment).commit();
    }

}