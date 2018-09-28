/*
* 
*/
package thesis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import thesis.diagram.edit.commands.Drive2CreateCommand;
import thesis.diagram.edit.commands.FileCreateCommand;
import thesis.diagram.edit.commands.FolderCreateCommand;
import thesis.diagram.edit.commands.ShortcutCreateCommand;
import thesis.diagram.providers.ThesisElementTypes;

/**
 * @generated
 */
public class DriveDriveContentsCompartment2ItemSemanticEditPolicy extends ThesisBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DriveDriveContentsCompartment2ItemSemanticEditPolicy() {
		super(ThesisElementTypes.Drive_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ThesisElementTypes.Drive_3001 == req.getElementType()) {
			return getGEFWrapper(new Drive2CreateCommand(req));
		}
		if (ThesisElementTypes.Folder_3002 == req.getElementType()) {
			return getGEFWrapper(new FolderCreateCommand(req));
		}
		if (ThesisElementTypes.Shortcut_3003 == req.getElementType()) {
			return getGEFWrapper(new ShortcutCreateCommand(req));
		}
		if (ThesisElementTypes.File_3004 == req.getElementType()) {
			return getGEFWrapper(new FileCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
