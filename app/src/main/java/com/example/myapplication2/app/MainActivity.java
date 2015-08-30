package com.example.myapplication2.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);


        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Section 1");
        listDataHeader.add("Section 2");
        listDataHeader.add("Section 3");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nisi nisl, tempor ac libero vitae, posuere iaculis massa. Suspendisse potenti. Vestibulum a ultricies augue, nec auctor nisi. Aliquam lectus ante, tempus sed tortor eu, rutrum pulvinar neque. Integer at arcu in mauris vehicula convallis. Curabitur luctus metus in lorem bibendum, vel tempus magna tincidunt. Praesent eget imperdiet erat. Cras lobortis velit sit amet eros hendrerit, vitae sollicitudin urna dapibus. Vivamus mattis porta nulla ac tincidunt. Donec venenatis sagittis arcu, sed volutpat lectus interdum at. Nam vitae nisi dui. Vivamus nec elit tincidunt, lacinia metus a, dignissim neque. Nullam convallis imperdiet congue. Etiam rutrum maximus congue. Aliquam erat volutpat.");
        top250.add("Donec efficitur dignissim arcu vitae convallis. Quisque eu risus sed nisi aliquam interdum. Quisque tincidunt tempor tellus, quis semper tortor rutrum eget. Proin pretium convallis massa eget lobortis. Curabitur vitae eleifend dolor. Sed sit amet lorem non nisl pharetra egestas. Etiam porttitor quis turpis sed mollis. In ac rhoncus mauris. Sed libero neque, mattis ut consectetur vel, euismod tristique mi. In vulputate rutrum erat eget pulvinar. Aliquam consectetur gravida sem vitae ultrices. Suspendisse a efficitur urna. Proin nec blandit dui. Donec quis nulla convallis, ultrices quam id, scelerisque eros. Nulla venenatis nisl erat. Mauris hendrerit ornare porta.");
        top250.add("Vestibulum tempor facilisis urna in posuere. Cras in accumsan felis. Duis quis augue urna. Curabitur sollicitudin pretium magna, ac commodo magna sollicitudin in. Integer vestibulum elit sit amet urna euismod pulvinar. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec non orci sed lorem suscipit imperdiet. Ut eu nulla lectus. Integer ultrices, mauris et condimentum consequat, felis risus interdum arcu, aliquet tincidunt leo urna vitae enim. Morbi hendrerit in magna ut pellentesque. Morbi semper, diam varius hendrerit blandit, massa metus ullamcorper dolor, a placerat nulla nulla ullamcorper purus. Sed ullamcorper et quam vitae mattis. Sed magna ante, consequat non enim sed, consequat efficitur dolor. Duis semper mauris quis felis convallis blandit. Suspendisse lacus tortor, aliquam ut enim nec, rutrum mattis nibh. Nulla facilisi.");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Donec eleifend laoreet quam, eu tristique turpis lacinia a. Donec est dolor, ultrices non molestie a, consequat quis velit. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer non quam nec enim pulvinar cursus. Nulla viverra ac tortor eget euismod. Morbi lobortis quis est quis pretium. Etiam magna velit, imperdiet ut tincidunt nec, pharetra quis ex. Nam accumsan consequat sem. Etiam mattis varius massa sit amet sodales. Suspendisse euismod, augue eget hendrerit interdum, mauris tortor consequat lacus, vitae euismod purus neque vitae ante. Donec mauris nisl, sodales sit amet porta sit amet, tincidunt id metus. Ut mi diam, iaculis a pellentesque sit amet, volutpat eget augue. Duis in nulla sit amet mi tempor dapibus malesuada ac ex.");
        nowShowing.add("Vestibulum scelerisque nisi sed sollicitudin mattis. Morbi dapibus pharetra pretium. Quisque consectetur efficitur feugiat. Duis luctus, massa id dictum varius, nibh nulla egestas eros, quis ultricies sem purus sed felis. Quisque dignissim finibus enim in eleifend. Nunc et erat commodo nisi pulvinar dignissim vitae at sapien. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec urna nisl, imperdiet vel accumsan sed, fringilla eu est. Quisque consequat faucibus purus, vel imperdiet nunc facilisis et. Pellentesque magna nisi, aliquet nec elit posuere, pulvinar interdum risus. In et viverra neque. Suspendisse consequat maximus dui ac faucibus. Vestibulum scelerisque feugiat nisl, ac vestibulum purus tristique at. Donec a leo nec velit tincidunt dictum quis et tortor. Praesent cursus pellentesque ante. Praesent quis lacus gravida, cursus leo placerat, mollis felis.");


        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("aaaaaaaa");
        comingSoon.add("bbbbbbb");
        comingSoon.add("cccccc");
        comingSoon.add("ddddddd");
        comingSoon.add("eee");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
