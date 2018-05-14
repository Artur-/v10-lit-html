package org.vaadin.artur;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

	public MainView() {
		ExampleTemplate template = new ExampleTemplate();

		Button button = new Button("Moar whales", event -> {
			template.getModel().setWhales(template.getModel().getWhales() + 1);
		});

		add(button, template);
		setClassName("main-layout");
	}
}
