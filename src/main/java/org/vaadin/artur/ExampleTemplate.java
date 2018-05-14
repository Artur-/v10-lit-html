package org.vaadin.artur;

import org.vaadin.artur.ExampleTemplate.ExampleModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Simple template example.
 */
@Tag("example-template")
@HtmlImport("src/example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleModel> {

	/**
	 * Template model which defines the single "value" property.
	 */
	public interface ExampleModel extends TemplateModel {

		void setWhales(int whales);

		int getWhales();
	}

	public ExampleTemplate() {
		getModel().setWhales(3);
	}

	@Override
	public ExampleModel getModel() {
		return super.getModel();
	}
}
