package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewCustomerFormController implements Initializable {

    @FXML
    private TableColumn colEmail;

    @FXML
    private TableColumn colIid;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TableView tblCustomer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colIid.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        loadtable();
    }

    @FXML
    void btnLoadFormonAciopn(ActionEvent event) {
        loadtable();
    }

    private void loadtable() {
        ObservableList<Customer> customerObservablelist = FXCollections.observableArrayList();
        List<Customer> conection = DBConnection.getInstance().getConection();
        conection.forEach(obj -> {
            customerObservablelist.add(obj);
        });
        tblCustomer.setItems(customerObservablelist);
    }

}
