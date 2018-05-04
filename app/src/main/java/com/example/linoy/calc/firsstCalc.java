package com.example.linoy.calc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import android.view.View.OnTouchListener;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FirstOnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link firsstCalc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class firsstCalc extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    String optr;
    //    int num2, num1;
    double num1, num2;
    private Button one;
    private Button zero;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button divide;
    private Button multiple;
    private Button add;
    private Button subtraction;
    private Button result;
    private Button clean;
    private TextView display;
    private String str="";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private FirstOnFragmentInteractionListener mListener;

    public firsstCalc() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment firsstCalc.
     */
    // TODO: Rename and change types and number of parameters
    public static firsstCalc newInstance(String param1, String param2) {
        firsstCalc fragment = new firsstCalc();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_firsst_calc, container, false);
        zero = (Button) view.findViewById(R.id.button0);
        one = (Button) view.findViewById(R.id.button1);
        two = (Button) view.findViewById(R.id.button2);
        three = (Button) view.findViewById(R.id.button3);
        four = (Button) view.findViewById(R.id.button4);
        five = (Button) view.findViewById(R.id.button5);
        six = (Button) view.findViewById(R.id.button6);
        seven = (Button) view.findViewById(R.id.button7);
        eight = (Button) view.findViewById(R.id.button8);
        nine = (Button) view.findViewById(R.id.button9);
        divide = (Button) view.findViewById(R.id.button_division);
        multiple = (Button) view.findViewById(R.id.button_double);
        add = (Button) view.findViewById(R.id.button_plus);
        subtraction = (Button) view.findViewById(R.id.button_minus);
        result = (Button) view.findViewById(R.id.button_result);
        clean = (Button) view.findViewById(R.id.clean);
        display = (TextView) view.findViewById(R.id.textView);


        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                num1 = num2 = 0;
                display.setText("");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              result.setText(result.getText().toString() + "0");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += zero.getText().toString();
                display.setText(str);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "1");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += one.getText().toString();
                display.setText(str);

            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "2");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += two.getText().toString();
                display.setText(str);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "3");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += three.getText().toString();
                display.setText(str);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "4");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += four.getText().toString();
                display.setText(str);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "5");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += five.getText().toString();
                display.setText(str);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "6");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += six.getText().toString();
                display.setText(str);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "7");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += seven.getText().toString();
                display.setText(str);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "8");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += eight.getText().toString();
                display.setText(str);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(result.getText().toString() + "9");
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                str += nine.getText().toString();
                display.setText(str);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "+";
                if (num1 == 0) {
                    num1 = Integer.parseInt(display.getText().toString());
                    display.setText(num1 + "+");
                    str = "";
                } else if (num1 != 0) {
                    num1 = 0;
                    display.setText("");
                    str = "";
                } else {
                    num2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    str = "";
                    num1 = num1 + num2;
//                    display.setText(Integer.toString(num1));
                    display.setText(Double.toString(num1));
                }

            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "-";
                if (num1 == 0) {
                    num1 = Integer.parseInt(display.getText().toString());
                    display.setText(num1 + "-");
                    str = "";
                } else if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                    str = "";
                } else {
                    num2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    str = "";
                    num1 = num1 - num2;
//                    display.setText(Integer.toString(num1));
                    display.setText(Double.toString(num1));
                }

            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "*";
                if (num1 == 0) {
                    num1 = Integer.parseInt(display.getText().toString());
                    display.setText(num1 + "*");
                    str = "";

                } else if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                    str = "";
                } else {
                    num2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    str = "";
                    num1 = num1 * num2;
//                    display.setText("Result : " + Integer.toString(num1));
                    display.setText(Double.toString(num1));
                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optr = "/";
                if (num1 == 0) {
                    num1 = Integer.parseInt(display.getText().toString());
                    display.setText(num1 + "/");
                    str = "";
                } else if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                    str = "";
                } else {
                    num2 = Integer.parseInt(display.getText().toString());
                    display.setText("");
                    str = "";
                    num1 = (num1 / num2);

//                    display.setText("Result : " + Integer.toString(num1));
                    display.setText(Double.toString(num1));
                }

            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!optr.equals(null)) {
                    if (num2 != 0) {
                        if (optr.equals("+")) {
                            display.setText(""); /*op1 = op1 + op2;*/
//                    display.setText("Result : " + Integer.toString(num1));
                            display.setText(Double.toString(num1));
                        } else if (optr.equals("-")) {
                            display.setText("");/* op1 = op1 - op2;*/
//                    display.setText("Result : " + Integer.toString(num1));
                            display.setText(Double.toString(num1));
                        } else if (optr.equals("*")) {
                            display.setText("");/* op1 = op1 * op2;*/
//                    display.setText("Result : " + Integer.toString(num1));
                            display.setText(Double.toString(num1));
                        } else if (optr.equals("/")) {
                            display.setText("");/* op1 = op1 / op2;*/
                            display.setText(Double.toString(num1));
//                    display.setText("Result : " + Integer.toString(num1));
                        }
                    } else {
                        operation();
                    }
                }

            }

        });
        view.setOnTouchListener(new OnSwipeTouchListener(getActivity()) {
            @Override
            public void onClick() {
                super.onClick();
                Toast.makeText(getActivity(),"on click", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDoubleClick() {
                super.onDoubleClick();
                Toast.makeText(getActivity(),"on Doubleclick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick() {
                super.onLongClick();
                Toast.makeText(getActivity(),"on Longclick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeUp() {
                super.onSwipeUp();
                Toast.makeText(getActivity(),"on UPclick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeDown() {
                super.onSwipeDown();
                Toast.makeText(getActivity(),"on DOWNclick", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Toast.makeText(getActivity(),"on LEFTclick", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Toast.makeText(getActivity(),"on RIGHTclick", Toast.LENGTH_SHORT).show();
                move_f();
            }
        });

        return view;
    }




    public void operation(){
        if(optr.equals("+"))
        {
            num2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            str = ""; //ADDED
            num1 = num1 + num2;
            display.setText(Double.toString(num1));
//            display.setText("Result : " + Integer.toString(num1));
        }
        else if(optr.equals("-"))
        {
            num2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            str = ""; //ADDED
            num1 = num1 - num2;
//            display.setText("Result : " + Integer.toString(num1));
            display.setText(Double.toString(num1));
        }
        else if(optr.equals("*"))
        {
            num2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            str = ""; //ADDED
            num1 = num1 * num2;
//            display.setText("Result : " + Integer.toString(num1));
            display.setText( Double.toString(num1));
        }
        else if(optr.equals("/"))
        {
            num2 = Integer.parseInt(display.getText().toString());
            display.setText("");
            str = ""; //ADDED
            num1 = num1 / num2;
//            display.setText("Result : " + Integer.toString(num1));
            display.setText( Double.toString(num1));
        }
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
        if (context instanceof FirstOnFragmentInteractionListener) {
            mListener = (FirstOnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement FirstOnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public void move_f()
    {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.LoadSecFragment();


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
    public interface FirstOnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
