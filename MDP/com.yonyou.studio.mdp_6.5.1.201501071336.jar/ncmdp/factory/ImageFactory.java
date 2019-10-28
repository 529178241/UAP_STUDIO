package ncmdp.factory;

import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import ncmdp.NCMDPActivator;

public class ImageFactory {
	private static HashMap<String, ImageDescriptor> hmImageDesc = new HashMap();

	private static HashMap<String, Image> hmImage = new HashMap();

	public static ImageDescriptor getImageDesc(String path) {
		ImageDescriptor imgDesc = (ImageDescriptor) hmImageDesc.get(path);
		if (imgDesc == null) {
			imgDesc = createImageDescriptor(path);
			hmImageDesc.put(path, imgDesc);
		}
		return imgDesc;
	}

	public static Image getImage(String path) {
		Image img = (Image) hmImage.get(path);
		if (img == null) {
			ImageDescriptor imgDesc = getImageDesc(path);
			img = imgDesc.createImage();
			hmImage.put(path, img);
		}
		return img;
	}

	private static ImageDescriptor createImageDescriptor(String path) {
		// URL url =
		// NCMDPActivator.getDefault().getDescriptor().getInstallURL();
		ImageDescriptor id = null;
		try {
			id = ImageDescriptor.createFromURL(NCMDPActivator.getDefault()
					.getClass().getResource("/" + path));
		} catch (Exception exception) {
			id = ImageDescriptor.getMissingImageDescriptor();
		}
		return id;
	}

	public static Image getCheckedImage(boolean isChecked) {
		String path = null;
		if (isChecked) {
			path = "icons/checked.gif";
		} else {
			path = "icons/unChecked.gif";
		}
		return getImage(path);
	}

	public static ImageDescriptor getNewPropImage() {
		return getImageDesc("icons/action/new.png");
	}

	public static ImageDescriptor getDeletePropImage() {
		return getImageDesc("icons/action/delete.png");
	}

	public static ImageDescriptor getCopyPropImage() {
		return getImageDesc("icons/action/copy.png");
	}

	public static ImageDescriptor getPropDownImage() {
		return getImageDesc("icons/action/down.png");
	}

	public static ImageDescriptor getPastePropImage() {
		return getImageDesc("icons/action/paste.png");
	}

	public static ImageDescriptor getTopPropImage() {
		return getImageDesc("icons/action/top.png");
	}

	public static ImageDescriptor getPropUpImage() {
		return getImageDesc("icons/action/up.png");
	}

	public static ImageDescriptor getBottomPropImage() {
		return getImageDesc("icons/action/bottom.png");
	}

	public static Image getErrorImg() {
		return getImage("icons/error_tsk.gif");
	}

	public static ImageDescriptor getEntityImgDescriptor() {
		return getImageDesc("icons/new/entity.png");
	}

	public static ImageDescriptor getMBEEntityImgDescriptor() {
		return getImageDesc("icons/new/mbeentity.png");
	}

	public static ImageDescriptor getMBPOptImplImgDescriptor() {
		return getImageDesc("icons/new/mbpopItf.png");
	}

	public static ImageDescriptor getMBPActivityImgDescriptor() {
		return getImageDesc("icons/new/mbpActivity.png");
	}

	public static ImageDescriptor getMBPOperationImgDescriptor() {
		return getImageDesc("icons/new/mbpOperation.png");
	}

	public static Image getMobileFlagImgescriptor() {
		return getImage("icons/new/signal.png");
	}

	public static Image getEntityImg() {
		return getImage("icons/new/entity.png");
	}

	public static ImageDescriptor getValueObjectImgDescriptor() {
		return getImageDesc("icons/valueobject.png");
	}

	public static Image getValueObjectImg() {
		return getImage("icons/valueobject.png");
	}

	public static ImageDescriptor getAbstractClassImgDescriptor() {
		return getImageDesc("icons/AbstractClass.png");
	}

	public static Image getAbstractClassImg() {
		return getImage("icons/AbstractClass.png");
	}

	public static ImageDescriptor getServiceImgDescriptor() {
		return getImageDesc("icons/service.png");
	}

	public static Image getServiceImg() {
		return getImage("icons/service.png");
	}

	public static Image getOPItfImplImg() {
		return getImage("icons/OpImpl.png");
	}

	public static ImageDescriptor getOpItfImgDescriptor() {
		return getImageDesc("icons/new/opItf.png");
	}

	public static Image getOpItfImg() {
		return getImage("icons/new/opItf.png");
	}

	public static ImageDescriptor getBusiOperationDescriptor() {
		return getImageDesc("icons/new/busioperation.png");
	}

	public static Image getBusiOperationImg() {
		return getImage("icons/new/busioperation.png");
	}

	public static ImageDescriptor getBusiActivityDescriptor() {
		return getImageDesc("icons/new/busiActivity.png");
	}

