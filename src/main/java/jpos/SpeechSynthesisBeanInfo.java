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
// SpeechSynthesisBeanInfo.java - Bean information for the JavaPOS SpeechSynthesis
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class SpeechSynthesisBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.SpeechSynthesis.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.SpeechSynthesis.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapLanguage"),
                makeProperty("CapPitch"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapSpeed"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVoice"),
                makeProperty("CapVolume"),
                
                // Properties
                makeProperty("Language"),
                makeProperty("LanguageList"),
                makeProperty("OutputID"),
                makeProperty("OutputIDList"),
                makeProperty("Pitch"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("Speed"),
                makeProperty("Voice"),
                makeProperty("VoiceList"),
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
        return new EventSetDescriptor(jpos.SpeechSynthesis.class,
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
