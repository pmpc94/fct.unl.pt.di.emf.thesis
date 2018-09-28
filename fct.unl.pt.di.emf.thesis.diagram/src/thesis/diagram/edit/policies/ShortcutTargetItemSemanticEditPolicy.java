/*
* 
*/
package thesis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import thesis.diagram.providers.ThesisElementTypes;

/**
 * @generated
 */
public class ShortcutTargetItemSemanticEditPolicy extends ThesisBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ShortcutTargetItemSemanticEditPolicy() {
		super(ThesisElementTypes.ShortcutTarget_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
