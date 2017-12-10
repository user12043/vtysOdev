/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VtysProje.views;

import VtysProje.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12043
 */
public class ProductsView extends javax.swing.JPanel {

    private List<Product> products = new ArrayList<>();

    /**
     * Creates new form ProductsView
     */
    public ProductsView() {
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

        jPanel_products = new javax.swing.JPanel();
        jTabbedPane_products = new javax.swing.JTabbedPane();
        jPanel_products_add = new javax.swing.JPanel();
        jLabel_products_add_name = new javax.swing.JLabel();
        jTextField_products_add_name = new javax.swing.JTextField();
        jButton_products_add = new javax.swing.JButton();
        jTextField_products_add_unitPrice = new javax.swing.JTextField();
        jLabel_products_add_unitPrice = new javax.swing.JLabel();
        jScrollPane_products_add_detail = new javax.swing.JScrollPane();
        jTextArea_products_add_detail = new javax.swing.JTextArea();
        jLabel_products_add_detail = new javax.swing.JLabel();
        jPanel_products_list = new javax.swing.JPanel();
        jScrollPane_products_list = new javax.swing.JScrollPane();
        jTable_products_list = new javax.swing.JTable();

        jLabel_products_add_name.setText("Product name:");

        jTextField_products_add_name.setText("Product name");

        jButton_products_add.setText("Add");

        jTextField_products_add_unitPrice.setText("Unit price");

        jLabel_products_add_unitPrice.setText("Unit price:");

        jTextArea_products_add_detail.setColumns(20);
        jTextArea_products_add_detail.setRows(5);
        jTextArea_products_add_detail.setText("Detail");
        jScrollPane_products_add_detail.setViewportView(jTextArea_products_add_detail);

        jLabel_products_add_detail.setText("Detail:");

        javax.swing.GroupLayout jPanel_products_addLayout = new javax.swing.GroupLayout(jPanel_products_add);
        jPanel_products_add.setLayout(jPanel_products_addLayout);
        jPanel_products_addLayout.setHorizontalGroup(
                jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_products_addLayout.createSequentialGroup()
                                .addContainerGap(214, Short.MAX_VALUE)
                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton_products_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel_products_addLayout.createSequentialGroup()
                                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_products_add_unitPrice)
                                                        .addComponent(jLabel_products_add_name))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField_products_add_name, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                        .addComponent(jTextField_products_add_unitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                        .addGroup(jPanel_products_addLayout.createSequentialGroup()
                                                .addComponent(jLabel_products_add_detail)
                                                .addGap(90, 90, 90)
                                                .addComponent(jScrollPane_products_add_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(166, 166, 166))
        );
        jPanel_products_addLayout.setVerticalGroup(
                jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_products_addLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_products_add_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_products_add_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_products_add_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_products_add_unitPrice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_products_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane_products_add_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_products_add_detail))
                                .addGap(23, 23, 23)
                                .addComponent(jButton_products_add)
                                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane_products.addTab("Add", jPanel_products_add);

        jTable_products_list.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null}
                },
                new String[]{
                    "Id", "Product Name", "Unit Price", "Detail"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane_products_list.setViewportView(jTable_products_list);

        javax.swing.GroupLayout jPanel_products_listLayout = new javax.swing.GroupLayout(jPanel_products_list);
        jPanel_products_list.setLayout(jPanel_products_listLayout);
        jPanel_products_listLayout.setHorizontalGroup(
                jPanel_products_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_products_listLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_products_list, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel_products_listLayout.setVerticalGroup(
                jPanel_products_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_products_listLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane_products_list, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_products.addTab("List", jPanel_products_list);

        javax.swing.GroupLayout jPanel_productsLayout = new javax.swing.GroupLayout(jPanel_products);
        jPanel_products.setLayout(jPanel_productsLayout);
        jPanel_productsLayout.setHorizontalGroup(
                jPanel_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane_products)
        );
        jPanel_productsLayout.setVerticalGroup(
                jPanel_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane_products)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 733, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 427, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_products_add;
    private javax.swing.JLabel jLabel_products_add_detail;
    private javax.swing.JLabel jLabel_products_add_name;
    private javax.swing.JLabel jLabel_products_add_unitPrice;
    private javax.swing.JPanel jPanel_products;
    private javax.swing.JPanel jPanel_products_add;
    private javax.swing.JPanel jPanel_products_list;
    private javax.swing.JScrollPane jScrollPane_products_add_detail;
    private javax.swing.JScrollPane jScrollPane_products_list;
    private javax.swing.JTabbedPane jTabbedPane_products;
    private javax.swing.JTable jTable_products_list;
    private javax.swing.JTextArea jTextArea_products_add_detail;
    private javax.swing.JTextField jTextField_products_add_name;
    private javax.swing.JTextField jTextField_products_add_unitPrice;
    // End of variables declaration//GEN-END:variables
}