package jpos;

import jpos.config.JposEntry;
import jpos.config.simple.SimpleEntry;

/**
 * @author denis.kuniss
 *
 */
final class ControlsTestHelper {
	
	private ControlsTestHelper() {
		// to avoid instantiation
	}

	/**
	 * Creates a {@link JposEntry} for the given open name, category and JavaPOS version and
	 * let property "serviceClass" point to "jpos.services.{openName}" and
	 * property "serviceInstanceFactoryClass" point to "jpos.TestServiceInstanceFactory".
	 * 
	 * @param category the JavaPOS category name, will be assigned to property "deviceCategory"  
	 * @param openName the open name, will be assigned to property "logicalName"
	 * @param version the JavaPOS version, e.g. "1.14", will be assigned to property "jposVersion"
	 * @return a corresponding {@link JposEntry} object
	 */
	static JposEntry createJposEntry(String category, String openName, String version) {
		JposEntry entry = new SimpleEntry();
		entry.addProperty(JposEntry.LOGICAL_NAME_PROP_NAME, openName);
		entry.addProperty(JposEntry.DEVICE_CATEGORY_PROP_NAME, category);
		entry.addProperty(JposEntry.JPOS_VERSION_PROP_NAME, version);
		
		entry.addProperty(JposEntry.SERVICE_CLASS_PROP_NAME, "jpos.services." + openName);
		entry.addProperty(JposEntry.SI_FACTORY_CLASS_PROP_NAME, "jpos.TestServiceInstanceFactory");

		entry.addProperty(JposEntry.PRODUCT_DESCRIPTION_PROP_NAME, "myProductDescription");
		entry.addProperty(JposEntry.PRODUCT_NAME_PROP_NAME, "myProductName");
		entry.addProperty(JposEntry.PRODUCT_URL_PROP_NAME, "https://javapos.org");
		entry.addProperty(JposEntry.VENDOR_NAME_PROP_NAME, "jpos.org");
		entry.addProperty(JposEntry.VENDOR_URL_PROP_NAME, "https://javapos.org");
		return entry;
	}


}
