/*
 * 
 */
package thesis.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import thesis.diagram.providers.ThesisElementTypes;
import thesis.diagram.providers.ThesisModelingAssistantProvider;

/**
 * @generated
 */
public class ThesisModelingAssistantProviderOfSearchEditPart extends ThesisModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ThesisElementTypes.Drive_2001);
		return types;
	}

}
