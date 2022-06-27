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
// ScaleBeanInfo.java - Bean information for the JavaPOS Scale
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;
import java.lang.reflect.*;

public class ScaleBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.Scale.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.Scale.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDisplay"),
                makeProperty("CapDisplayText"),
                makeProperty("CapFreezeValue"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapPriceCalculating"),
                makeProperty("CapReadLiveWeightWithTare"),
                makeProperty("CapSetPriceCalculationMode"),
                makeProperty("CapSetUnitPriceWithWeightUnit"),
                makeProperty("CapSpecialTare"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStatusUpdate"),
                makeProperty("CapTarePriority"),
                makeProperty("CapTareWeight"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapZeroScale"),
                
                // Properties
                makeProperty("AsyncMode"),
                makeProperty("AutoDisable"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("MaxDisplayTextChars"),
                makeProperty("MaximumWeight"),
                makeProperty("MinimumWeight"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("SalesPrice"),
                makeProperty("ScaleLiveWeight"),
                makeProperty("StatusNotify"),
                makeProperty("TareWeight"),
                makeProperty("UnitPrice"),
                makeProperty("WeightUnit"),
                makeProperty("ZeroValid")
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
        return new EventSetDescriptor(jpos.Scale.class,
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
