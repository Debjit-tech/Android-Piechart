public class MainActivity extends AppCompatActivity {


    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart=findViewById(R.id.piechart);

        pieChart.setUsePercentValues(false);
        pieChart.getDescription().setEnabled(false);


        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(30.0f);

        ArrayList<PieEntry> values=new ArrayList<>();


        values.add(new PieEntry(94.0f,"Maths"));
        values.add(new PieEntry(90.0f,"Physics"));
        values.add(new PieEntry(92.0f,"Chemistry"));
        values.add(new PieEntry(86.0f,"Language 1"));
        values.add(new PieEntry(88.0f,"Language 2"));
        values.add(new PieEntry(44.0f,"Biology"));

        pieChart.animateY(1500, Easing.EasingOption.EaseInOutBack);


        PieDataSet dataset=new PieDataSet(values,"Subjects");
        dataset.setSliceSpace(3f);
        dataset.setSelectionShift(5f);

        dataset.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data =new PieData(dataset);
        data.setValueTextSize(14f);

        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);

    }
}
