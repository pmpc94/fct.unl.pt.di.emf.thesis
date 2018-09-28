/*
* 
*/
package thesis.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import thesis.Drive;
import thesis.File;
import thesis.Folder;
import thesis.Search;
import thesis.Shortcut;
import thesis.Sync;
import thesis.ThesisPackage;
import thesis.diagram.edit.parts.Drive2EditPart;
import thesis.diagram.edit.parts.DriveDriveContentsCompartment2EditPart;
import thesis.diagram.edit.parts.DriveDriveContentsCompartmentEditPart;
import thesis.diagram.edit.parts.DriveEditPart;
import thesis.diagram.edit.parts.FileEditPart;
import thesis.diagram.edit.parts.FolderEditPart;
import thesis.diagram.edit.parts.FolderFolderContentsCompartmentEditPart;
import thesis.diagram.edit.parts.SearchEditPart;
import thesis.diagram.edit.parts.ShortcutEditPart;
import thesis.diagram.edit.parts.ShortcutTargetEditPart;
import thesis.diagram.edit.parts.SyncEditPart;
import thesis.diagram.providers.ThesisElementTypes;

/**
 * @generated
 */
public class ThesisDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ThesisNodeDescriptor> getSemanticChildren(View view) {
		switch (ThesisVisualIDRegistry.getVisualID(view)) {
		case SearchEditPart.VISUAL_ID:
			return getSearch_1000SemanticChildren(view);
		case DriveDriveContentsCompartmentEditPart.VISUAL_ID:
			return getDriveDriveContentsCompartment_7001SemanticChildren(view);
		case DriveDriveContentsCompartment2EditPart.VISUAL_ID:
			return getDriveDriveContentsCompartment_7002SemanticChildren(view);
		case FolderFolderContentsCompartmentEditPart.VISUAL_ID:
			return getFolderFolderContentsCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ThesisNodeDescriptor> getSearch_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Search modelElement = (Search) view.getElement();
		LinkedList<ThesisNodeDescriptor> result = new LinkedList<ThesisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDrives().iterator(); it.hasNext();) {
			Drive childElement = (Drive) it.next();
			int visualID = ThesisVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DriveEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ThesisNodeDescriptor> getDriveDriveContentsCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Drive modelElement = (Drive) containerView.getElement();
		LinkedList<ThesisNodeDescriptor> result = new LinkedList<ThesisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContents().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = ThesisVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Drive2EditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FolderEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ShortcutEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ThesisNodeDescriptor> getDriveDriveContentsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Drive modelElement = (Drive) containerView.getElement();
		LinkedList<ThesisNodeDescriptor> result = new LinkedList<ThesisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContents().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = ThesisVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Drive2EditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FolderEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ShortcutEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ThesisNodeDescriptor> getFolderFolderContentsCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Folder modelElement = (Folder) containerView.getElement();
		LinkedList<ThesisNodeDescriptor> result = new LinkedList<ThesisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContents().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = ThesisVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Drive2EditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FolderEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ShortcutEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileEditPart.VISUAL_ID) {
				result.add(new ThesisNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ThesisLinkDescriptor> getContainedLinks(View view) {
		switch (ThesisVisualIDRegistry.getVisualID(view)) {
		case SearchEditPart.VISUAL_ID:
			return getSearch_1000ContainedLinks(view);
		case DriveEditPart.VISUAL_ID:
			return getDrive_2001ContainedLinks(view);
		case Drive2EditPart.VISUAL_ID:
			return getDrive_3001ContainedLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_3002ContainedLinks(view);
		case ShortcutEditPart.VISUAL_ID:
			return getShortcut_3003ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_3004ContainedLinks(view);
		case SyncEditPart.VISUAL_ID:
			return getSync_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ThesisLinkDescriptor> getIncomingLinks(View view) {
		switch (ThesisVisualIDRegistry.getVisualID(view)) {
		case DriveEditPart.VISUAL_ID:
			return getDrive_2001IncomingLinks(view);
		case Drive2EditPart.VISUAL_ID:
			return getDrive_3001IncomingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_3002IncomingLinks(view);
		case ShortcutEditPart.VISUAL_ID:
			return getShortcut_3003IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_3004IncomingLinks(view);
		case SyncEditPart.VISUAL_ID:
			return getSync_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ThesisLinkDescriptor> getOutgoingLinks(View view) {
		switch (ThesisVisualIDRegistry.getVisualID(view)) {
		case DriveEditPart.VISUAL_ID:
			return getDrive_2001OutgoingLinks(view);
		case Drive2EditPart.VISUAL_ID:
			return getDrive_3001OutgoingLinks(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_3002OutgoingLinks(view);
		case ShortcutEditPart.VISUAL_ID:
			return getShortcut_3003OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_3004OutgoingLinks(view);
		case SyncEditPart.VISUAL_ID:
			return getSync_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getSearch_1000ContainedLinks(View view) {
		Search modelElement = (Search) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Sync_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFolder_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getShortcut_3003ContainedLinks(View view) {
		Shortcut modelElement = (Shortcut) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFile_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getSync_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_2001IncomingLinks(View view) {
		Drive modelElement = (Drive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Sync_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_3001IncomingLinks(View view) {
		Drive modelElement = (Drive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Sync_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFolder_3002IncomingLinks(View view) {
		Folder modelElement = (Folder) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Sync_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getShortcut_3003IncomingLinks(View view) {
		Shortcut modelElement = (Shortcut) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Sync_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFile_3004IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Sync_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getSync_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_2001OutgoingLinks(View view) {
		Drive modelElement = (Drive) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Sync_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getDrive_3001OutgoingLinks(View view) {
		Drive modelElement = (Drive) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Sync_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFolder_3002OutgoingLinks(View view) {
		Folder modelElement = (Folder) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Sync_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getShortcut_3003OutgoingLinks(View view) {
		Shortcut modelElement = (Shortcut) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Sync_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Shortcut_Target_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getFile_3004OutgoingLinks(View view) {
		File modelElement = (File) view.getElement();
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Sync_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThesisLinkDescriptor> getSync_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ThesisLinkDescriptor> getContainedTypeModelFacetLinks_Sync_4001(Search container) {
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		for (Iterator<?> links = container.getSyncs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Sync) {
				continue;
			}
			Sync link = (Sync) linkObject;
			if (SyncEditPart.VISUAL_ID != ThesisVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			File dst = link.getTarget();
			File src = link.getSource();
			result.add(new ThesisLinkDescriptor(src, dst, link, ThesisElementTypes.Sync_4001, SyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThesisLinkDescriptor> getIncomingTypeModelFacetLinks_Sync_4001(File target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ThesisPackage.eINSTANCE.getSync_Target()
					|| false == setting.getEObject() instanceof Sync) {
				continue;
			}
			Sync link = (Sync) setting.getEObject();
			if (SyncEditPart.VISUAL_ID != ThesisVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			File src = link.getSource();
			result.add(
					new ThesisLinkDescriptor(src, target, link, ThesisElementTypes.Sync_4001, SyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThesisLinkDescriptor> getIncomingFeatureModelFacetLinks_Shortcut_Target_4002(File target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ThesisPackage.eINSTANCE.getShortcut_Target()) {
				result.add(new ThesisLinkDescriptor(setting.getEObject(), target,
						ThesisElementTypes.ShortcutTarget_4002, ShortcutTargetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ThesisLinkDescriptor> getOutgoingTypeModelFacetLinks_Sync_4001(File source) {
		Search container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Search) {
				container = (Search) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		for (Iterator<?> links = container.getSyncs().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Sync) {
				continue;
			}
			Sync link = (Sync) linkObject;
			if (SyncEditPart.VISUAL_ID != ThesisVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			File dst = link.getTarget();
			File src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ThesisLinkDescriptor(src, dst, link, ThesisElementTypes.Sync_4001, SyncEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ThesisLinkDescriptor> getOutgoingFeatureModelFacetLinks_Shortcut_Target_4002(
			Shortcut source) {
		LinkedList<ThesisLinkDescriptor> result = new LinkedList<ThesisLinkDescriptor>();
		File destination = source.getTarget();
		if (destination == null) {
			return result;
		}
		result.add(new ThesisLinkDescriptor(source, destination, ThesisElementTypes.ShortcutTarget_4002,
				ShortcutTargetEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ThesisNodeDescriptor> getSemanticChildren(View view) {
			return ThesisDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ThesisLinkDescriptor> getContainedLinks(View view) {
			return ThesisDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ThesisLinkDescriptor> getIncomingLinks(View view) {
			return ThesisDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ThesisLinkDescriptor> getOutgoingLinks(View view) {
			return ThesisDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
