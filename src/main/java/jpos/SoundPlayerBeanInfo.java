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
// SoundPlayerBeanInfo.java - Bean information for the JavaPOS SoundPlayer
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class SoundPlayerBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.SoundPlayer.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.SoundPlayer.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAssociatedHardTotalsDevice"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapMultiPlay"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapSoundTypeList"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStorage"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVolume"),
                
                // Properties
                makeProperty("DeviceSoundList"),
                makeProperty("OutputID"),
                makeProperty("OutputIDList"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("Storage"),
                makeProperty("Volume")
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
        return new EventSetDescriptor(jpos.SoundPlayer.class,
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
