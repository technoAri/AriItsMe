//package com.example.hppc.ariitsme.Objects;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//
//import com.example.hppc.ariitsme.Activities.AboutMeActivity;
//import com.example.hppc.ariitsme.Activities.HomeScreenActivity;
//
///**
// * Created by HP PC on 8/27/2016.
// */
//public class DrawerItemClickListener implements ListView.OnItemClickListener {
//    Context context;
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        selectItem(position);
//    }
//
//    public Context getContext() {
//        return context;
//    }
//
//    private void selectItem(int position) {
//
//
//        switch (position) {
//            case 0:
//                Intent intent = new Intent(getContext(), AboutMeActivity.class);
//                start
//                break;
//            case 1:
//                fragment = new ReadFragment();
//                break;
//            case 2:
//                fragment = new HelpFragment();
//                break;
//
//            default:
//                break;
//        }
//
//        if (fragment != null) {
//            FragmentManager fragmentManager = getFragmentManager();
//            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
//
//            mDrawerList.setItemChecked(position, true);
//            mDrawerList.setSelection(position);
//            getActionBar().setTitle(mNavigationDrawerItemTitles[position]);
//            mDrawerLayout.closeDrawer(mDrawerList);
//
//        } else {
//            Log.e("MainActivity", "Error in creating fragment");
//        }
//    }
//}
