/*
 * 
 */
package thesis.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import thesis.diagram.edit.parts.SearchEditPart;
import thesis.diagram.edit.parts.ThesisEditPartFactory;
import thesis.diagram.part.ThesisVisualIDRegistry;

/**
 * @generated
 */
public class ThesisEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ThesisEditPartProvider() {
		super(new ThesisEditPartFactory(), ThesisVisualIDRegistry.TYPED_INSTANCE, SearchEditPart.MODEL_ID);
	}

}
