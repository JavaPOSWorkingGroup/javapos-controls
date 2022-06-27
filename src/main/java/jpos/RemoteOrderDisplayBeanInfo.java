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
// RemoteOrderDisplayBeanInfo.java - Bean information for the JavaPOS RemoteOrderDisplay
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class RemoteOrderDisplayBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.RemoteOrderDisplay.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.RemoteOrderDisplay.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapMapCharacterSet"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapSelectCharacterSet"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapTone"),
                makeProperty("CapTouch"),
                makeProperty("CapTransaction"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AsyncMode"),
                makeProperty("AutoToneDuration"),
                makeProperty("AutoToneFrequency"),
                makeProperty("CharacterSet"),
                makeProperty("CharacterSetList"),
                makeProperty("Clocks"),
                makeProperty("CurrentUnitID"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("ErrorString"),
                makeProperty("ErrorUnits"),
                makeProperty("EventString"),
                makeProperty("EventType"),
                makeProperty("EventUnitID"),
                makeProperty("EventUnits"),
                makeProperty("MapCharacterSet"),
                makeProperty("OutputID"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("SystemClocks"),
                makeProperty("SystemVideoSaveBuffers"),
                makeProperty("Timeout"),
                makeProperty("UnitsOnline"),
                makeProperty("VideoDataCount"),
                makeProperty("VideoMode"),
                makeProperty("VideoModesList"),
                makeProperty("VideoSaveBuffers")
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
        return new EventSetDescriptor(jpos.RemoteOrderDisplay.class,
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
                makeEvent("OutputComplete"),
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
