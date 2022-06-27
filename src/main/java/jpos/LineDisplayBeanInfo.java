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
// LineDisplayBeanInfo.java - Bean information for the JavaPOS LineDisplay
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class LineDisplayBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.LineDisplay.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.LineDisplay.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapBitmap"),
                makeProperty("CapBlink"),
                makeProperty("CapBlinkRate"),
                makeProperty("CapBrightness"),
                makeProperty("CapCharacterSet"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapCursorType"),
                makeProperty("CapCustomGlyph"),
                makeProperty("CapDescriptors"),
                makeProperty("CapHMarquee"),
                makeProperty("CapICharWait"),
                makeProperty("CapMapCharacterSet"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapReadBack"),
                makeProperty("CapReverse"),
                makeProperty("CapScreenMode"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVMarquee"),
                
                // Properties
                makeProperty("BlinkRate"),
                makeProperty("CharacterSet"),
                makeProperty("CharacterSetList"),
                makeProperty("Columns"),
                makeProperty("CurrentWindow"),
                makeProperty("CursorColumn"),
                makeProperty("CursorRow"),
                makeProperty("CursorType"),
                makeProperty("CursorUpdate"),
                makeProperty("CustomGlyphList"),
                makeProperty("DeviceBrightness"),
                makeProperty("DeviceColumns"),
                makeProperty("DeviceDescriptors"),
                makeProperty("DeviceRows"),
                makeProperty("DeviceWindows"),
                makeProperty("GlyphHeight"),
                makeProperty("GlyphWidth"),
                makeProperty("InterCharacterWait"),
                makeProperty("MapCharacterSet"),
                makeProperty("MarqueeFormat"),
                makeProperty("MarqueeRepeatWait"),
                makeProperty("MarqueeType"),
                makeProperty("MarqueeUnitWait"),
                makeProperty("MaximumX"),
                makeProperty("MaximumY"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("Rows"),
                makeProperty("ScreenMode"),
                makeProperty("ScreenModeList")
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
        return new EventSetDescriptor(jpos.LineDisplay.class,
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
