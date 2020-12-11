import java.awt.event.*;
import javax.swing.JOptionPane;

public class BackdoorGUI extends javax.swing.JFrame implements ActionListener {

    public BackdoorGUI() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        iconEncrypt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        lblInput = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        lblOutput = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
       jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itmNew = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmDecrypt = new javax.swing.JMenu();
        itmWithoutKey = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encryption & Decryption");
        setName("frame"); // NOI18N
        setResizable(false);
        setVisible(true);

        pnlHead.setBackground(new java.awt.Color(111, 34, 229));

        lblHeading.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(240, 245, 245));
        lblHeading.setText("Encrypt & Decrypt Data");

        iconEncrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(iconEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconEncrypt)
                    .addComponent(lblHeading))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtOutput.setRows(4);
        txtOutput.setName("txtOutput");		 // NOI18N
        jScrollPane1.setViewportView(txtOutput);

        lblInput.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblInput.setText("Enter text to Encrypt/Decrypt");

        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        txtInput.setRows(4);
        txtInput.setName("txtInput"); // NOI18N
        jScrollPane2.setViewportView(txtInput);

        lblOutput.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblOutput.setText("Encrypted/Decrypted text");

        btnEncrypt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnEncrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnEncrypt.png"))); // NOI18N
        btnEncrypt.setText("Encrypt");

        btnClear.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnClear.setText("All Clear");
     

        btnDecrypt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnDecrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btnEncrypt.png"))); // NOI18N
        btnDecrypt.setText("Decrypt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInput)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblOutput)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDecrypt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInput)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        itmNew.setText("New");
        fileMenu.add(itmNew);
        itmNew.addActionListener(this);

        itmExit.setText("Exit");       
        fileMenu.add(itmExit);
        itmExit.addActionListener(this);

        jMenuBar1.add(fileMenu);
        jMenuBar1.add(jMenu2);

        itmDecrypt.setText("Cryptography");

        itmWithoutKey.setText("With Secret Key");
        itmDecrypt.add(itmWithoutKey);
        itmWithoutKey.addActionListener(this);

        jMenuBar1.add(itmDecrypt);

        setJMenuBar(jMenuBar1);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClear.addActionListener(this);
        btnEncrypt.addActionListener(this);
        btnDecrypt.addActionListener(this);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
    	new BackdoorGUI();
    }
     public void actionPerformed(ActionEvent evt)
    {
    	Object clicked=evt.getSource();
    	Brutus access;
    	if(clicked==itmWithoutKey)
    	{
    		dispose();
    		new CryptoGUI();
    	}
    	if(clicked==btnClear)
    	{
    		txtInput.setText("");
       		txtOutput.setText("");
    	}
    	if(clicked==btnEncrypt)
    	{
    		try
    		{
    			access=new Brutus();
    			res=access.encrypt(txtInput.getText().toString());
    			txtOutput.setText(res);
    		}
    		catch(Exception e)
    		{
    			JOptionPane.showMessageDialog(this,"Error: "+e,"Alert",JOptionPane.WARNING_MESSAGE);     			
    		}
    			
    	}
    	if(clicked==btnDecrypt)
    	{
    		try
    		{
    			access=new Brutus();
    			res=access.decrypt(txtInput.getText().toString());
    			txtOutput.setText(res);
    		}
    		catch(Exception e)
    		{
				  JOptionPane.showMessageDialog(this,"Error:"+e,"Alert",JOptionPane.WARNING_MESSAGE);     			
    		}
    	}
    }
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private String res;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    
    private javax.swing.JLabel iconEncrypt;
    private javax.swing.JMenu fileMenu;
    
    private javax.swing.JMenu itmDecrypt;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmNew;
    private javax.swing.JMenuItem itmWithoutKey;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}