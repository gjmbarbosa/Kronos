package br.com.kronos.kronos;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.WindowManager;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AddGoalTest {

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
    public void addGoalTest() {
        /*
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button_goal), withText("Goal"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_adicionarMeta), withText("Add New Goal"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editText_metaDescricao), isDisplayed()));
        appCompatEditText.perform(replaceText("lulu"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editText_metaDuracaoHoras), isDisplayed()));
        appCompatEditText2.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editText_metaDuracaoMinutos), isDisplayed()));
        appCompatEditText3.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.editText_metaDuracaoMinutos), withText("9"), isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.editText_metaCategoria), isDisplayed()));
        appCompatEditText5.perform(replaceText("lul"), closeSoftKeyboard());

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.spinner_metaPrazo), isDisplayed()));
        appCompatSpinner.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withText("One week"), isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button_associarAtividades), withText("Connect Activities"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatCheckBox = onView(
                allOf(withId(R.id.checkBox_associarNovaAtividade), isDisplayed()));
        appCompatCheckBox.perform(click());

        ViewInteraction appCompatCheckBox2 = onView(
                allOf(withId(R.id.checkBox_associarNovaAtividade), isDisplayed()));
        appCompatCheckBox2.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.editText_associarNovaAtividade), isDisplayed()));
        appCompatEditText6.perform(replaceText("lul"), closeSoftKeyboard());

        ViewInteraction appCompatCheckBox3 = onView(
                allOf(withId(R.id.checkBox_associarNovaAtividade), isDisplayed()));
        appCompatCheckBox3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button_associarAtividades), withText("Connect Activities"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatCheckBox4 = onView(
                allOf(withId(R.id.chechBox_metaRepetir), withText("Impose Goal just once"), isDisplayed()));
        appCompatCheckBox4.perform(click());

        ViewInteraction imageButton = onView(
                allOf(withId(R.id.imageButton_adicionarMeta), withContentDescription("Add Goal"), isDisplayed()));
        imageButton.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(android.R.id.button1), withText("Cool!"),
                        withParent(allOf(withClassName(is("com.android.internal.widget.ButtonBarLayout")),
                                withParent(withClassName(is("android.widget.LinearLayout"))))),
                        isDisplayed()));
        appCompatButton5.perform(click());
        */
    }

}
