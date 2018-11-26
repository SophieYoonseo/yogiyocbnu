package io.github.project_software_with_opensource.destinations.funfacts;

import java.util.ArrayList;

import objects.FunFact;

/**
 * Created by niranjanb on 14/06/17.
 */

interface FunFactsView {
    void showProgressDialog();
    void hideProgressDialog();
    void setupViewPager(ArrayList<FunFact> factsArray);
}
