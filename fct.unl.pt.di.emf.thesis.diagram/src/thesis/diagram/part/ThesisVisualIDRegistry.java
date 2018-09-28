/*
* 
*/
package thesis.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import thesis.Search;
import thesis.ThesisPackage;
import thesis.diagram.edit.parts.Drive2EditPart;
import thesis.diagram.edit.parts.DriveDriveContentsCompartment2EditPart;
import thesis.diagram.edit.parts.DriveDriveContentsCompartmentEditPart;
import thesis.diagram.edit.parts.DriveEditPart;
import thesis.diagram.edit.parts.DriveName2EditPart;
import thesis.diagram.edit.parts.DriveNameEditPart;
import thesis.diagram.edit.parts.FileEditPart;
import thesis.diagram.edit.parts.FileNameEditPart;
import thesis.diagram.edit.parts.FolderEditPart;
import thesis.diagram.edit.parts.FolderFolderContentsCompartmentEditPart;
import thesis.diagram.edit.parts.FolderNameEditPart;
import thesis.diagram.edit.parts.SearchEditPart;
import thesis.diagram.edit.parts.ShortcutEditPart;
import thesis.diagram.edit.parts.ShortcutNameEditPart;
import thesis.diagram.edit.parts.ShortcutTargetEditPart;
import thesis.diagram.edit.parts.SyncEditPart;
import thesis.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ThesisVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "fct.unl.pt.di.emf.thesis.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SearchEditPart.MODEL_ID.equals(view.getType())) {
				return SearchEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return thesis.diagram.part.ThesisVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ThesisDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ThesisPackage.eINSTANCE.getSearch().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Search) domainElement)) {
			return SearchEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = thesis.diagram.part.ThesisVisualIDRegistry.getModelID(containerView);
		if (!SearchEditPart.MODEL_ID.equals(containerModelID) && !"thesis".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SearchEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = thesis.diagram.part.ThesisVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SearchEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SearchEditPart.VISUAL_ID:
			if (ThesisPackage.eINSTANCE.getDrive().isSuperTypeOf(domainElement.eClass())) {
				return DriveEditPart.VISUAL_ID;
			}
			break;
		case DriveDriveContentsCompartmentEditPart.VISUAL_ID:
			if (ThesisPackage.eINSTANCE.getDrive().isSuperTypeOf(domainElement.eClass())) {
				return Drive2EditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFolder().isSuperTypeOf(domainElement.eClass())) {
				return FolderEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getShortcut().isSuperTypeOf(domainElement.eClass())) {
				return ShortcutEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return FileEditPart.VISUAL_ID;
			}
			break;
		case DriveDriveContentsCompartment2EditPart.VISUAL_ID:
			if (ThesisPackage.eINSTANCE.getDrive().isSuperTypeOf(domainElement.eClass())) {
				return Drive2EditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFolder().isSuperTypeOf(domainElement.eClass())) {
				return FolderEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getShortcut().isSuperTypeOf(domainElement.eClass())) {
				return ShortcutEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return FileEditPart.VISUAL_ID;
			}
			break;
		case FolderFolderContentsCompartmentEditPart.VISUAL_ID:
			if (ThesisPackage.eINSTANCE.getDrive().isSuperTypeOf(domainElement.eClass())) {
				return Drive2EditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFolder().isSuperTypeOf(domainElement.eClass())) {
				return FolderEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getShortcut().isSuperTypeOf(domainElement.eClass())) {
				return ShortcutEditPart.VISUAL_ID;
			}
			if (ThesisPackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return FileEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = thesis.diagram.part.ThesisVisualIDRegistry.getModelID(containerView);
		if (!SearchEditPart.MODEL_ID.equals(containerModelID) && !"thesis".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SearchEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = thesis.diagram.part.ThesisVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SearchEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SearchEditPart.VISUAL_ID:
			if (DriveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DriveEditPart.VISUAL_ID:
			if (DriveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DriveDriveContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Drive2EditPart.VISUAL_ID:
			if (DriveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DriveDriveContentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FolderEditPart.VISUAL_ID:
			if (FolderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FolderFolderContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShortcutEditPart.VISUAL_ID:
			if (ShortcutNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileEditPart.VISUAL_ID:
			if (FileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DriveDriveContentsCompartmentEditPart.VISUAL_ID:
			if (Drive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShortcutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DriveDriveContentsCompartment2EditPart.VISUAL_ID:
			if (Drive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShortcutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FolderFolderContentsCompartmentEditPart.VISUAL_ID:
			if (Drive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShortcutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShortcutTargetEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ThesisPackage.eINSTANCE.getSync().isSuperTypeOf(domainElement.eClass())) {
			return SyncEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Search element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DriveDriveContentsCompartmentEditPart.VISUAL_ID:
		case DriveDriveContentsCompartment2EditPart.VISUAL_ID:
		case FolderFolderContentsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SearchEditPart.VISUAL_ID:
			return false;
		case ShortcutEditPart.VISUAL_ID:
		case FileEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return thesis.diagram.part.ThesisVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return thesis.diagram.part.ThesisVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return thesis.diagram.part.ThesisVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return thesis.diagram.part.ThesisVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return thesis.diagram.part.ThesisVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return thesis.diagram.part.ThesisVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
