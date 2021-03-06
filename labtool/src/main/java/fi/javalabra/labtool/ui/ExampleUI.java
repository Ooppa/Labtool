package fi.javalabra.labtool.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import org.springframework.beans.factory.annotation.Autowired;

import fi.javalabra.labtool.services.ExampleService;

/**
 *
 * @author Ooppa
 */
@Theme("valo")
@SpringUI(path = "")
public class ExampleUI extends UI {

    @Autowired
    ExampleService service;

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Hello, World!"));
    }
}
