package br.com.kronos.kronos;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MyDayAddOneDayTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        final MainActivity activity = mActivityTestRule.getActivity();
        Runnable wakeUpDevice = new Runnable() {
            public void run() {
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON |
                        WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                        WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            }
        };
        activity.runOnUiThread(wakeUpDevice);
    }


    @Test
    public void myDayAddOneDayTest() {
        /*
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button_myDay), withText("My Day"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_adicionar_atividdade), withText("+ Add a new Activity"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.spinner_atividade_horas),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(android.R.id.text1), withText("6"), isDisplayed()));
        appCompatCheckedTextView.perform(click());

        ViewInteraction appCompatSpinner2 = onView(
                allOf(withId(R.id.spinner_atividade_minuto),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatSpinner2.perform(click());

        ViewInteraction appCompatCheckedTextView2 = onView(
                allOf(withId(android.R.id.text1), withText("0"), isDisplayed()));
        appCompatCheckedTextView2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("0"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("1"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("2"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("3"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("4"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatCheckBox = onView(
                allOf(withId(R.id.checkBox_inserir_grafico),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                1)),
                        isDisplayed()));
        appCompatCheckBox.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button_adicionar_atividdade), withText("+ Add a new Activity"), isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatSpinner3 = onView(
                allOf(withId(R.id.spinner_atividade_horas),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                2)),
                        isDisplayed()));
        appCompatSpinner3.perform(click());

        ViewInteraction appCompatCheckedTextView3 = onView(
                allOf(withId(android.R.id.text1), withText("8"), isDisplayed()));
        appCompatCheckedTextView3.perform(click());

        ViewInteraction appCompatSpinner4 = onView(
                allOf(withId(R.id.spinner_atividade_minuto),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                2)),
                        isDisplayed()));
        appCompatSpinner4.perform(click());

        ViewInteraction appCompatCheckedTextView4 = onView(
                allOf(withId(android.R.id.text1), withText("0"), isDisplayed()));
        appCompatCheckedTextView4.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("0"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                2)),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatCheckBox2 = onView(
                allOf(withId(R.id.checkBox_inserir_grafico),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                2)),
                        isDisplayed()));
        appCompatCheckBox2.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.button_adicionar_atividdade), withText("+ Add a new Activity"), isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatSpinner5 = onView(
                allOf(withId(R.id.spinner_atividade_horas),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                3)),
                        isDisplayed()));
        appCompatSpinner5.perform(click());

        ViewInteraction appCompatCheckedTextView5 = onView(
                allOf(withId(android.R.id.text1), withText("4"), isDisplayed()));
        appCompatCheckedTextView5.perform(click());

        ViewInteraction appCompatSpinner6 = onView(
                allOf(withId(R.id.spinner_atividade_minuto),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                3)),
                        isDisplayed()));
        appCompatSpinner6.perform(click());

        ViewInteraction appCompatCheckedTextView6 = onView(
                allOf(withId(android.R.id.text1), withText("0"), isDisplayed()));
        appCompatCheckedTextView6.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("0"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                3)),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("1"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                3)),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatCheckBox3 = onView(
                allOf(withId(R.id.checkBox_inserir_grafico),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                3)),
                        isDisplayed()));
        appCompatCheckBox3.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.button_adicionar_atividdade), withText("+ Add a new Activity"), isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatSpinner7 = onView(
                allOf(withId(R.id.spinner_atividade_horas),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatSpinner7.perform(click());

        ViewInteraction appCompatCheckedTextView7 = onView(
                allOf(withId(android.R.id.text1), withText("6"), isDisplayed()));
        appCompatCheckedTextView7.perform(click());

        ViewInteraction appCompatSpinner8 = onView(
                allOf(withId(R.id.spinner_atividade_minuto),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatSpinner8.perform(click());

        ViewInteraction appCompatCheckedTextView8 = onView(
                allOf(withId(android.R.id.text1), withText("0"), isDisplayed()));
        appCompatCheckedTextView8.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("0"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("1"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.button_atividade_qualidade), withText("2"),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction appCompatCheckBox4 = onView(
                allOf(withId(R.id.checkBox_inserir_grafico),
                        withParent(childAtPosition(
                                withId(R.id.listView_atividades),
                                4)),
                        isDisplayed()));
        appCompatCheckBox4.perform(click());
        */

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
