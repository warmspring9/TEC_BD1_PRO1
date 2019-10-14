/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author jalej
 */
public class Catalogue extends javax.swing.JFrame {

    /**
     * Creates new form Catalogue
     */
    public Catalogue() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabPaneCountry = new javax.swing.JTabbedPane();
        tabCountry = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCountry = new javax.swing.JList<>();
        submitCountryButton = new javax.swing.JButton();
        addCountry = new javax.swing.JButton();
        editCountry = new javax.swing.JButton();
        deleteCountry = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        tabProvince = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProvince = new javax.swing.JList<>();
        submitProvinceButton = new javax.swing.JButton();
        addProvince = new javax.swing.JButton();
        editProvince = new javax.swing.JButton();
        deleteProvince = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();
        tabCountry2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCanton = new javax.swing.JList<>();
        submitCantonButton = new javax.swing.JButton();
        addCanton = new javax.swing.JButton();
        editCanton = new javax.swing.JButton();
        deleteCanton = new javax.swing.JButton();
        exitButton2 = new javax.swing.JButton();
        tabCountry3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listDistrict = new javax.swing.JList<>();
        submitDistrictButton = new javax.swing.JButton();
        addDistrict = new javax.swing.JButton();
        editDistrict = new javax.swing.JButton();
        deleteDistrict = new javax.swing.JButton();
        exitButton3 = new javax.swing.JButton();
        tabCountry4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listCategory = new javax.swing.JList<>();
        submitCategoryButton = new javax.swing.JButton();
        addCategory = new javax.swing.JButton();
        editCategory = new javax.swing.JButton();
        deleteCategory = new javax.swing.JButton();
        exitButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TabPaneCountry.setBackground(new java.awt.Color(45, 49, 66));
        TabPaneCountry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 192, 192), 2));
        TabPaneCountry.setForeground(new java.awt.Color(255, 255, 255));

        tabCountry.setBackground(new java.awt.Color(45, 49, 66));
        tabCountry.setForeground(new java.awt.Color(255, 255, 255));

        listCountry.setBackground(new java.awt.Color(79, 93, 117));
        listCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listCountry.setForeground(new java.awt.Color(255, 255, 255));
        listCountry.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCountry);

        submitCountryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitCountryButton.setBorder(null);
        submitCountryButton.setBorderPainted(false);
        submitCountryButton.setContentAreaFilled(false);

        addCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_png.png"))); // NOI18N
        addCountry.setBorder(null);
        addCountry.setBorderPainted(false);
        addCountry.setContentAreaFilled(false);

        editCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editCountry.setBorder(null);
        editCountry.setBorderPainted(false);
        editCountry.setContentAreaFilled(false);

        deleteCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash.png"))); // NOI18N
        deleteCountry.setBorder(null);
        deleteCountry.setBorderPainted(false);
        deleteCountry.setContentAreaFilled(false);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);

        javax.swing.GroupLayout tabCountryLayout = new javax.swing.GroupLayout(tabCountry);
        tabCountry.setLayout(tabCountryLayout);
        tabCountryLayout.setHorizontalGroup(
            tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCountryLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editCountry)
                            .addComponent(addCountry)
                            .addComponent(deleteCountry))
                        .addGap(42, 42, 42))
                    .addGroup(tabCountryLayout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitCountryButton)
                        .addContainerGap())))
        );
        tabCountryLayout.setVerticalGroup(
            tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabCountryLayout.createSequentialGroup()
                        .addComponent(addCountry)
                        .addGap(13, 13, 13)
                        .addComponent(editCountry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteCountry)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(tabCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitCountryButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        TabPaneCountry.addTab("Country", tabCountry);

        tabProvince.setBackground(new java.awt.Color(45, 49, 66));
        tabProvince.setForeground(new java.awt.Color(255, 255, 255));

        listProvince.setBackground(new java.awt.Color(79, 93, 117));
        listProvince.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listProvince.setForeground(new java.awt.Color(255, 255, 255));
        listProvince.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listProvince);

        submitProvinceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitProvinceButton.setBorder(null);
        submitProvinceButton.setBorderPainted(false);
        submitProvinceButton.setContentAreaFilled(false);

        addProvince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_png.png"))); // NOI18N
        addProvince.setBorder(null);
        addProvince.setBorderPainted(false);
        addProvince.setContentAreaFilled(false);

        editProvince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editProvince.setBorder(null);
        editProvince.setBorderPainted(false);
        editProvince.setContentAreaFilled(false);

        deleteProvince.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash.png"))); // NOI18N
        deleteProvince.setBorder(null);
        deleteProvince.setBorderPainted(false);
        deleteProvince.setContentAreaFilled(false);
        deleteProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProvinceActionPerformed(evt);
            }
        });

        exitButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        exitButton1.setBorder(null);
        exitButton1.setBorderPainted(false);
        exitButton1.setContentAreaFilled(false);

        javax.swing.GroupLayout tabProvinceLayout = new javax.swing.GroupLayout(tabProvince);
        tabProvince.setLayout(tabProvinceLayout);
        tabProvinceLayout.setHorizontalGroup(
            tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProvinceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabProvinceLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editProvince)
                            .addComponent(addProvince)
                            .addComponent(deleteProvince))
                        .addGap(42, 42, 42))
                    .addGroup(tabProvinceLayout.createSequentialGroup()
                        .addComponent(exitButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitProvinceButton)
                        .addContainerGap())))
        );
        tabProvinceLayout.setVerticalGroup(
            tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProvinceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabProvinceLayout.createSequentialGroup()
                        .addComponent(addProvince)
                        .addGap(13, 13, 13)
                        .addComponent(editProvince)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteProvince)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(tabProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitProvinceButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        TabPaneCountry.addTab("Province", tabProvince);

        tabCountry2.setBackground(new java.awt.Color(45, 49, 66));
        tabCountry2.setForeground(new java.awt.Color(255, 255, 255));

        listCanton.setBackground(new java.awt.Color(79, 93, 117));
        listCanton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listCanton.setForeground(new java.awt.Color(255, 255, 255));
        listCanton.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listCanton);

        submitCantonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitCantonButton.setBorder(null);
        submitCantonButton.setBorderPainted(false);
        submitCantonButton.setContentAreaFilled(false);

        addCanton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_png.png"))); // NOI18N
        addCanton.setBorder(null);
        addCanton.setBorderPainted(false);
        addCanton.setContentAreaFilled(false);

        editCanton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editCanton.setBorder(null);
        editCanton.setBorderPainted(false);
        editCanton.setContentAreaFilled(false);

        deleteCanton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash.png"))); // NOI18N
        deleteCanton.setBorder(null);
        deleteCanton.setBorderPainted(false);
        deleteCanton.setContentAreaFilled(false);

        exitButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        exitButton2.setBorder(null);
        exitButton2.setBorderPainted(false);
        exitButton2.setContentAreaFilled(false);

        javax.swing.GroupLayout tabCountry2Layout = new javax.swing.GroupLayout(tabCountry2);
        tabCountry2.setLayout(tabCountry2Layout);
        tabCountry2Layout.setHorizontalGroup(
            tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCountry2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editCanton)
                            .addComponent(addCanton)
                            .addComponent(deleteCanton))
                        .addGap(42, 42, 42))
                    .addGroup(tabCountry2Layout.createSequentialGroup()
                        .addComponent(exitButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitCantonButton)
                        .addContainerGap())))
        );
        tabCountry2Layout.setVerticalGroup(
            tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabCountry2Layout.createSequentialGroup()
                        .addComponent(addCanton)
                        .addGap(13, 13, 13)
                        .addComponent(editCanton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteCanton)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(tabCountry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitCantonButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        TabPaneCountry.addTab("Canton", tabCountry2);

        tabCountry3.setBackground(new java.awt.Color(45, 49, 66));
        tabCountry3.setForeground(new java.awt.Color(255, 255, 255));

        listDistrict.setBackground(new java.awt.Color(79, 93, 117));
        listDistrict.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listDistrict.setForeground(new java.awt.Color(255, 255, 255));
        listDistrict.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listDistrict);

        submitDistrictButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitDistrictButton.setBorder(null);
        submitDistrictButton.setBorderPainted(false);
        submitDistrictButton.setContentAreaFilled(false);

        addDistrict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_png.png"))); // NOI18N
        addDistrict.setBorder(null);
        addDistrict.setBorderPainted(false);
        addDistrict.setContentAreaFilled(false);

        editDistrict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editDistrict.setBorder(null);
        editDistrict.setBorderPainted(false);
        editDistrict.setContentAreaFilled(false);

        deleteDistrict.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash.png"))); // NOI18N
        deleteDistrict.setBorder(null);
        deleteDistrict.setBorderPainted(false);
        deleteDistrict.setContentAreaFilled(false);

        exitButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        exitButton3.setBorder(null);
        exitButton3.setBorderPainted(false);
        exitButton3.setContentAreaFilled(false);

        javax.swing.GroupLayout tabCountry3Layout = new javax.swing.GroupLayout(tabCountry3);
        tabCountry3.setLayout(tabCountry3Layout);
        tabCountry3Layout.setHorizontalGroup(
            tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCountry3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editDistrict)
                            .addComponent(addDistrict)
                            .addComponent(deleteDistrict))
                        .addGap(42, 42, 42))
                    .addGroup(tabCountry3Layout.createSequentialGroup()
                        .addComponent(exitButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitDistrictButton)
                        .addContainerGap())))
        );
        tabCountry3Layout.setVerticalGroup(
            tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabCountry3Layout.createSequentialGroup()
                        .addComponent(addDistrict)
                        .addGap(13, 13, 13)
                        .addComponent(editDistrict)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteDistrict)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(tabCountry3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitDistrictButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        TabPaneCountry.addTab("District", tabCountry3);

        tabCountry4.setBackground(new java.awt.Color(45, 49, 66));
        tabCountry4.setForeground(new java.awt.Color(255, 255, 255));

        listCategory.setBackground(new java.awt.Color(79, 93, 117));
        listCategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listCategory.setForeground(new java.awt.Color(255, 255, 255));
        listCategory.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(listCategory);

        submitCategoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/enter_2_40px.png"))); // NOI18N
        submitCategoryButton.setBorder(null);
        submitCategoryButton.setBorderPainted(false);
        submitCategoryButton.setContentAreaFilled(false);

        addCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_png.png"))); // NOI18N
        addCategory.setBorder(null);
        addCategory.setBorderPainted(false);
        addCategory.setContentAreaFilled(false);

        editCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editCategory.setBorder(null);
        editCategory.setBorderPainted(false);
        editCategory.setContentAreaFilled(false);

        deleteCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trash.png"))); // NOI18N
        deleteCategory.setBorder(null);
        deleteCategory.setBorderPainted(false);
        deleteCategory.setContentAreaFilled(false);

        exitButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelNaranja40.png"))); // NOI18N
        exitButton4.setBorder(null);
        exitButton4.setBorderPainted(false);
        exitButton4.setContentAreaFilled(false);

        javax.swing.GroupLayout tabCountry4Layout = new javax.swing.GroupLayout(tabCountry4);
        tabCountry4.setLayout(tabCountry4Layout);
        tabCountry4Layout.setHorizontalGroup(
            tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCountry4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editCategory)
                            .addComponent(addCategory)
                            .addComponent(deleteCategory))
                        .addGap(42, 42, 42))
                    .addGroup(tabCountry4Layout.createSequentialGroup()
                        .addComponent(exitButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitCategoryButton)
                        .addContainerGap())))
        );
        tabCountry4Layout.setVerticalGroup(
            tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCountry4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabCountry4Layout.createSequentialGroup()
                        .addComponent(addCategory)
                        .addGap(13, 13, 13)
                        .addComponent(editCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteCategory)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(tabCountry4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitCategoryButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        TabPaneCountry.addTab("Category", tabCountry4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPaneCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPaneCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProvinceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabPaneCountry;
    private javax.swing.JButton addCanton;
    private javax.swing.JButton addCategory;
    private javax.swing.JButton addCountry;
    private javax.swing.JButton addDistrict;
    private javax.swing.JButton addProvince;
    private javax.swing.JButton deleteCanton;
    private javax.swing.JButton deleteCategory;
    private javax.swing.JButton deleteCountry;
    private javax.swing.JButton deleteDistrict;
    private javax.swing.JButton deleteProvince;
    private javax.swing.JButton editCanton;
    private javax.swing.JButton editCategory;
    private javax.swing.JButton editCountry;
    private javax.swing.JButton editDistrict;
    private javax.swing.JButton editProvince;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listCanton;
    private javax.swing.JList<String> listCategory;
    private javax.swing.JList<String> listCountry;
    private javax.swing.JList<String> listDistrict;
    private javax.swing.JList<String> listProvince;
    private javax.swing.JButton submitCantonButton;
    private javax.swing.JButton submitCategoryButton;
    private javax.swing.JButton submitCountryButton;
    private javax.swing.JButton submitDistrictButton;
    private javax.swing.JButton submitProvinceButton;
    private javax.swing.JPanel tabCountry;
    private javax.swing.JPanel tabCountry2;
    private javax.swing.JPanel tabCountry3;
    private javax.swing.JPanel tabCountry4;
    private javax.swing.JPanel tabProvince;
    // End of variables declaration//GEN-END:variables
}
