package com.example.pdacollege;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class MechanicaActivity extends AppCompatActivity {
    TextView text1,text7,text8,text9,text10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanica);
        text1=findViewById(R.id.text1);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);
        text9=findViewById(R.id.text9);
        text10=findViewById(R.id.text10);
        String text= "As Mechanical Engineering department is one of the first ever departments established in 1958 by the great visionary, Educationist and statesman late Sri. Mahadevappa Rampure founder president of HKE Society with an intake of 40 students. The department is equipped with all necessary infrastructure and laboratory facilities. Present intake of department is 120 with total of 450 students studying in I, II, III and IV year. In accordance with the Vision and Mission, the department is striving hard to cater the needs of Mechanical Engineering students both in curriculum and career oriented progress and achieving excellence in various aspects such as students performance and quality, student teacher relationship, and students motivation towards research oriented aspects. Department behold for discipline among student community by adopting good human qualities and professional ethics, moral. Department has well qualified dedicated, expert faculty in UG-23, PG-06 and supporting staff-40, have 6(six) Doctorates 42 research scholars are pursuing their Ph.D.\n" +
                "\n" +
                "Our department has centralized facilities mainly Central workshop, CAED lab in which the students of all the branches get trained basics of mechanical engineering science and basics of engineering drawing. Fluid mechanics and fluid machines lab, Dynamics of machines lab, Material science and Metallurgical Testing lab, Instrumentation and metrology lab are being used by the students of Automobile Engineering, Industrial and Production engineering and Ceramic Engineering students.\n" +
                "\n" +
                "Internal Combustion engines laboratory caters to the needs of research scholars, working in the area of IC Engines and Alternate fuels. This is the only centre in Karnataka having this facility.\n" +
                "\n" +
                "The department is also equipped with a state of art “Centre of competence in Automation Technology” established in collaboration with Bosch-Rexorth(India). The centre has Hydraulic and Pneumatic test rigs, PLC programming facilities, Mechatronics system and station. The centre is known for its excellent training programmmes for the students of Engineering, Polytechnic and ITIs. The centre has trained more than 800 students in this field since 2013, the year of its establishment.\n" +
                "\n" +
                "The center pillar of the department is its curricula and the faculty. The faculty and staff of the department made remarkable strides by involving themselves in academic activities like conducting various Faculty development program, Workshops, Seminars and Industry- Institute-Interaction programs. The workshops and seminars are sponsored by TEQIP- II. Some of the faculty of the department worked as resource persons for workshops and delivered their technical sessions in various Engineering and Diploma colleges and in professional society like Institute of Engineers.\n" +
                "\n" +
                "The department curricula meet the industry requirements. Department holds some of the cutting edge technology labs namely CNC Milling machine, Non-destructive testing lab. Department has Two M tech Programs: Thermal power Engineering established in the year 1982, and Production Engineering in the year 1994. Department is recognized as Research Centre by Visvesvaraya Technological University Belagavi in the year 2005 and at present 01 candidate awarded PhD, 01 submitted. Research centre is carrying on with its activities. Department frequently organizes many student centric activities like Soft Skill Development programs, Quizzes, Plickers, debate, sports etc under the Students Association “PIONEERS” . The asset of the department is its Alumni. Department Alumni contributes their ideas and suggestion in framing curricula with respect to industry advancements. Alumni are well placed in private and public sectors across the globe and some of them emerged as entrepreneurs.\n" +
                "\n" +
                "The corner stone of the Department is its Industry Institute Interaction Programs. Department has signed MoU with various industries and institutions like KGTTI, Kalaburagi, CANTER CAD, CADD Center, CADMAX, M/S Ductile Iron Works Belgavi, ALSTOM, Projects India Ltd. Pvt. Ltd., etc.,.\" />\n";

        String st="M1 TO BE A FORERUNNER IN DISSEMINATING THE BASIC AND ADVANCED CONCEPTS OF MECHANICAL ENGINEERING AT UNDER GRADUATE/POST GRADUATE LEVELS INTERMS OF CLASS ROOM TEACHING AND LABORATORY PRACTICES.";
        String sr="M2  TO ESTABLISH CENTERS OF EXCELLENCE IN EMERGING AREAS OF MECHANICAL ENGINEERING LEADING TO ENHANCED R AND D ACTIVITIES.";
        String sv="M3  TO UNDERTAKE SPONSORED PROJECTS AND CONSULTANCY WORK COMMENSURATE WITH EVER-CHANGING SOCIETAL DEMANDS.";
        String se="M4  TO INCREASE THE EMPLOYABILITY QUOTIENT OF GRADUATING STUDENTS THROUGH FINISHING SCHOOL IN RELEVANT AREAS.";
        SpannableString ss =new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        StyleSpan bold =new StyleSpan(Typeface.BOLD);
        StyleSpan nbold = new StyleSpan(Typeface.BOLD);
        StyleSpan bbold =new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 0,61, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(bold,1593, 1612,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(nbold,1635,1725,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(bbold,2954,2991,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text1.setText(ss);
        SpannableString ss1=new SpannableString(st);
        StyleSpan  bold1 = new StyleSpan(Typeface.BOLD);
        ss1.setSpan(boldSpan,0,2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text7.setText(ss1);
        SpannableString ss2=new SpannableString(sr);
        StyleSpan bold2=new StyleSpan(Typeface.BOLD);
        ss2.setSpan(boldSpan,0,2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text8.setText(ss2);
        SpannableString ss3=new SpannableString(sv);
        StyleSpan bold3=new StyleSpan(Typeface.BOLD);
        ss3.setSpan(boldSpan,0,2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text9.setText(ss3);
        SpannableString ss4=new SpannableString(se);
        StyleSpan bold4=new StyleSpan(Typeface.BOLD);
        ss4.setSpan(boldSpan,0,2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text10.setText(ss4);

    }
}
