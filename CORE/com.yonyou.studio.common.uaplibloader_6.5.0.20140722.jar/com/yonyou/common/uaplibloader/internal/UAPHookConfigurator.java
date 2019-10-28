package com.yonyou.common.uaplibloader.internal;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;

import org.eclipse.osgi.internal.framework.EquinoxConfiguration;
import org.eclipse.osgi.internal.hookregistry.ClassLoaderHook;
import org.eclipse.osgi.internal.hookregistry.HookConfigurator;
import org.eclipse.osgi.internal.hookregistry.HookRegistry;
import org.eclipse.osgi.internal.loader.BundleLoader;
import org.eclipse.osgi.internal.loader.ModuleClassLoader;
import org.eclipse.osgi.internal.loader.classpath.ClasspathEntry;
import org.eclipse.osgi.internal.loader.classpath.ClasspathManager;
import org.eclipse.osgi.storage.BundleInfo.Generation;
import org.eclipse.osgi.storage.bundlefile.BundleEntry;

public class UAPHookConfigurator implements HookConfigurator {
	public void addHooks(HookRegistry hookRegistry) {
		
		hookRegistry.addClassLoaderHook(new ClassLoaderHook() {
			@Override
			public byte[] processClass(String name, byte[] classbytes,
					ClasspathEntry classpathEntry, BundleEntry entry,
					ClasspathManager manager) {
				return super.processClass(name, classbytes, classpathEntry, entry, manager);
			}

			@Override
			public boolean rejectTransformation(String name,
					byte[] transformedBytes, ClasspathEntry classpathEntry,
					BundleEntry entry, ClasspathManager manager) {
				// TODO Auto-generated method stub
				return super.rejectTransformation(name, transformedBytes, classpathEntry, entry,
						manager);
			}

			@Override
			public boolean addClassPathEntry(
					ArrayList<ClasspathEntry> cpEntries, String cp,
					ClasspathManager hostmanager, Generation sourceGeneration) {
				// TODO Auto-generated method stub
				return super.addClassPathEntry(cpEntries, cp, hostmanager, sourceGeneration);
			}

			@Override
			public String findLocalLibrary(Generation generation,
					String libName) {
				// TODO Auto-generated method stub
				return super.findLocalLibrary(generation, libName);
			}

			@Override
			public ModuleClassLoader createClassLoader(ClassLoader parent,
					EquinoxConfiguration configuration, BundleLoader delegate,
					Generation generation) {
				// TODO Auto-generated method stub
				return super.createClassLoader(parent, configuration, delegate, generation);
			}

			@Override
			public void classLoaderCreated(ModuleClassLoader classLoader) {
				// TODO Auto-generated method stub
				super.classLoaderCreated(classLoader);
			}

			@Override
			public Class<?> preFindClass(String name,
					ModuleClassLoader classLoader)
					throws ClassNotFoundException {
				// TODO Auto-generated method stub
				return super.preFindClass(name, classLoader);
			}

			@Override
			public Class<?> postFindClass(String name,
					ModuleClassLoader classLoader)
					throws ClassNotFoundException {
				// TODO Auto-generated method stub
				return super.postFindClass(name, classLoader);
			}

			@Override
			public URL preFindResource(String name,
					ModuleClassLoader classLoader)
					throws FileNotFoundException {
				// TODO Auto-generated method stub
				return super.preFindResource(name, classLoader);
			}

			@Override
			public URL postFindResource(String name,
					ModuleClassLoader classLoader)
					throws FileNotFoundException {
				// TODO Auto-generated method stub
				return super.postFindResource(name, classLoader);
			}

			@Override
			public Enumeration<URL> preFindResources(String name,
					ModuleClassLoader classLoader)
					throws FileNotFoundException {
				// TODO Auto-generated method stub
				return super.preFindResources(name, classLoader);
			}

			@Override
			public Enumeration<URL> postFindResources(String name,
					ModuleClassLoader classLoader)
					throws FileNotFoundException {
				// TODO Auto-generated method stub
				return super.postFindResources(name, classLoader);
			}

			@Override
			public String preFindLibrary(String name,
					ModuleClassLoader classLoader)
					throws FileNotFoundException {
				// TODO Auto-generated method stub
				return super.preFindLibrary(name, classLoader);
			}

			@Override
			public String postFindLibrary(String name,
					ModuleClassLoader classLoader) {
				// TODO Auto-generated method stub
				return super.postFindLibrary(name, classLoader);
			}

			@Override
			public void preFindLocalClass(String name, ClasspathManager manager)
					throws ClassNotFoundException {
				// TODO Auto-generated method stub
				super.preFindLocalClass(name, manager);
			}

			@Override
			public void postFindLocalClass(String name, Class<?> clazz,
					ClasspathManager manager) throws ClassNotFoundException {
				// TODO Auto-generated method stub
				super.postFindLocalClass(name, clazz, manager);
			}

			@Override
			public void preFindLocalResource(String name,
					ClasspathManager manager) {
				// TODO Auto-generated method stub
				super.preFindLocalResource(name, manager);
			}

			@Override
			public void postFindLocalResource(String name, URL resource,
					ClasspathManager manager) {
				// TODO Auto-generated method stub
				super.postFindLocalResource(name, resource, manager);
			}

			@Override
			public void recordClassDefine(String name, Class<?> clazz,
					byte[] classbytes, ClasspathEntry classpathEntry,
					BundleEntry entry, ClasspathManager manager) {
				// TODO Auto-generated method stub
				super.recordClassDefine(name, clazz, classbytes, classpathEntry, entry,
						manager);
			}

			@Override
			public ClassLoader getModuleClassLoaderParent(
					EquinoxConfiguration configuration) {
				// TODO Auto-generated method stub
				return super.getModuleClassLoaderParent(configuration);
			}

			@Override
			public boolean isProcessClassRecursionSupported() {
				// TODO Auto-generated method stub
				return super.isProcessClassRecursionSupported();
			}

			@Override
			public ClasspathEntry[] getClassPathEntries(String name,
					ClasspathManager manager) {
				// TODO Auto-generated method stub
				return super.getClassPathEntries(name, manager);
			}
			
		});
	}
}
