
/*
 * 
 */
package thesis.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import thesis.diagram.providers.ThesisElementTypes;

/**
 * @generated
 */
public class ThesisPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDrive1CreationTool());
		paletteContainer.add(createFile2CreationTool());
		paletteContainer.add(createFolder3CreationTool());
		paletteContainer.add(createShortcut4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createSync1CreationTool());
		paletteContainer.add(createTarget2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDrive1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ThesisElementTypes.Drive_2001);
		types.add(ThesisElementTypes.Drive_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Drive1CreationTool_title,
				Messages.Drive1CreationTool_desc, types);
		entry.setId("createDrive1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.Drive_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File2CreationTool_title,
				Messages.File2CreationTool_desc, Collections.singletonList(ThesisElementTypes.File_3004));
		entry.setId("createFile2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.File_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFolder3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Folder3CreationTool_title,
				Messages.Folder3CreationTool_desc, Collections.singletonList(ThesisElementTypes.Folder_3002));
		entry.setId("createFolder3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.Folder_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createShortcut4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Shortcut4CreationTool_title,
				Messages.Shortcut4CreationTool_desc, Collections.singletonList(ThesisElementTypes.Shortcut_3003));
		entry.setId("createShortcut4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.Shortcut_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSync1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Sync1CreationTool_title,
				Messages.Sync1CreationTool_desc, Collections.singletonList(ThesisElementTypes.Sync_4001));
		entry.setId("createSync1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.Sync_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTarget2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Target2CreationTool_title,
				Messages.Target2CreationTool_desc, Collections.singletonList(ThesisElementTypes.ShortcutTarget_4002));
		entry.setId("createTarget2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThesisElementTypes.getImageDescriptor(ThesisElementTypes.ShortcutTarget_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
