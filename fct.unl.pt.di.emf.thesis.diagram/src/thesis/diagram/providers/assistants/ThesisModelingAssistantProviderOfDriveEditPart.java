/*
 * 
 */
package thesis.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import thesis.diagram.edit.parts.Drive2EditPart;
import thesis.diagram.edit.parts.DriveEditPart;
import thesis.diagram.edit.parts.FileEditPart;
import thesis.diagram.edit.parts.FolderEditPart;
import thesis.diagram.edit.parts.ShortcutEditPart;
import thesis.diagram.providers.ThesisElementTypes;
import thesis.diagram.providers.ThesisModelingAssistantProvider;

/**
 * @generated
 */
public class ThesisModelingAssistantProviderOfDriveEditPart extends ThesisModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DriveEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DriveEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ThesisElementTypes.Sync_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DriveEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DriveEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DriveEditPart) {
			types.add(ThesisElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof Drive2EditPart) {
			types.add(ThesisElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof FolderEditPart) {
			types.add(ThesisElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof ShortcutEditPart) {
			types.add(ThesisElementTypes.Sync_4001);
		}
		if (targetEditPart instanceof FileEditPart) {
			types.add(ThesisElementTypes.Sync_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DriveEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DriveEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ThesisElementTypes.Sync_4001) {
			types.add(ThesisElementTypes.Drive_2001);
			types.add(ThesisElementTypes.Drive_3001);
			types.add(ThesisElementTypes.Folder_3002);
			types.add(ThesisElementTypes.Shortcut_3003);
			types.add(ThesisElementTypes.File_3004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DriveEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DriveEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ThesisElementTypes.Sync_4001);
		types.add(ThesisElementTypes.ShortcutTarget_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DriveEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DriveEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ThesisElementTypes.Sync_4001) {
			types.add(ThesisElementTypes.Drive_2001);
			types.add(ThesisElementTypes.Drive_3001);
			types.add(ThesisElementTypes.Folder_3002);
			types.add(ThesisElementTypes.Shortcut_3003);
			types.add(ThesisElementTypes.File_3004);
		} else if (relationshipType == ThesisElementTypes.ShortcutTarget_4002) {
			types.add(ThesisElementTypes.Shortcut_3003);
		}
		return types;
	}

}
