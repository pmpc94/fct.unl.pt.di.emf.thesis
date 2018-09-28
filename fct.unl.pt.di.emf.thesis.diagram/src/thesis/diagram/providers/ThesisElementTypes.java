/*
 * 
 */
package thesis.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import thesis.ThesisPackage;
import thesis.diagram.edit.parts.Drive2EditPart;
import thesis.diagram.edit.parts.DriveEditPart;
import thesis.diagram.edit.parts.FileEditPart;
import thesis.diagram.edit.parts.FolderEditPart;
import thesis.diagram.edit.parts.SearchEditPart;
import thesis.diagram.edit.parts.ShortcutEditPart;
import thesis.diagram.edit.parts.ShortcutTargetEditPart;
import thesis.diagram.edit.parts.SyncEditPart;
import thesis.diagram.part.ThesisDiagramEditorPlugin;

/**
 * @generated
 */
public class ThesisElementTypes {

	/**
	* @generated
	*/
	private ThesisElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ThesisDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Search_1000 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Search_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Drive_2001 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Drive_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Drive_3001 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Drive_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Folder_3002 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Folder_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Shortcut_3003 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Shortcut_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_3004 = getElementType("fct.unl.pt.di.emf.thesis.diagram.File_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sync_4001 = getElementType("fct.unl.pt.di.emf.thesis.diagram.Sync_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ShortcutTarget_4002 = getElementType(
			"fct.unl.pt.di.emf.thesis.diagram.ShortcutTarget_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Search_1000, ThesisPackage.eINSTANCE.getSearch());

			elements.put(Drive_2001, ThesisPackage.eINSTANCE.getDrive());

			elements.put(Drive_3001, ThesisPackage.eINSTANCE.getDrive());

			elements.put(Folder_3002, ThesisPackage.eINSTANCE.getFolder());

			elements.put(Shortcut_3003, ThesisPackage.eINSTANCE.getShortcut());

			elements.put(File_3004, ThesisPackage.eINSTANCE.getFile());

			elements.put(Sync_4001, ThesisPackage.eINSTANCE.getSync());

			elements.put(ShortcutTarget_4002, ThesisPackage.eINSTANCE.getShortcut_Target());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Search_1000);
			KNOWN_ELEMENT_TYPES.add(Drive_2001);
			KNOWN_ELEMENT_TYPES.add(Drive_3001);
			KNOWN_ELEMENT_TYPES.add(Folder_3002);
			KNOWN_ELEMENT_TYPES.add(Shortcut_3003);
			KNOWN_ELEMENT_TYPES.add(File_3004);
			KNOWN_ELEMENT_TYPES.add(Sync_4001);
			KNOWN_ELEMENT_TYPES.add(ShortcutTarget_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SearchEditPart.VISUAL_ID:
			return Search_1000;
		case DriveEditPart.VISUAL_ID:
			return Drive_2001;
		case Drive2EditPart.VISUAL_ID:
			return Drive_3001;
		case FolderEditPart.VISUAL_ID:
			return Folder_3002;
		case ShortcutEditPart.VISUAL_ID:
			return Shortcut_3003;
		case FileEditPart.VISUAL_ID:
			return File_3004;
		case SyncEditPart.VISUAL_ID:
			return Sync_4001;
		case ShortcutTargetEditPart.VISUAL_ID:
			return ShortcutTarget_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return thesis.diagram.providers.ThesisElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return thesis.diagram.providers.ThesisElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return thesis.diagram.providers.ThesisElementTypes.getElement(elementTypeAdapter);
		}
	};

}
