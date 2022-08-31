
package jogo;

public class jogoVelha extends javax.swing.JFrame {
    int contador=1;
    public jogoVelha() {
        initComponents();
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        i = new javax.swing.JButton();
        inf = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        e.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        f.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        g.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        h.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        i.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        inf.setBackground(new java.awt.Color(102, 102, 102));
        inf.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        inf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        reset.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(g, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(f, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(i, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(i, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
       //*A*// 
       
    if(a.getText().equals("")){
          contador++;
           a.setText((contador % 2 == 0)? "X" : "O");
           verificarVencedor();
           
       }
       
        else{
           return;
       }
       
      
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
       //*B*//
       
       if(b.getText().equals("")){
          contador++;
           b.setText((contador % 2 == 0)? "X" : "O");
           verificarVencedor();
       }
       else{
           return;
       }
           

       
    
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        //*C*//
        
        if(c.getText().equals("")){
          contador++;
            c.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();

       }
       else{
           return;
       }
        
        
   
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        //*d*//
        
        if(d.getText().equals("")){
          contador++;
            d.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
       }
       else{
           return;
       }
        
     
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        //*e*//
        
        if(e.getText().equals("")){
          contador++;
            e.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
       }
       else{
           return;
       }
       
    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        //*f*//
        
        if(f.getText().equals("")){
          contador++;
            f.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
            
       }
       else{
           return;
       }

   
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        //*g*//
        
        if(g.getText().equals("")){
          contador++;
            g.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
       }
       else{
           return;
       }
        
      
   
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        //*f*//
        
        if(h.getText().equals("")){
          contador++;
            h.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
       }
       else{
           return;
       }
       
    }//GEN-LAST:event_hActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        //*i*//
        
        if(i.getText().equals("")){
          contador++;
            i.setText((contador % 2 == 0)? "X" : "O");
            verificarVencedor();
       }
       else{
           return;
       }
       
    }//GEN-LAST:event_iActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.setText("");
        g.setText("");
        h.setText("");
        i.setText("");
        inf.setText("");
        Ativar();

    }//GEN-LAST:event_resetActionPerformed
    
    private void verificarVencedor(){
        if(a.getText().equals(b.getText()) && b.getText().equals(c.getText()) && !a.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(d.getText().equals(e.getText()) && e.getText().equals(f.getText()) && !d.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(g.getText().equals(h.getText()) && h.getText().equals(i.getText()) && !g.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(a.getText().equals(d.getText()) && d.getText().equals(g.getText()) && !a.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(b.getText().equals(e.getText()) && e.getText().equals(h.getText()) && !b.getText().equals("") ){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(c.getText().equals(f.getText()) && f.getText().equals(i.getText()) && !c.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(a.getText().equals(e.getText()) && e.getText().equals(i.getText()) && !a.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else if(c.getText().equals(e.getText()) && e.getText().equals(g.getText()) && !c.getText().equals("")){
            inf.setText((contador % 2 == 0)? " Vencedor: X" : "Vencedor: O");
            Desativar();
        }
        else{
            inf.setText((contador % 2 == 0)? " Vez do jogador: O" : "Vez do jogador: X");
        }
    }
    private void Desativar(){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        g.setEnabled(false);
        h.setEnabled(false);
        i.setEnabled(false);
        
    }
    private void Ativar(){
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogoVelha().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JLabel inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
