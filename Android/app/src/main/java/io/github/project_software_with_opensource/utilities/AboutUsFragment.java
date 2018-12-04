package io.github.project_software_with_opensource.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.project_software_with_opensource.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutUsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutUsFragment extends Fragment {


    private static final String GITHUB_REPO = "https://github.com/saechimdaeki/yogiyocbnu";



    private Context mContext;



    public AboutUsFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AboutUsFragment.
     */
    public static AboutUsFragment newInstance() {
        AboutUsFragment fragment = new AboutUsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.cv_fork)
    public void onForkClicked() {
        Intent viewIntent =
                new Intent(Intent.ACTION_VIEW, Uri.parse(GITHUB_REPO));
        startActivity(viewIntent);
    }





    @OnClick(R.id.cv_share)
    public void onShareClicked() {
        Intent viewIntent =
                new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/saechimdaeki/yogiyocbnu/graphs/contributors?from=2018-11-18&to=2018-12-04&type=c"));
        startActivity(viewIntent);
    }

    @OnClick(R.id.cv_report_bug)
    public void onReportBugClicked() {
        Fragment fragment;
        FragmentManager fragmentManager = getFragmentManager();
        fragment = BugReportFragment.newInstance();
        if (fragment != null && fragmentManager != null) {
            fragmentManager.beginTransaction().addToBackStack(null).replace(R.id.inc, fragment).commit();
        }
    }




    @OnClick(R.id.cv_bmc)
    public void onBuyMeACoffeeClicked() {
        Intent viewIntent =
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gifticon.com/main.do"));
        startActivity(viewIntent);
    }

 
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }
}
