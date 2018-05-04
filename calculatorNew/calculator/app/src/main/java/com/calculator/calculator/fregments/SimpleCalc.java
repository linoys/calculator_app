package com.calculator.calculator.fregments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.calculator.calculator.R;
import com.calculator.calculator.activity.MainActivity;
import com.calculator.calculator.classes.OnSwipeTouchListener;
import com.calculator.calculator.classes.calculator;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SimpleCalc.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SimpleCalc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleCalc extends  android.support.v4.app.Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private  TextView text;
    private  calculator move ;
    private String str  ;
    private Button numberOne ;
    private Button numberTwo ;
    private Button numberThree ;
    private Button numberFour;
    private Button numberFive ;
    private Button numberSix ;
    private Button numberSeven ;
    private Button numberEight ;
    private Button numberNine ;
    private Button numberZero ;
    private Button point ;
    private Button equal ;
    private Button plus ;
    private Button minus ;
    private Button division ;
    private Button multiplication;
    private Button reset ;

    private OnFragmentInteractionListener mListener;


    public SimpleCalc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SimpleCalc.
     */
    // TODO: Rename and change types and number of parameters
    public static SimpleCalc newInstance(String param1, String param2) {
        SimpleCalc fragment = new SimpleCalc();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_simple_calc, container, false);
        final Animation Myanim = AnimationUtils.loadAnimation(getContext() ,R.anim.shake );
        text = (TextView) view.findViewById(R.id.textView);
        this.move = new calculator(text);
        Button numberOne = (Button) view.findViewById(R.id.buttonOne);
        Button numberTwo = (Button) view.findViewById(R.id.buttonTwo);
        Button numberThree = (Button) view.findViewById(R.id.buttonThree);
        Button numberFour = (Button) view.findViewById(R.id.buttonFour);
        Button numberFive = (Button) view.findViewById(R.id.buttonFive);
        Button numberSix = (Button) view.findViewById(R.id.buttonSix);
        Button numberSeven = (Button) view.findViewById(R.id.buttonSeven);
        Button numberEight = (Button) view.findViewById(R.id.buttonEight);
        Button numberNine = (Button) view.findViewById(R.id.buttonNine);
        Button numberZero = (Button) view.findViewById(R.id.buttonZero);
        Button point = (Button) view.findViewById(R.id.buttonPoint);
        Button equal = (Button) view.findViewById(R.id.buttonEqual);
        Button plus = (Button) view.findViewById(R.id.buttonPlus);
        Button minus = (Button) view.findViewById(R.id.buttonMinus);
        Button division = (Button) view.findViewById(R.id.buttonDivision);
        Button multiplication = (Button) view.findViewById(R.id.buttonMultiplication);
        Button reset = (Button) view.findViewById(R.id.resetBtn);

        numberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);
            }

        });

        numberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        numberZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onClick(v);

            }

        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onSign(v);

            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onSign(v);

            }

        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onSign(v);

            }

        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.onSign(v);

            }

        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move.result (v);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                move.delete(v);
            }
        });

        view.setOnTouchListener(new OnSwipeTouchListener(getActivity()) {

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Toast.makeText(getActivity(),"on RIGHTclick", Toast.LENGTH_SHORT).show();
                move_f();
            }




        });

        return view;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private void move_f() {

        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.LoadSecFragment(mParam1,mParam2);
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
