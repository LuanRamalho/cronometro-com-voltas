/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch;

/**
 *
 * @author Surbhit
 */
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
public class stopwatch extends javax.swing.JFrame {
      int i=0,j=0,k=0,l=0,dt=0,hr=0,min=0,sd=0,ms=0,cnt=0;
    /**
     * Creates new form stopwatch
     */
      private Timer timer,t2;
    public stopwatch() {
        initComponents();
        
    }

    String s="",a="";
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startpause = new javax.swing.JToggleButton();
        lap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        hours = new javax.swing.JLabel();
        mins = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        msec = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        save = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BINARY WARRIORS Stopwatch");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        startpause.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        startpause.setForeground(new java.awt.Color(0, 204, 0));
        startpause.setText("Start");
        startpause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startpauseActionPerformed(evt);
            }
        });

        lap.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lap.setForeground(new java.awt.Color(0, 204, 0));
        lap.setText("Reset");
        lap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapActionPerformed(evt);
            }
        });

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(startpause, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startpause, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lap, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        hours.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        hours.setForeground(new java.awt.Color(0, 0, 204));
        hours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hours.setText("00");
        hours.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hours", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N

        mins.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        mins.setForeground(new java.awt.Color(0, 0, 204));
        mins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mins.setText("00");
        mins.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Minutes", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N

        sec.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        sec.setForeground(new java.awt.Color(0, 0, 204));
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sec.setText("00");
        sec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seconds", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N

        msec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msec.setForeground(new java.awt.Color(0, 0, 204));
        msec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msec.setText("00");
        msec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Milliseconds", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 204, 255))); // NOI18N

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jMenu1.setText("File");

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Help");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mins, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msec, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mins, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(hours, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msec, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startpauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startpauseActionPerformed
        if(startpause.isSelected())
        {
            timer.start();
            startpause.setText("Pause");
            lap.setText("Lap");
        }
        else
        {
            timer.stop();
            startpause.setText("Start");
            lap.setText("Reset");
        }
    }//GEN-LAST:event_startpauseActionPerformed

    private void lapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapActionPerformed
        if(startpause.isSelected())
        {
            hr=Integer.parseInt(hours.getText());
            min=Integer.parseInt(mins.getText());
            sd=Integer.parseInt(sec.getText());
            ms=Integer.parseInt(msec.getText());
            cnt++;
            ta.append("#"+cnt+" "+hours.getText()+":"+mins.getText()+":"+sec.getText()+":"+msec.getText()+"\n");
        }
        else
        {
            cnt=0;
            ta.setText("");
            hours.setText("00");
            mins.setText("00");
            sec.setText("00");
            msec.setText("00");
            i=j=k=l=0;
            
        }
    }//GEN-LAST:event_lapActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       try 
        {
        
            Scanner ss=new Scanner(ta.getText());   
            PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("D:/time.txt")));
            
            do
            {
                a=ss.nextLine();
                
                s=s+a+"\n";
                pw.println(s);
                s="";
            }while(ss.hasNextLine());
            System.out.println("String is \n"+s);
            pw.close();
            
        } catch (IOException ex) 
        {
            
        }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Help obj=new Help();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        date.setText(new SimpleDateFormat("HH:mm:ss   dd-MM-yyyy").format(Calendar.getInstance().getTime()));
        timer = new Timer(10, new update(i));     
        //why lags sometimes?
        t2 = new Timer(1000, new update1(dt));
        t2.start();
        // TODO addur handling code here:
    }//GEN-LAST:event_formWindowOpened
    
    /*    */
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[])throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stopwatch().setVisible(true);
            }
        });
        
        
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lap;
    private javax.swing.JLabel mins;
    private javax.swing.JLabel msec;
    private javax.swing.JMenuItem save;
    private javax.swing.JLabel sec;
    private javax.swing.JToggleButton startpause;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

    private class update implements ActionListener {

        public update(int i) {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            msec.setText(""+i);
            if(i%100==0)
            {
                j++;
                sec.setText(""+j);
                i=0;
                msec.setText(""+i);
                if(j%60==0)
                {
                    k++;
                    mins.setText(""+k);
                    j=0;
                    sec.setText(""+j);
                    if(k%60==0)
                    {
                        l++;
                        hours.setText(""+l);
                        k=0;
                        mins.setText(""+k);
                    }
                }
            }
        }
    }
    
    private class update1 implements ActionListener
    {

        public update1(int i) {
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String ts=new SimpleDateFormat("HH:mm:ss    dd-MM-yyyy").format(Calendar.getInstance().getTime());
            date.setText(ts);
        }
    }
}