	public static Image getBusiActivityImg() {
		return getImage("icons/new/busiActivity.png");
	}

	public static ImageDescriptor getEnumImgDescriptor() {
		return getImageDesc("icons/new/enum.png");
	}

	public static ImageDescriptor getNoteImgDescriptor() {
		return getImageDesc("icons/new/note.png");
	}

	public static Image getNoteImg() {
		return getImage("icons/new/note.png");
	}

	public static Image getEnumImg() {
		return getImage("icons/new/enum.png");
	}

	public static Image getAttrImage() {
		return getImage("icons/new/icon16_property.png");
	}

	public static Image getRefAttrImage() {
		return getImage("icons/new/icon16_property_q.png");
	}

	public static Image getCollectAttrImage() {
		return getImage("icons/collectionProperty.gif");
	}

	public static Image getkeyAttrImage() {
		return getImage("icons/new/icon16_key.png");
	}

	public static Image getDirectoryImage() {
		return getImage("icons/dir.png");
	}

	public static Image getFileImage() {
		return getImage("icons/new/bmf.png");
	}

	public static Image getProjectImage() {
		return getImage("icons/project.png");
	}

	public static Image getAttrTreeRootImage() {
		return getImage("icons/propTreeRoot.png");
	}

	public static Image getRefModuleTreeItemImage() {
		return getImage("icons/refModules.png");
	}

	public static Image getOperationImg() {
		return getImage("icons/new/icon16_jkOp.png");
	}

	public static Image getRefOperationImg() {
		return getImage("icons/new/icon16_ywOp.png");
	}

	public static Image getRefBusiOperationImg() {
		return getImage("icons/OpImpl.png");
	}

	public static Image getParameterImgDescriptor() {
		return getImage("icons/parameter.gif");
	}

	public static Image getBusiItfImg() {
		return getImage("icons/new/busiItf.png");
	}

	public static Image getXMLAttrImg() {
		return getImage("icons/xmlattr.png");
	}

	public static Image getBpfImg() {
		return getImage("icons/new/bpf.png");
	}

	public static Image getXMLElement() {
		return getImage("icons/xmlelement.png");
	}

	public static ImageDescriptor getRelationImgDescriptor() {
		return getImageDesc("icons/new/relation.png");
	}

	public static ImageDescriptor getDependImgDescriptor() {
		return getImageDesc("icons/new/depend.png");
	}

	public static ImageDescriptor getAggregationImgDescriptor() {
		return getImageDesc("icons/new/aggregation.png");
	}

	public static ImageDescriptor getConvergeImgDescriptor() {
		return getImageDesc("icons/convergeConnection.png");
	}

	public static ImageDescriptor getExtendImgDescriptor() {
		return getImageDesc("icons/new/extend.png");
	}

	public static ImageDescriptor getEditorImgDescriptor() {
		return getImageDesc("icons/ufsoft.png");
	}

	public static ImageDescriptor getNoteConImgDescriptor() {
		return getImageDesc("icons/new/notecon.png");
	}

	public static ImageDescriptor getBusiItfConImgDescriptor() {
		return getImageDesc("icons/new/busiItfcon.png");
	}

	public static ImageDescriptor getBusiItfImgDescriptor() {
		return getImageDesc("icons/new/busiItf.png");
	}

	public static ImageDescriptor getDeleteImageDescriptor() {
		return getImageDesc("icons/delete.gif");
	}

	public static ImageDescriptor getRefreshImageDescriptor() {
		return getImageDesc("icons/refresh.gif");
	}

	public static ImageDescriptor getUpdateStateImageDescriptor() {
		return getImageDesc("icons/updateState.gif");
	}

	public static ImageDescriptor getLocatorImageDescriptor() {
		return getImageDesc("icons/locator.gif");
	}

	public static ImageDescriptor getGridImageDescriptor() {
		return getImageDesc("icons/grid.gif");
	}

	public static ImageDescriptor getRulerImageDescriptor() {
		return getImageDesc("icons/ruler.gif");
	}

	public static Image getCheckErrorImg() {
		return getImage("icons/error_tsk.gif");
	}

	public static ImageDescriptor getBatchModifyImage() {
		return getImageDesc("icons/new/bmf.png");
	}

	public static ImageDescriptor getSetPKImage() {
		return getImageDesc("icons/new/icon16_key.png");
	}

	public static ImageDescriptor getSelectAllImage() {
		return getImageDesc("icons/all.png");
	}

	public static ImageDescriptor getSelectReverseImage() {
		return getImageDesc("icons/reverse.png");
	}

	public static ImageDescriptor getSelectReverse_uImage() {
		return getImageDesc("icons/action/reverse_u.png");
	}

	public static ImageDescriptor getSelectAll_uImage() {
		return getImageDesc("icons/action/all_u.png");
	}
}
