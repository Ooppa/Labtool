/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.javalabra.labtool.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import fi.javalabra.labtool.domain.User;
import fi.javalabra.labtool.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author atte
 */
@Theme("valo")
@SpringUI(path = "/users")
public class UserUI extends UI {

    @Autowired
    UserService service;

    @Override
    protected void init(VaadinRequest request) {
        Table table = new Table();
        initTable(table);

        setContent(table);
    }

    private void initTable(Table table) {
        BeanItemContainer<User> userSource = new BeanItemContainer<>(User.class);
        table.setContainerDataSource(userSource);
        table.setVisibleColumns(new String[] {"name", "email", "studentNumber"});
        userSource.addAll(service.allUsers());
    }

}
