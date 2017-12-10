/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VtysProje.views;

import VtysProje.model.Stock;
import VtysProje.util.DataCache;
import VtysProje.util.DataModelsInitializer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 12043
 */
public class StocksView extends javax.swing.JPanel {

    private void refreshStocks() {
        DataCache.refreshStocks();
        jTable_stocks_list.setModel(DataModelsInitializer.initStocksTableModel(DataCache.stocks));

        DefaultComboBoxModel<String> productsModel = DataModelsInitializer.initProductsComboboxModel(DataCache.products);
        jComboBox_stocks_add_product.setModel(productsModel);
        jComboBox_stocks_edit_product.setModel(productsModel);

        jComboBox_stocks_edit_select.setModel(DataModelsInitializer.initStocksComboboxModel(DataCache.stocks));
    }

    /**
     * Creates new form StocksView
     */
    public StocksView() {
        initComponents();
        refreshStocks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_stocks = new javax.swing.JPanel();
        jTabbedPane_stocks = new javax.swing.JTabbedPane();
        jPanel_stocks_add = new javax.swing.JPanel();
        jLabel_stocks_add_product = new javax.swing.JLabel();
        jButton_stocks_add = new javax.swing.JButton();
        jLabel_stocks_add_unitPrice = new javax.swing.JLabel();
        jSpinner_stocks_add_quantity = new javax.swing.JSpinner();
        jLabel_stocks_add_quantity = new javax.swing.JLabel();
        jSpinner_stocks_add_unitPrice = new javax.swing.JSpinner();
        jComboBox_stocks_add_product = new javax.swing.JComboBox<>();
        jTextField_stocks_add_name = new javax.swing.JTextField();
        jLabel_stocks_add_name = new javax.swing.JLabel();
        jPanel_stocks_list = new javax.swing.JPanel();
        jScrollPane_stocks_list = new javax.swing.JScrollPane();
        jTable_stocks_list = new javax.swing.JTable();
        jButton_stocks_list_delete = new javax.swing.JButton();
        jPanel_stocks_edit = new javax.swing.JPanel();
        jLabel_stocks_edit_product = new javax.swing.JLabel();
        jButton_stocks_edit = new javax.swing.JButton();
        jLabel_stocks_edit_unitPrice = new javax.swing.JLabel();
        jLabel_stocks_edit_quantity = new javax.swing.JLabel();
        jComboBox_stocks_edit_product = new javax.swing.JComboBox<>();
        jTextField_stocks_edit_name = new javax.swing.JTextField();
        jLabel_stocks_edit_name = new javax.swing.JLabel();
        jLabel_stocks_edit_select = new javax.swing.JLabel();
        jComboBox_stocks_edit_select = new javax.swing.JComboBox<>();
        jSpinner_stocks_edit_quantity = new javax.swing.JSpinner();
        jSpinner_stocks_edit_unitPrice = new javax.swing.JSpinner();

        jLabel_stocks_add_product.setText("Product:");

        jButton_stocks_add.setText("Add");
        jButton_stocks_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stocks_addActionPerformed(evt);
            }
        });

        jLabel_stocks_add_unitPrice.setText("Unit price (In Stock):");

        jLabel_stocks_add_quantity.setText("Quantity:");

        jComboBox_stocks_add_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product 1", "Product 2", "Product 3", "Product 4" }));

        jLabel_stocks_add_name.setText("Stock name:");

        javax.swing.GroupLayout jPanel_stocks_addLayout = new javax.swing.GroupLayout(jPanel_stocks_add);
        jPanel_stocks_add.setLayout(jPanel_stocks_addLayout);
        jPanel_stocks_addLayout.setHorizontalGroup(
            jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_stocks_addLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_stocks_addLayout.createSequentialGroup()
                        .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_stocks_add_name)
                            .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton_stocks_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_stocks_add_unitPrice))
                            .addComponent(jLabel_stocks_add_quantity))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_stocks_add_name)
                            .addComponent(jSpinner_stocks_add_unitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jSpinner_stocks_add_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                    .addGroup(jPanel_stocks_addLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_stocks_add_product)
                        .addGap(108, 108, 108)
                        .addComponent(jComboBox_stocks_add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(265, 265, 265))
        );
        jPanel_stocks_addLayout.setVerticalGroup(
            jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_stocks_addLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_stocks_add_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_stocks_add_product))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_add_name)
                    .addComponent(jTextField_stocks_add_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_add_unitPrice)
                    .addComponent(jSpinner_stocks_add_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_stocks_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_add_quantity)
                    .addComponent(jSpinner_stocks_add_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton_stocks_add)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane_stocks.addTab("Add", jPanel_stocks_add);

        jTable_stocks_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Product Name", "Unit Price", "Unit Price In Stock", "Quantity", "Detail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane_stocks_list.setViewportView(jTable_stocks_list);

        jButton_stocks_list_delete.setText("Delete");
        jButton_stocks_list_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stocks_list_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_stocks_listLayout = new javax.swing.GroupLayout(jPanel_stocks_list);
        jPanel_stocks_list.setLayout(jPanel_stocks_listLayout);
        jPanel_stocks_listLayout.setHorizontalGroup(
            jPanel_stocks_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_stocks_listLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_stocks_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_stocks_list, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(jPanel_stocks_listLayout.createSequentialGroup()
                        .addComponent(jButton_stocks_list_delete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_stocks_listLayout.setVerticalGroup(
            jPanel_stocks_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_stocks_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_stocks_list, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_stocks_list_delete)
                .addContainerGap())
        );

        jTabbedPane_stocks.addTab("List", jPanel_stocks_list);

        jLabel_stocks_edit_product.setText("Product:");

        jButton_stocks_edit.setText("Save");
        jButton_stocks_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stocks_editActionPerformed(evt);
            }
        });

        jLabel_stocks_edit_unitPrice.setText("Unit price (In Stock):");

        jLabel_stocks_edit_quantity.setText("Quantity:");

        jComboBox_stocks_edit_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product 1", "Product 2", "Product 3", "Product 4" }));

        jTextField_stocks_edit_name.setText("Stock name");

        jLabel_stocks_edit_name.setText("Stock name:");

        jLabel_stocks_edit_select.setText("Editing Stock:");

        jComboBox_stocks_edit_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock 1", "Stock 2", "Stock 3", "Stock 4" }));
        jComboBox_stocks_edit_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_stocks_edit_selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_stocks_editLayout = new javax.swing.GroupLayout(jPanel_stocks_edit);
        jPanel_stocks_edit.setLayout(jPanel_stocks_editLayout);
        jPanel_stocks_editLayout.setHorizontalGroup(
            jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_stocks_editLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_stocks_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_stocks_edit_select)
                        .addComponent(jLabel_stocks_edit_product)
                        .addComponent(jLabel_stocks_edit_name)
                        .addComponent(jLabel_stocks_edit_unitPrice)
                        .addComponent(jLabel_stocks_edit_quantity)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner_stocks_edit_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stocks_edit_product, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stocks_edit_select, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_stocks_edit_name, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_stocks_edit_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(252, 252, 252))
        );
        jPanel_stocks_editLayout.setVerticalGroup(
            jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_stocks_editLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_stocks_edit_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_stocks_edit_select))
                .addGap(18, 18, 18)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_stocks_edit_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_stocks_edit_product))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_edit_name)
                    .addComponent(jTextField_stocks_edit_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_edit_unitPrice)
                    .addComponent(jSpinner_stocks_edit_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_stocks_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_stocks_edit_quantity)
                    .addComponent(jSpinner_stocks_edit_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_stocks_edit)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane_stocks.addTab("Edit", jPanel_stocks_edit);

        javax.swing.GroupLayout jPanel_stocksLayout = new javax.swing.GroupLayout(jPanel_stocks);
        jPanel_stocks.setLayout(jPanel_stocksLayout);
        jPanel_stocksLayout.setHorizontalGroup(
            jPanel_stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_stocks)
        );
        jPanel_stocksLayout.setVerticalGroup(
            jPanel_stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_stocks)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_stocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_stocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_stocks_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stocks_addActionPerformed
        Stock stock = new Stock();

        stock.setName(jTextField_stocks_add_name.getText());
        stock.setProductId(DataCache.products.get(jComboBox_stocks_add_product.getSelectedIndex() - 1).getId());
        stock.setQuantity((int) jSpinner_stocks_add_quantity.getValue());
        stock.setUnitPrice((int) jSpinner_stocks_add_unitPrice.getValue());

        if (DataCache.stockDao.add(stock)) {
            JOptionPane.showMessageDialog(this, "Added successfully");
            jTextField_stocks_add_name.setText("");
            jSpinner_stocks_add_quantity.setValue(0);
            jSpinner_stocks_add_unitPrice.setValue(0);
            refreshStocks();
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton_stocks_addActionPerformed

    private void jButton_stocks_list_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stocks_list_deleteActionPerformed
        int selectedIndex = jTable_stocks_list.getSelectedRow();
        if (DataCache.stockDao.delete((int) jTable_stocks_list.getValueAt(selectedIndex, 0))) {
            JOptionPane.showMessageDialog(this, "Deleted successfully");
            refreshStocks();
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton_stocks_list_deleteActionPerformed

    private void jButton_stocks_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stocks_editActionPerformed
        Stock stock = new Stock();

        stock.setName(jTextField_stocks_edit_name.getText());
        stock.setProductId(DataCache.products.get(jComboBox_stocks_edit_product.getSelectedIndex() - 1).getId());
        stock.setQuantity((int) jSpinner_stocks_edit_quantity.getValue());
        stock.setUnitPrice((int) jSpinner_stocks_edit_unitPrice.getValue());
        stock.setId(DataCache.stocks.get(jComboBox_stocks_edit_product.getSelectedIndex() - 1).getId());

        if (DataCache.stockDao.update(stock)) {
            JOptionPane.showMessageDialog(this, "Updated successfully");
            jTextField_stocks_edit_name.setText("");
            jSpinner_stocks_edit_quantity.setValue(0);
            jSpinner_stocks_edit_unitPrice.setValue(0);
            refreshStocks();
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton_stocks_editActionPerformed

    private void jComboBox_stocks_edit_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_stocks_edit_selectActionPerformed
        int selectedIndex = jComboBox_stocks_edit_select.getSelectedIndex();
        if (selectedIndex == 0) {
            jTextField_stocks_edit_name.setText("");
            jSpinner_stocks_edit_quantity.setValue(0);
            jSpinner_stocks_edit_unitPrice.setValue(0);
            jComboBox_stocks_edit_product.setSelectedIndex(0);
            return;
        }

        Stock stock = DataCache.stocks.get(selectedIndex - 1);
        jTextField_stocks_edit_name.setText("");
        jSpinner_stocks_edit_quantity.setValue(0);
        jSpinner_stocks_edit_unitPrice.setValue(0);
        jComboBox_stocks_edit_product.setSelectedItem(stock.getProduct().getName());
    }//GEN-LAST:event_jComboBox_stocks_edit_selectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_stocks_add;
    private javax.swing.JButton jButton_stocks_edit;
    private javax.swing.JButton jButton_stocks_list_delete;
    private javax.swing.JComboBox<String> jComboBox_stocks_add_product;
    private javax.swing.JComboBox<String> jComboBox_stocks_edit_product;
    private javax.swing.JComboBox<String> jComboBox_stocks_edit_select;
    private javax.swing.JLabel jLabel_stocks_add_name;
    private javax.swing.JLabel jLabel_stocks_add_product;
    private javax.swing.JLabel jLabel_stocks_add_quantity;
    private javax.swing.JLabel jLabel_stocks_add_unitPrice;
    private javax.swing.JLabel jLabel_stocks_edit_name;
    private javax.swing.JLabel jLabel_stocks_edit_product;
    private javax.swing.JLabel jLabel_stocks_edit_quantity;
    private javax.swing.JLabel jLabel_stocks_edit_select;
    private javax.swing.JLabel jLabel_stocks_edit_unitPrice;
    private javax.swing.JPanel jPanel_stocks;
    private javax.swing.JPanel jPanel_stocks_add;
    private javax.swing.JPanel jPanel_stocks_edit;
    private javax.swing.JPanel jPanel_stocks_list;
    private javax.swing.JScrollPane jScrollPane_stocks_list;
    private javax.swing.JSpinner jSpinner_stocks_add_quantity;
    private javax.swing.JSpinner jSpinner_stocks_add_unitPrice;
    private javax.swing.JSpinner jSpinner_stocks_edit_quantity;
    private javax.swing.JSpinner jSpinner_stocks_edit_unitPrice;
    private javax.swing.JTabbedPane jTabbedPane_stocks;
    private javax.swing.JTable jTable_stocks_list;
    private javax.swing.JTextField jTextField_stocks_add_name;
    private javax.swing.JTextField jTextField_stocks_edit_name;
    // End of variables declaration//GEN-END:variables
}
