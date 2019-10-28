package ncmdp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import ncmdp.tool.NCMDPTool;

public class NCMDPActivator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "com.yonyou.studio.mdp";
	private static NCMDPActivator plugin;
	public NCMDPActivator() {
		plugin = this;
	}
	public static String getPluginID() {
		return "com.yonyou.studio.mdp";
	}
	private static URL installLocation = null;
	public void start(BundleContext context) throws Exception {
		super.start(context);
		String path = System.getProperty("nc.server.location");
		if (path == null) {
			System.setProperty("nc.server.location", NCMDPTool.getNCHome());
		}
	}
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	public static NCMDPActivator getDefault() {
		return plugin;
	}
	public NCMDPActivator getDescriptor() {
		return plugin;
	}
	public static URL getInstallURL() {
		String installArea = System.getProperty("osgi.install.area");
		if (installArea != null) {
			installLocation = buildURL(installArea, true);
			if (installLocation == null)
				throw new IllegalStateException(
						"Install location is invalid: " + installArea);
			System.setProperty("osgi.install.area",
					installLocation.toExternalForm());
			return installLocation;
		}
		return null;
	}
	private static URL buildURL(String spec, boolean trailingSlash) {
		if (spec == null)
			return null;
		if (File.separatorChar == '\\')
			spec = spec.trim();
		boolean isFile = spec.startsWith("file:");
		try {
			if (isFile) {
				File toAdjust = new File(spec.substring(5));
				toAdjust = resolveFile(toAdjust);
				if (toAdjust.isDirectory())
					return adjustTrailingSlash(toAdjust.toURL(), trailingSlash);
				return toAdjust.toURL();
			}
			return new URL(spec);
		} catch (MalformedURLException localMalformedURLException1) {
			if (isFile)
				return null;
			try {
				File toAdjust = new File(spec);
				if (toAdjust.isDirectory())
					return adjustTrailingSlash(toAdjust.toURL(), trailingSlash);
				return toAdjust.toURL();
			} catch (MalformedURLException localMalformedURLException2) {
			}
		}
		return null;
	}

	private static File resolveFile(File toAdjust) {
		if (!toAdjust.isAbsolute()) {
			String installArea = System.getProperty("osgi.install.area");
			if (installArea != null) {
				if (installArea.startsWith("file:"))
					toAdjust = new File(installArea.substring(5),
							toAdjust.getPath());
				else if (new File(installArea).exists())
					toAdjust = new File(installArea, toAdjust.getPath());
			}
		}
		return toAdjust;
	}

	private static URL adjustTrailingSlash(URL url, boolean trailingSlash)
			throws MalformedURLException {
		String file = url.getFile();
		if (trailingSlash == file.endsWith("/"))
			return url;
		file = trailingSlash
				? file + "/"
				: file.substring(0, file.length() - 1);
		return new URL(url.getProtocol(), url.getHost(), file);
	}

}
