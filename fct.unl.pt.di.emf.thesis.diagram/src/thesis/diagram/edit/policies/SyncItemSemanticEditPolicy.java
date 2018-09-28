/*
* 
*/
package thesis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import thesis.diagram.providers.ThesisElementTypes;

/**
 * @generated
 */
public class SyncItemSemanticEditPolicy extends ThesisBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SyncItemSemanticEditPolicy() {
		super(ThesisElementTypes.Sync_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
