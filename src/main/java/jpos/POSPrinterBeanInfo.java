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
// POSPrinterBeanInfo.java - Bean information for the JavaPOS POSPrinter
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;
import java.lang.reflect.*;

public class POSPrinterBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.POSPrinter.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.POSPrinter.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCharacterSet"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapConcurrentJrnRec"),
                makeProperty("CapConcurrentJrnSlp"),
                makeProperty("CapConcurrentPageMode"),
                makeProperty("CapConcurrentRecSlp"),
                makeProperty("CapCoverSensor"),
                makeProperty("CapJrn2Color"),
                makeProperty("CapJrnBold"),
                makeProperty("CapJrnCartridgeSensor"),
                makeProperty("CapJrnColor"),
                makeProperty("CapJrnDhigh"),
                makeProperty("CapJrnDwide"),
                makeProperty("CapJrnDwideDhigh"),
                makeProperty("CapJrnEmptySensor"),
                makeProperty("CapJrnItalic"),
                makeProperty("CapJrnNearEndSensor"),
                makeProperty("CapJrnPresent"),
                makeProperty("CapJrnUnderline"),
                makeProperty("CapMapCharacterSet"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapRec2Color"),
                makeProperty("CapRecBarCode"),
                makeProperty("CapRecBitmap"),
                makeProperty("CapRecBold"),
                makeProperty("CapRecCartridgeSensor"),
                makeProperty("CapRecColor"),
                makeProperty("CapRecDhigh"),
                makeProperty("CapRecDwide"),
                makeProperty("CapRecDwideDhigh"),
                makeProperty("CapRecEmptySensor"),
                makeProperty("CapRecItalic"),
                makeProperty("CapRecLeft90"),
                makeProperty("CapRecMarkFeed"),
                makeProperty("CapRecNearEndSensor"),
                makeProperty("CapRecPageMode"),
                makeProperty("CapRecPapercut"),
                makeProperty("CapRecPresent"),
                makeProperty("CapRecRight90"),
                makeProperty("CapRecRotate180"),
                makeProperty("CapRecRuledLine"),
                makeProperty("CapRecStamp"),
                makeProperty("CapRecUnderline"),
                makeProperty("CapSlp2Color"),
                makeProperty("CapSlpBarCode"),
                makeProperty("CapSlpBitmap"),
                makeProperty("CapSlpBold"),
                makeProperty("CapSlpBothSidesPrint"),
                makeProperty("CapSlpCartridgeSensor"),
                makeProperty("CapSlpColor"),
                makeProperty("CapSlpDhigh"),
                makeProperty("CapSlpDwide"),
                makeProperty("CapSlpDwideDhigh"),
                makeProperty("CapSlpEmptySensor"),
                makeProperty("CapSlpFullslip"),
                makeProperty("CapSlpItalic"),
                makeProperty("CapSlpLeft90"),
                makeProperty("CapSlpNearEndSensor"),
                makeProperty("CapSlpPageMode"),
                makeProperty("CapSlpPresent"),
                makeProperty("CapSlpRight90"),
                makeProperty("CapSlpRotate180"),
                makeProperty("CapSlpRuledLine"),
                makeProperty("CapSlpUnderline"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapTransaction"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AsyncMode"),
                makeProperty("CartridgeNotify"),
                makeProperty("CharacterSet"),
                makeProperty("CharacterSetList"),
                makeProperty("CoverOpen"),
                makeProperty("ErrorLevel"),
                makeProperty("ErrorStation"),
                makeProperty("ErrorString"),
                makeProperty("FlagWhenIdle"),
                makeProperty("FontTypefaceList"),
                makeProperty("JrnCartridgeState"),
                makeProperty("JrnCurrentCartridge"),
                makeProperty("JrnEmpty"),
                makeProperty("JrnLetterQuality"),
                makeProperty("JrnLineChars"),
                makeProperty("JrnLineCharsList"),
                makeProperty("JrnLineHeight"),
                makeProperty("JrnLineSpacing"),
                makeProperty("JrnLineWidth"),
                makeProperty("JrnNearEnd"),
                makeProperty("MapCharacterSet"),
                makeProperty("MapMode"),
                makeProperty("OutputID"),
                makeProperty("PageModeArea"),
                makeProperty("PageModeDescriptor"),
                makeProperty("PageModeHorizontalPosition"),
                makeProperty("PageModePrintArea"),
                makeProperty("PageModePrintDirection"),
                makeProperty("PageModeStation"),
                makeProperty("PageModeVerticalPosition"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("RecBarCodeRotationList"),
                makeProperty("RecBitmapRotationList"),
                makeProperty("RecCartridgeState"),
                makeProperty("RecCurrentCartridge"),
                makeProperty("RecEmpty"),
                makeProperty("RecLetterQuality"),
                makeProperty("RecLineChars"),
                makeProperty("RecLineCharsList"),
                makeProperty("RecLineHeight"),
                makeProperty("RecLineSpacing"),
                makeProperty("RecLineWidth"),
                makeProperty("RecLinesToPaperCut"),
                makeProperty("RecNearEnd"),
                makeProperty("RecSidewaysMaxChars"),
                makeProperty("RecSidewaysMaxLines"),
                makeProperty("RotateSpecial"),
                makeProperty("SlpBarCodeRotationList"),
                makeProperty("SlpBitmapRotationList"),
                makeProperty("SlpCartridgeState"),
                makeProperty("SlpCurrentCartridge"),
                makeProperty("SlpEmpty"),
                makeProperty("SlpLetterQuality"),
                makeProperty("SlpLineChars"),
                makeProperty("SlpLineCharsList"),
                makeProperty("SlpLineHeight"),
                makeProperty("SlpLineSpacing"),
                makeProperty("SlpLineWidth"),
                makeProperty("SlpLinesNearEndToEnd"),
                makeProperty("SlpMaxLines"),
                makeProperty("SlpNearEnd"),
                makeProperty("SlpPrintSide"),
                makeProperty("SlpSidewaysMaxChars"),
                makeProperty("SlpSidewaysMaxLines")
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
        return new EventSetDescriptor(jpos.POSPrinter.class,
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
