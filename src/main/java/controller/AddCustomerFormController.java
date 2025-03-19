
package controller;

import com.jfoenix.controls.JFXTextField;
import com.sun.security.jgss.GSSUtil;
import db.DBConnection;
import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {


    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;


    @FXML
    public void btnAddOnAction(ActionEvent event) {

        Customer customer=new Customer(txtId.getText(),txtName.getText(),txtEmail.getText(),Double.parseDouble(txtSalary.getText()));
        System.out.println(customer);

        DBConnection.getInstance().getConection().add(customer);


    clear();

    }



    public void clear(){
        txtId.setText("");
        txtName.setText("");
        txtSalary.setText("");
        txtEmail.setText("");
    }
    @FXML
    void btnClearOnaction(ActionEvent event) {
        clear();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void btnsearchOnaction(ActionEvent event) {

    }

}
