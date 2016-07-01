/*
CMSC 335 Final Project
Abby Schadegg
Part 1
*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Part1 extends javax.swing.JFrame {
    private SongList sList = new SongList();        //List to keep track of songs
    private boolean flag;                           //flag indicates whether editing or adding a song
    //Creates new form Part1
    public Part1() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SongNameBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descripField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        artistField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        albumField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SongNameBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Song" }));
        SongNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongNameBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Song Name:");

        codeField.setEditable(false);

        jLabel2.setText("Item Code:");

        descripField.setEditable(false);

        jLabel3.setText("Description:");

        artistField.setEditable(false);

        jLabel4.setText("Artist:");

        jLabel5.setText("Album:");

        albumField.setEditable(false);

        priceField.setEditable(false);

        jLabel6.setText("Price:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        acceptButton.setText("Accept");
        acceptButton.setEnabled(false);
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descripField)
                    .addComponent(SongNameBox, 0, 201, Short.MAX_VALUE)
                    .addComponent(priceField)
                    .addComponent(albumField)
                    .addComponent(artistField)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acceptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SongNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(albumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(acceptButton)
                    .addComponent(cancelButton)
                    .addComponent(exitButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Action Listeners
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
       flag = true;         //sets flag for accept button
       //if clicked on "select a song" it ends the action
       if(SongNameBox.getSelectedItem().toString().equals("Select a Song"))
       {return;}
       //enables fields/buttons appropriately
        descripField.setEditable(true);
        artistField.setEditable(true);
        albumField.setEditable(true);  
        priceField.setEditable(true);   
        addButton.setEnabled(false); 
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
        acceptButton.setEnabled(true);
        cancelButton.setEnabled(true);
    }//GEN-LAST:event_editButtonActionPerformed
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       //enables fields/buttons appropriately
        codeField.setText("");    codeField.setEditable(true);        
        descripField.setText(""); descripField.setEditable(true);
        artistField.setText("");  artistField.setEditable(true);
        albumField.setText("");   albumField.setEditable(true);  
        priceField.setText("");   priceField.setEditable(true);         
        addButton.setEnabled(false);
        editButton.setEnabled(false); 
        deleteButton.setEnabled(false);
        acceptButton.setEnabled(true);
        cancelButton.setEnabled(true);
        flag = false;       //sets flag to false for accept button
    }//GEN-LAST:event_addButtonActionPerformed
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Fields are cleared and buttons/text fields revert to default state
        codeField.setText(""); descripField.setText(""); 
        artistField.setText(""); albumField.setText("");   
        priceField.setText(""); 
        codeField.setEditable(false); descripField.setEditable(false);
        artistField.setEditable(false); albumField.setEditable(false);  
        priceField.setEditable(false); addButton.setEnabled(true);
        editButton.setEnabled(true); deleteButton.setEnabled(true);
        acceptButton.setEnabled(false); cancelButton.setEnabled(false);
    }//GEN-LAST:event_cancelButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String choice = SongNameBox.getSelectedItem().toString();
        Song curr = sList.songHead;
        int index = 0;
       //loop locates and removes songfrom combo box and list
        while(true)
        { 
            if(choice.equals(curr.next.getName()))
            { 
                curr.next = curr.next.next;
                SongNameBox.removeItemAt(index+1);
                break;
            }
            index++;
            curr=curr.next;
        }
        //Fields/buttons restored to default state
        codeField.setText("");    codeField.setEditable(false);        
        descripField.setText(""); descripField.setEditable(false);
        artistField.setText("");  artistField.setEditable(false);
        albumField.setText("");   albumField.setEditable(false);  
        priceField.setText("");   priceField.setEditable(false);  
        addButton.setEnabled(true);
        editButton.setEnabled(true);
        deleteButton.setEnabled(true);
        acceptButton.setEnabled(false);
        cancelButton.setEnabled(false);
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void SongNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongNameBoxActionPerformed
       String choice = SongNameBox.getSelectedItem().toString();
       Song curr = sList.songHead;     
       
       if(choice.equals("Select a Song"))
       {
        codeField.setText("");    
        descripField.setText(""); 
        artistField.setText("");  
        albumField.setText("");   
        priceField.setText("");
        return;
       }
       while(true)
        {            
            if(choice.equals(curr.getName()))
            {               
             codeField.setText(curr.getCode());
                descripField.setText(curr.getName());
                artistField.setText(curr.getArtist());
                albumField.setText(curr.getAlbum());
                priceField.setText(Float.toString(curr.getPrice()));                 
                break;
            }
            curr=curr.next;
        }
    }//GEN-LAST:event_SongNameBoxActionPerformed
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //output file is written and program is terminated
        try {
            this.writer();
        } catch (IOException ex) {
            Logger.getLogger(Part1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        if(flag == false)   //operation if adding a song
           {          
               Song newSong = new Song(descripField.getText()); 
                //try/catch checks if price entry is a number
               //if not a number, GUI is reset and price field displays warning
               try{                     
                    newSong.addPrice(Float.parseFloat(priceField.getText()));
                }catch(Exception e){ 
                     codeField.setText("");    codeField.setEditable(false);        
                    descripField.setText(""); descripField.setEditable(false);
                    artistField.setText("");  artistField.setEditable(false);
                    albumField.setText("");   albumField.setEditable(false);                      
                    priceField.setText("Price entry must be a number");   priceField.setEditable(false);  
                    addButton.setEnabled(true);
                    editButton.setEnabled(true);
                    deleteButton.setEnabled(true);
                    acceptButton.setEnabled(false);
                    cancelButton.setEnabled(false);
                    return;
                }
               //adds song info to node
               sList.addSong(newSong);
               newSong.addCode(codeField.getText());
               newSong.addArtist(artistField.getText());
               newSong.addAlbum(albumField.getText());
               SongNameBox.addItem(descripField.getText());                          
           }                
        else        //operation if editing a song
        {
            String choice = SongNameBox.getSelectedItem().toString();
            Song curr = sList.songHead.next;
            //if not a number, GUI is reset and price field displays warning
            try{                     
                    curr.addPrice(Float.parseFloat(priceField.getText()));
                }catch(Exception e){ 
                     codeField.setText("");    codeField.setEditable(false);        
                    descripField.setText(""); descripField.setEditable(false);
                    artistField.setText("");  artistField.setEditable(false);
                    albumField.setText("");   albumField.setEditable(false);                      
                    priceField.setText("Price entry must be a number");   priceField.setEditable(false);  
                    addButton.setEnabled(true);
                    editButton.setEnabled(true);
                    deleteButton.setEnabled(true);
                    acceptButton.setEnabled(false);
                    cancelButton.setEnabled(false);
                    return;
                }
            //loop locates song in list and updates ifo
            while(true)
            {            
                if(choice.equals(curr.getName()))
                {                       
                   curr.addDescrip(descripField.getText());
                   curr.addArtist(artistField.getText());
                   curr.addAlbum(albumField.getText());
                   curr.addPrice(Float.parseFloat(priceField.getText()));                   
                   SongNameBox.addItem(descripField.getText());
                   int index = SongNameBox.getSelectedIndex();
                   SongNameBox.removeItemAt(index);
                   break;
                }
                curr=curr.next;
            }
        }
        //GUI fields/buttons are reset to default
        codeField.setText("");    codeField.setEditable(false);        
        descripField.setText(""); descripField.setEditable(false);
        artistField.setText("");  artistField.setEditable(false);
        albumField.setText("");   albumField.setEditable(false);  
        priceField.setText("");   priceField.setEditable(false);  
        addButton.setEnabled(true);
        editButton.setEnabled(true);
        deleteButton.setEnabled(true);
        acceptButton.setEnabled(false);
        cancelButton.setEnabled(false);
    }//GEN-LAST:event_acceptButtonActionPerformed

    //File writer for output file
    public void writer() throws IOException{
        FileWriter f = new FileWriter("SongList.txt");
        Song s = sList.songHead;         
        //if statement checks if list is empty
        if(s.next != null)
        {s = s.next;}
        else
        {return;}        
        
        //while loop traverses song list and prints info to .txt file
        while(s != null)
        {
           f.write(s.getName()+", "+s.getArtist()+", "+s.getAlbum()+", "+s.getCode()+", "+s.getPrice());
           f.write(System.getProperty( "line.separator" ));
           s = s.next;
        }        
        f.close();
    }
    
    public static void main(String args[]) {                       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Part1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SongNameBox;
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField albumField;
    private javax.swing.JTextField artistField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField codeField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descripField;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}

//nodes for song list
class Song{
    //song info fields
    private String name;
    protected String code;
    protected String album;
    protected String artist;
    private String description;
    protected float price;
    Song next;    
    
    public Song(){
        next = null;        
    }
    public Song(String s){
        next = null;
        name = s;
        description = s;
    }
    //methods to add/edit or retrieve fields
    public void addDescrip(String d){description = d; name = d;}
    public void addCode(String c){code = c;}
    public void addAlbum(String a){album = a;}
    public void addArtist(String at){artist = at;}   
    public void addPrice(float p){price = p;}  
    public String getName(){return name;}
    public String getArtist(){return artist;}
    public String getAlbum(){return album;}
    public float getPrice(){return price;}
    public String getCode(){return code;}
}

//List to keep track of songs
class SongList{
    Song songHead = new Song();
    
    public SongList(){
        songHead.next=null;            
    }    
    public void addSong(Song s){        
        s.next = songHead.next;
        songHead.next = s;
    }     
}