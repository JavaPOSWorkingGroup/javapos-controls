//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------------
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
//
// CheckScannerBeanInfo.java - Bean information for the JavaPOS CheckScanner
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class CheckScannerBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.CheckScanner.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.CheckScanner.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAutoContrast"),
                makeProperty("CapAutoGenerateFileID"),
                makeProperty("CapAutoGenerateImageTagData"),
                makeProperty("CapAutoSize"),
                makeProperty("CapColor"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapConcurrentMICR"),
                makeProperty("CapContrast"),
                makeProperty("CapDefineCropArea"),
                makeProperty("CapImageFormat"),
                makeProperty("CapImageTagData"),
                makeProperty("CapMICRDevice"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStoreImageFiles"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapValidationDevice"),
                
                // Properties
                makeProperty("AutoDisable"),
                makeProperty("Color"),
                makeProperty("ConcurrentMICR"),
                makeProperty("Contrast"),
                makeProperty("CropAreaCount"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("DocumentHeight"),
                makeProperty("DocumentWidth"),
                makeProperty("FileID"),
                makeProperty("FileIndex"),
                makeProperty("ImageData"),
                makeProperty("ImageFormat"),
                makeProperty("ImageMemoryStatus"),
                makeProperty("ImageTagData"),
                makeProperty("MapMode"),
                makeProperty("MaxCropAreas"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("Quality"),
                makeProperty("QualityList"),
                makeProperty("RemainingImagesEstimate")
            };

            return properties;
        }
        catch(Exception e)
        {
            return super.getPropertyDescriptors();
        }
    }

    public EventSetDescriptor makeEvent(String eventName)
        throws IntrospectionException, ClassNotFoundException
    {
        String listener = "jpos.events." + eventName + "Listener";
        return new EventSetDescriptor(jpos.CheckScanner.class,
                                      eventName,
                                      Class.forName(listener),
                                      eventName + "Occurred");
    }

    public EventSetDescriptor[] getEventSetDescriptors()
    {
        try
        {
            EventSetDescriptor[] events =
            {
                makeEvent("Data"),
                makeEvent("DirectIO"),
                makeEvent("Error"),
                makeEvent("StatusUpdate")
            };
            
            return events;
        }
        catch(Exception e)
        {
            return super.getEventSetDescriptors();
        }
    }
}
