package cn.iam007.tabularasa;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;

import org.wordpress.android.editor.EditorFragmentAbstract;
import org.wordpress.android.editor.LegacyEditorFragment;
import org.wordpress.android.util.helpers.MediaFile;

import cn.iam007.tabularasa.ui.editor.EditorFragment;

/**
 * Created by Administrator on 2015/6/25.
 */
public class JiangerjiTest extends AppCompatActivity implements
        EditorFragmentAbstract.EditorFragmentListener {
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_edit_post_activity);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    EditorFragmentAbstract mEditorFragment;

    @Override
    public void onEditorFragmentInitialized() {

    }

    @Override
    public void onSettingsClicked() {

    }

    @Override
    public void onAddMediaClicked() {

    }

    @Override
    public void saveMediaFile(MediaFile mediaFile) {

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            Fragment fragment = null;
            switch (position) {
                case 0:
                    // TODO: switch between legacy and new editor here (AB test?)
                    fragment = new LegacyEditorFragment();
                    break;
                case 1:
                    fragment = new EditorFragment();
                    break;
            }

            Log.d("haha", "getItem:" + position + " " + fragment);
            return fragment;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            Fragment fragment = (Fragment) super.instantiateItem(container, position);
            switch (position) {
                case 0:
                    mEditorFragment = (EditorFragmentAbstract) fragment;
                    break;
            }

            Log.d("haha", "instantiateItem:" + position + " " + fragment);
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }
    }
}
