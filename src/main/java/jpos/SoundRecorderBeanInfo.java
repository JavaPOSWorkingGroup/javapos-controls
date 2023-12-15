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
// SoundRecorderBeanInfo.java - Bean information for the JavaPOS SoundRecorder
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class SoundRecorderBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.SoundRecorder.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.SoundRecorder.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAssociatedHardTotalsDevice"),
                makeProperty("CapChannel"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapRecordingLevel"),
                makeProperty("CapSamplingRate"),
                makeProperty("CapSoundType"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStorage"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AutoDisable"),
                makeProperty("Channel"),
                makeProperty("ChannelList"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("RecordingLevel"),
                makeProperty("RemainingRecordingTimeInSec"),
                makeProperty("SamplingRate"),
                makeProperty("SamplingRateList"),
                makeProperty("SoundData"),
                makeProperty("SoundType"),
                makeProperty("SoundTypeList"),
                makeProperty("Storage")
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
        return new EventSetDescriptor(jpos.SoundRecorder.class,
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
