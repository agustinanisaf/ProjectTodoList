package pens.lab.app.belajaractivity.modul.sharetask;

import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ShareTaskActivity extends BaseFragmentHolderActivity {
    ShareTaskFragment shareTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        shareTaskFragment = new ShareTaskFragment();
        String id = getIntent().getExtras().getString("TaskId");
        shareTaskFragment.setId(id);
        setCurrentFragment(shareTaskFragment, false);
    }
}
