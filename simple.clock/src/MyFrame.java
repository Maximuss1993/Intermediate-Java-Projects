import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    SimpleDateFormat dayFormat;
    JLabel dayLabel;
    String day;

    SimpleDateFormat dateFormat;
    JLabel dateLabel;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simple Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(Color.BLUE);
        //timeLabel.setBackground(Color.lightGray);
        //timeLabel.setOpaque(true);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.ITALIC, 35));
        dayFormat = new SimpleDateFormat("    EEEE    ");

        dateLabel= new JLabel();
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
        dateFormat = new SimpleDateFormat("dd.  MMMM  yyyy.");
        //dateLabel.setBackground(Color.orange);
        //dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            // This way we ar getting current time and storing it into String variable time.
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            // This way we ar getting current time and storing it into String variable time.
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            // This way we ar getting current time and storing it into String variable time.
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
