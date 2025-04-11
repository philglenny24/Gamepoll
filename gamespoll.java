import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class GamePoll extends Applet {
    Button footballBtn, hockeyBtn, baseballBtn, cricketBtn, clearBtn;
    TextField resultField;
    int footballVotes = 0;
    int hockeyVotes = 0;
    int baseballVotes = 0;
    int cricketVotes = 0;
    
    public void init() {
        
        footballBtn = new Button("Football");
        hockeyBtn = new Button("Hockey");
        baseballBtn = new Button("Baseball");
        cricketBtn = new Button("Cricket");
        clearBtn = new Button("Clear Results");
        
        
        resultField = new TextField(40);
        resultField.setEditable(false);
        updateResultField();
        
       
        footballBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                footballVotes++;
                updateResultField();
            }
        });
        
        hockeyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hockeyVotes++;
                updateResultField();
            }
        });
        
        baseballBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                baseballVotes++;
                updateResultField();
            }
        });
        
        cricketBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cricketVotes++;
                updateResultField();
            }
        });
        
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                footballVotes = 0;
                hockeyVotes = 0;
                baseballVotes = 0;
                cricketVotes = 0;
                updateResultField();
            }
        });
        
      
        add(new Label("Vote for your most used phone brand:"));
        add(footballBtn);
        add(hockeyBtn);
        add(baseballBtn);
        add(cricketBtn);
        add(clearBtn);
        add(resultField);
    }
    
    private void updateResultField() {
        String results = "Results - Football: " + footballVotes + 
                        ", Hockey: " + hockeyVotes + 
                        ", Baseball: " + baseballVotes + 
                        ", Cricket: " + cricketVotes;
        resultField.setText(results);
    }
}